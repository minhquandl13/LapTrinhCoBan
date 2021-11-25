package TestExercise3_2;

import Baitap3_2.Author;
import Baitap3_2.BookstoreEmployee;
import junit.framework.TestCase;

public class TestBookstoreEmployee extends TestCase {

    private Author doraemonAuthor = new Author("Doraemon Author", 1960);
    private Author dragonballAuthor = new Author("Dragonball Author", 1939);
    private Author yaibaAuthor = new Author("Yaiba Author", 1970);

    public void test_BookstoreEmployee() {
        BookstoreEmployee doraemonBook = new BookstoreEmployee("Doraemon", 0.0, 2004, doraemonAuthor);
        BookstoreEmployee dragonballBook = new BookstoreEmployee("Dragonball", 25.9, 1998, dragonballAuthor);

        assertNotNull(doraemonBook);
        assertNotNull(dragonballBook);
    }

    public void test_CurrentBook() {
        BookstoreEmployee doraemonBook = new BookstoreEmployee("Doraemon", 0.0, 2004, dragonballAuthor);
        BookstoreEmployee dragonballBook = new BookstoreEmployee("Dragonball", 25.9, 1998, dragonballAuthor);

        assertTrue(doraemonBook.currentBook());
        assertFalse(dragonballBook.currentBook());
    }

    public void test_CurrentAuthor() {
        BookstoreEmployee doraemonBook = new BookstoreEmployee("Doraemon", 0.0, 2004, dragonballAuthor);
        BookstoreEmployee dragonballBook = new BookstoreEmployee("Dragonball", 25.9, 1998, dragonballAuthor);

        assertTrue(doraemonBook.currentAuthor());
        assertFalse(dragonballBook.currentAuthor());
    }

    public void test_ThisAuthor() {
        BookstoreEmployee doraemonBook = new BookstoreEmployee("Doraemon", 0.0, 2004, dragonballAuthor);
        BookstoreEmployee dragonballBook = new BookstoreEmployee("Dragonball", 25.9, 1998, dragonballAuthor);

        assertTrue(doraemonBook.thisAuthor(doraemonAuthor));
        assertFalse(dragonballBook.thisAuthor(dragonballAuthor));
    }

    public void test_SameGeneration() {
        BookstoreEmployee doraemonBook = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, doraemonAuthor);
        BookstoreEmployee dragonballBook = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, dragonballAuthor);
        BookstoreEmployee yaibaBook = new BookstoreEmployee("qwert", 10.0, 2000, yaibaAuthor);

        assertFalse(doraemonBook.sameGeneration(dragonballBook));
        assertTrue(doraemonBook.sameGeneration(yaibaBook));
    }

    public void test_SameAuthor() {
        BookstoreEmployee doraemonBook = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, doraemonAuthor);
        BookstoreEmployee dragonballBook = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, dragonballAuthor);
        BookstoreEmployee yaibaBook = new BookstoreEmployee("qwert", 10.0, 2000, yaibaAuthor);
        BookstoreEmployee doraemonBook2 = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, doraemonAuthor);

        assertFalse(doraemonBook.sameAuthor(dragonballBook));
        assertTrue(doraemonBook.sameAuthor(doraemonBook2));
    }

    public void test_ThisAuthor2() {
        BookstoreEmployee doraemonBook = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, doraemonAuthor);
        BookstoreEmployee dragonballBook = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, dragonballAuthor);
        BookstoreEmployee yaibaBook = new BookstoreEmployee("qwert", 10.0, 2000, yaibaAuthor);

        assertFalse(doraemonBook.thisAuthor2(dragonballAuthor));
    }

    public void test_SameAuthor2() {
        BookstoreEmployee doraemonBook = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, doraemonAuthor);
        BookstoreEmployee dragonballBook = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, dragonballAuthor);
        BookstoreEmployee yaibaBook = new BookstoreEmployee("qwert", 10.0, 2000, yaibaAuthor);

        assertFalse(doraemonBook.sameAuthor2(dragonballBook));
    }
}
