package Exercise4_5;

public class Sound extends AGallery {
    public int playingTime;

    public Sound(String fileName, int fileSize, int playingTime) {
        super(fileName, fileSize);
        this.playingTime = playingTime;
    }

    @Override
    public double timeToDownload(double networkSpeed) {
        return this.fileSize / networkSpeed;
    }

    @Override
    public boolean smallerThan(int maximumSize) {
        return this.fileSize < maximumSize;
    }

    @Override
    public boolean sameName(String givenName) {
        return this.fileName.equals(givenName);
    }
}
