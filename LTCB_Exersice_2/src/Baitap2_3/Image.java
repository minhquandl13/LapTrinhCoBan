package Baitap2_3;

// represent information about an image
public class Image {
    int width;          //pixels
    int height;         //pixels
    String source;      // file name
    String quality;     // informal

    /**
     * @param width
     * @param height
     * @param source
     * @param quality
     */
    public Image(int width, int height, String source, String quality) {
        this.width = width;
        this.height = height;
        this.source = source;
        this.quality = quality;
    }

    /**
     * determines whether the image’s height is larger than its width
     *
     * @return height > width
     * Example new Image(1920, 1080, ".png", "high").isPortrait() : false
     */
    public boolean isPortrait() {
        return this.height > this.width;
    }

    /**
     * computes how many pixels the image contains
     *
     * @return width * height
     * Example Image imageA = new Image(1920, 1080, ".png", "high")
     * Image imageB= new Image(1920, 1080, ".png", "high")
     * Expect imageA.size() = imageB.size()
     */
    public int size() {
        return this.width * this.height;
    }

    /**
     * determines whether one image contains more pixels than some other image
     *
     * @param otherImage
     * @return size > otherImage size
     * Example Image imageA = new Image(1920, 1080, ".png", "high")
     * Image otherImageA = new Image(1280, 720, ".jpg", "medium")
     * Expect imageA size > otherImageA size
     */
    public boolean isLarger(Image otherImage) {
        return this.size() > otherImage.size();
    }

    /**
     * Support size method
     *
     * @param object
     * @return @param of Image  = @param of otherImage
     * Example Image imageA = new Image(1920, 1080, ".png", "high")
     * Image imageB = new Image(1920, 1080, ".png", "high")
     */

    public boolean equals(Object object) {
        if (!(object instanceof Image)) {
            return false;
        }

        Image otherImage = (Image) object;
        return this.width == otherImage.width
                && this.height == otherImage.height
                && this.source.equals(otherImage.source)
                && this.quality.equals(otherImage.quality);
    }


    /**
     * determines whether this image is the same as a given one
     *
     * @param other
     * @return equals otherImage
     * Example Image imageA = new Image(1920, 1080, ".png", "high") and Image imageB= new Image(1920, 1080, ".png", "high")
     * Expect true
     */
    public boolean same(Image other) {
        return this.equals(other);
    }

    /**
     * produces one of three strings, depending on the number of pixels in the image.
     *
     * @return "small", "large", "medium"
     * Example   Image imageA = new Image(1, 1080, ".png", "small") : "small"
     */
    public String sizeString() {
        int size = this.size();

        if (size <= 10_000) {
            return "small";
        }

        if (size > 1_000_000) {
            return "large";
        }

        return "medium";
    }
}
