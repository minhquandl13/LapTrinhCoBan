package TestExercise3_2;

import Baitap3_2.Author;
import Baitap3_2.BookstoreEmployee;
import junit.framework.TestCase;

public class TestBookstoreEmployee extends TestCase {
    public void test_BookstoreEmployee() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Matthias Felleisen", 1960);
        BookstoreEmployee htdch = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee aljafp = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);
    }

    public void test_CurrentBook() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Danial P. Friedman", 1939);
        BookstoreEmployee htdch = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee aljafp = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);

        assertTrue(htdch.currentBook());
        assertFalse(aljafp.currentBook());
    }

    public void test_CurrentAuthor() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Danial P. Friedman", 1939);
        BookstoreEmployee htdch = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee aljafp = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);

        assertTrue(htdch.currentAuthor());
        assertFalse(aljafp.currentAuthor());
    }

    public void test_ThisAuthor() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Danial P. Friedman", 1939);
        BookstoreEmployee htdch = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee aljafp = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);

        assertTrue(htdch.thisAuthor(felleisen));
        assertFalse(htdch.thisAuthor(friedman));
    }
}
