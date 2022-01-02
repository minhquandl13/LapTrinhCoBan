package Exercise4_8;

public abstract class ABook {
    protected String title;
    protected String author;
    protected double price;
    protected int publicationYear;

    /**
     * @param title           title
     * @param author          author
     * @param price           price
     * @param publicationYear publicationYear
     */
    public ABook(String title, String author, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    /**
     * Computes the sale price of each book
     * <p>
     * Example: <br/>
     * ABook doraemon = new Hardcover("Doraemon", "Doraemon Author", 10.0, 1990); <br/>
     * doraemon.salePrice() --> sale price = 8.0
     *
     * @return salePrice
     * @see double
     */
    public abstract double salePrice();

    /**
     * Determines whether a book is cheaper than another book
     * <p>
     * Example: <br/>
     * ABook doraemon = new Hardcover("Doraemon", "Doraemon Author", 10.0, 1990); <br/>
     * ABook conan = new Hardcover("Conan", "Conan Author", 1.0, 1991); <br/>
     * doraemon.cheaperThan(sorbet) --> False
     *
     * @param otherBook otherBook
     * @return true or false
     * @see boolean
     */
    public boolean cheaperThan(ABook otherBook) {
        return this.salePrice() < otherBook.salePrice();
    }

    /**
     * Determines whether a book was written by some givens author which wrote another book.
     * <p>
     * Example: <br/>
     * ABook doraemon = new Hardcover("Doraemon", "Doraemon Author", 10.0, 1990); <br/>
     * ABook conan = new Hardcover("Conan", "Conan Author", 1.0, 1991); <br/>
     * doraemon.sameAuthor(conan) --> False
     *
     * @param otherBook otherBook
     * @return true or false
     * @see boolean
     */
    public boolean sameAuthor(ABook otherBook) {
        return this.author.equals(otherBook.author);
    }
}
