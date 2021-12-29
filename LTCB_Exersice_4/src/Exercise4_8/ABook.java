package Exercise4_8;

public abstract class ABook {
    protected String title;
    protected String author;
    protected double price;
    protected int publicationYear;

    public ABook(String title, String author, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public abstract double salePrice();

    public boolean cheaperThan(ABook otherBook) {
        return this.salePrice() < otherBook.salePrice();
    }

    public boolean sameAuthor(ABook otherBook) {
        return this.author.equals(otherBook.author);
    }
}
