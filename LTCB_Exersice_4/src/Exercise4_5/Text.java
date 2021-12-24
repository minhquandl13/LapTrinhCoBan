package Exercise4_5;

public class Text extends AGallery {
    public int numberOfLines;

    public Text(String fileName, int fileSize, int numberOfLines) {
        super(fileName, fileSize);
        this.numberOfLines = numberOfLines;
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
