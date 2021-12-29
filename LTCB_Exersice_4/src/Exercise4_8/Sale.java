package Exercise4_8;

public class Sale extends ABook {
    public Sale(String title, String author, double price, int publicationYear) {
        super(title, author, price, publicationYear);
    }

    @Override
    public double salePrice() {
        return this.price * 0.5;
    }

    @Override
    public boolean cheaperThan(ABook otherBook) {
        return this.salePrice() < otherBook.salePrice();
    }

    @Override
    public boolean sameAuthor(ABook otherBook) {
        return this.author.equals(otherBook.author);
    }
}
