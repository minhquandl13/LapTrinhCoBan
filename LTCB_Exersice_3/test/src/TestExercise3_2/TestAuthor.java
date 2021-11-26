package TestExercise3_2;

import Baitap3_2.Author;
import Baitap3_2.BirthDate;
import junit.framework.TestCase;

public class TestAuthor extends TestCase {
    private BirthDate authorDoraemon = new BirthDate(1, 3, 1970);
    private BirthDate authorDragonball = new BirthDate(3, 6, 1975);
    private BirthDate authorYaiba = new BirthDate(1, 3, 2003);

    public void test_Author() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960, authorDoraemon);
        Author dragonballAuthor = new Author("Dragonball Author", 1939, authorDragonball);

        assertNotNull(doraemonAuthor);
        assertNotNull(dragonballAuthor);
    }

    public void test_CurrentAuthor() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960, authorDoraemon);
        Author dragonballAuthor = new Author("Dragonball Author", 1939, authorDragonball);

        assertTrue(doraemonAuthor.currentAuthor());
        assertFalse(dragonballAuthor.currentAuthor());
    }

    public void test_Same() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960, authorDoraemon);
        Author dragonballAuthor = new Author("Dragonball Author", 1939, authorDragonball);

        assertFalse(doraemonAuthor.same(dragonballAuthor));
        assertTrue(doraemonAuthor.same(doraemonAuthor));
    }

    public void test_SameGeneration() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960, authorDoraemon);
        Author dragonballAuthor = new Author("Dragonball Author", 1939, authorDragonball);

        assertFalse(doraemonAuthor.sameGeneration(dragonballAuthor));
        assertTrue(doraemonAuthor.sameGeneration(doraemonAuthor));
    }

    public void test_equals() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960, authorDoraemon);
        Author dragonballAuthor = new Author("Dragonball Author", 1939, authorDragonball);

        assertFalse(doraemonAuthor.equals(dragonballAuthor));
        assertTrue(doraemonAuthor.equals(doraemonAuthor));
    }
}
