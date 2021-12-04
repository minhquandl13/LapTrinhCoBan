package Exercise4_2;

public class Images extends Gallery {
        private int height;
        private int width;
        private String quality;

    public Images(String nameForSourceFile, double sizes,
                  int height, int width, String quality) {

        super(nameForSourceFile, sizes);
        this.height = height;
        this.width = width;
        this.quality = quality;
    }
}

