package Baitap3_2;

public class BookstoreEmployee {
    private String title;
    private double price;
    private int yearOfPublication;
    private Author author;

    /**
     * @param title
     * @param price
     * @param yearOfPublication
     * @param author
     */
    public BookstoreEmployee(String title, double price, int yearOfPublication, Author author) {
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    /**
     * Checks whether the book was published in 2004 or 2003
     *
     * @return yearOfPublication = (2003 or 2004)
     * Example :
     * Author felleisen = new Author("Matthias Felleisen", 1960)
     * BookstoreEmployee htdch = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen)
     * htdch.currentBook() --) Result : true
     */
    public boolean currentBook() {
        if (this.yearOfPublication == 2003 || this.yearOfPublication == 2004) {
            return true;
        }

        return false;
    }

    /**
     * Determines whether a book was written by a current author (born after 1940)
     *
     * @return author
     * Example :
     * Author felleisen = new Author("Matthias Felleisen", 1960)
     * BookstoreEmployee htdch = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen)
     * htdch.currentAuthor() --) Result : true
     */
    public boolean currentAuthor() {
        return this.author.currentAuthor();
    }

    /**
     * Determines whether a book was written by the specified author
     * @return author same otherAuthor
     * Example :
     * Author felleisen = new Author("Matthias Felleisen", 1960)
     * BookstoreEmployee htdch = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen)
     * htdch.thisAuthor(felleisen) --) Result : true
     */
    public boolean thisAuthor(Author otherAuthor) {
        return this.author.same(otherAuthor);
    }

    /**
     * Determines whether two books were written by two authors born less than 10 year apart
     * @return
     */
    public boolean sameGeneration() {
        return this.author.same();
    }
}
