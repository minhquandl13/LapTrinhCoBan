package Exercise4_5;

public class Image extends AGallery {
    public int height;
    public int width;
    public String quality;

    public Image(String fileName, int fileSize, int height, int width, String quality) {
        super(fileName, fileSize);
        this.height = height;
        this.width = width;
        this.quality = quality;
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
