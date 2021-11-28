package TestExercise3_2;

import Baitap3_2.Author;

import Baitap3_2.BirthDate;
import Baitap3_2.BookstoreEmployee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBookstoreEmployee {
    private BirthDate authorDoraemon;
    private BirthDate authorDragonball;
    private BirthDate authorYaiba;


    private Author doraemonAuthor;
    private Author dragonballAuthor;
    private Author yaibaAuthor;

    private BookstoreEmployee doraemonBook;
    private BookstoreEmployee dragonballBook;
    private BookstoreEmployee yaibaBook;

    @Before
    public void setUpTestcase() {
        authorDoraemon = new BirthDate(1, 3, 1970);
        authorDragonball = new BirthDate(3, 6, 1975);
        authorYaiba = new BirthDate(1, 3, 2003);

        doraemonAuthor = new Author("Doraemon Author", 1960, authorDoraemon);
        dragonballAuthor = new Author("Dragonball Author", 1939, authorDragonball);
        yaibaAuthor = new Author("Yaiba Author", 1970, authorYaiba);

        doraemonBook = new BookstoreEmployee("Doraemon", 0.0, 2004, doraemonAuthor);
        dragonballBook = new BookstoreEmployee("Dragonball", 25.9, 1998, dragonballAuthor);
        yaibaBook = new BookstoreEmployee("Yaiba", 10.0, 2000, yaibaAuthor);

    }

    @Test
    public void test_BookstoreEmployee() {
        assertNotNull(doraemonBook);
        assertNotNull(dragonballBook);
    }

    @Test
    public void test_CurrentBook() {
        assertTrue(doraemonBook.currentBook());
        assertFalse(dragonballBook.currentBook());
    }

    @Test
    public void test_CurrentAuthor() {
        assertTrue(doraemonBook.currentAuthor());
        assertFalse(dragonballBook.currentAuthor());
    }

    @Test
    public void test_ThisAuthor() {
        assertTrue(doraemonBook.thisAuthor(doraemonAuthor));
        assertFalse(dragonballBook.thisAuthor(doraemonAuthor));
    }

    @Test
    public void test_SameGeneration() {
        assertFalse(doraemonBook.sameGeneration(dragonballBook));
        assertTrue(doraemonBook.sameGeneration(yaibaBook));
    }

    @Test
    public void test_SameAuthor() {
        BookstoreEmployee doraemonBook2 = new BookstoreEmployee("Doraemon Thêm", 0.0, 2004, doraemonAuthor);

        assertFalse(doraemonBook.sameAuthor(dragonballBook));
        assertTrue(doraemonBook.sameAuthor(doraemonBook2));
    }

    @Test
    public void test_ThisAuthor2() {

        assertFalse(doraemonBook.thisAuthor2(dragonballAuthor));
    }

    @Test
    public void test_SameAuthor2() {
        assertFalse(doraemonBook.sameAuthor2(dragonballBook));
    }
}
