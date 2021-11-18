package TestExercise3_2;

import Baitap3_2.Author;
import Baitap3_2.BookstoreEmployee;
import junit.framework.TestCase;

public class TestBookstoreEmployee extends TestCase {
    public void test_BookstoreEmployee() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Matthias Felleisen", 1960);
        BookstoreEmployee book1 = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee book2 = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);

        //assertNotNull();
    }

    public void test_CurrentBook() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Danial P. Friedman", 1939);
        BookstoreEmployee book1 = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee book2 = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);

        assertTrue(book1.currentBook());
        assertFalse(book2.currentBook());
    }

    public void test_CurrentAuthor() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Danial P. Friedman", 1939);
        BookstoreEmployee book1 = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee book2 = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);

        assertTrue(book1.currentAuthor());
        assertFalse(book2.currentAuthor());
    }

    public void test_ThisAuthor() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Danial P. Friedman", 1939);
        BookstoreEmployee book1 = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee book2 = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);

        assertTrue(book1.thisAuthor(felleisen));
        assertFalse(book1.thisAuthor(friedman));
    }

    public void test_SameGeneration() {
        Author felleisen = new Author("Matthias Felleisen", 1960);
        Author friedman = new Author("Danial P. Friedman", 1939);
        Author author = new Author("abc", 1970);
        BookstoreEmployee book1 = new BookstoreEmployee("How to Design Class Hierarchies", 0.0, 2004, felleisen);
        BookstoreEmployee book2 = new BookstoreEmployee("A Little Java, A Few Pattern", 25.9, 1998, friedman);
        BookstoreEmployee book3 = new BookstoreEmployee("qwert", 10.0, 2000, author);

        assertFalse(book1.sameGeneration(book2));
        assertTrue(book1.sameGeneration(book3));
    }


}
