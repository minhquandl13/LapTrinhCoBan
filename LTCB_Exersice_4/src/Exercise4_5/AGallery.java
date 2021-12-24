package Exercise4_5;

public abstract class AGallery {
    public String fileName;
    public int fileSize;

    public AGallery(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public double timeToDownload(double networkSpeed) {
        return this.fileSize / networkSpeed;
    }

    public boolean smallerThan(int maximumSize) {
        return this.fileSize < maximumSize;
    }

    public boolean sameName(String givenName) {
        return this.fileName.equals(givenName);
    }
}
