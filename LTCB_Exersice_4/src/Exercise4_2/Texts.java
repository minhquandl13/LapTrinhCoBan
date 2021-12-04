package Exercise4_2;

public class Texts extends Gallery {
    private int numberOfLine;

    public Texts(String nameForSourceFile, double sizes, int numberOfLine) {

        super(nameForSourceFile, sizes);
        this.numberOfLine = numberOfLine;
    }
}
