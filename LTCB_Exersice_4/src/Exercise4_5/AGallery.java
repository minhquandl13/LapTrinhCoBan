package Exercise4_5;

public abstract class AGallery {
    public String fileName;
    public int fileSize;

    /**
     * @param fileName fileName
     * @param fileSize fileSize
     */

    public AGallery(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    /**
     * @param networkSpeed
     *
     * Computes how long it takes to download a file at some network connection speed, typically
     * given in bytes per second
     * <p>
     * Example: <br/>
     * AGallery sound = new Sound("xyz", 2, 1); <br/>
     * sound.timeToDownload(1000.0) --> time to download = 900
     *
     * @return timeToDownload
     * @see double
     */
    public double timeToDownload(double networkSpeed) {
        return this.fileSize / networkSpeed;
    }

    /**
     * @param maximumSize
     * Determines whether the file is smaller than some given maximum size that can be mailed as an attachment
     * <p>
     * Example: <br/>
     * AGallery sound = new Sound("xyz", 2, 1); <br/>
     * sound.smallerThan(4) --> True
     *
     * @return true or false
     * @see boolean
     */
    public boolean smallerThan(int maximumSize) {
        return this.fileSize < maximumSize;
    }

    /**
     * @param givenName
     * Determines whether the name of a file is the same as some givens name.
     * <p>
     * Example: <br/>
     * AGallery sound = new Sound("xyz", 2, 1); <br/>
     * sound.sameName("abc") --> False
     *
     * @return true or false
     * @see boolean
     */
    public boolean sameName(String givenName) {
        return this.fileName.equals(givenName);
    }
}
