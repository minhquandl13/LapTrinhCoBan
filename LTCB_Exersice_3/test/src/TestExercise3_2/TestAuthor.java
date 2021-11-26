package TestExercise3_2;

import Baitap3_2.Author;
import Baitap3_2.BirthDate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAuthor {

    private BirthDate authorDoraemon;
    private BirthDate authorDragonball;


    private Author doraemonAuthor;
    private Author dragonballAuthor;

    @Before
    public void setUpTestcase() {
        authorDoraemon = new BirthDate(1, 3, 1970);
        authorDragonball = new BirthDate(3, 6, 1975);

        doraemonAuthor = new Author("Doraemon Author", 1960, authorDoraemon);
        dragonballAuthor = new Author("Dragonball Author", 1939, authorDragonball);
    }

    @Test
    public void test_Author() {
        assertNotNull(doraemonAuthor);
        assertNotNull(dragonballAuthor);
    }

    @Test
    public void test_CurrentAuthor() {
        assertTrue(doraemonAuthor.currentAuthor());
        assertFalse(dragonballAuthor.currentAuthor());
    }

    @Test
    public void test_Same() {
        assertFalse(doraemonAuthor.same(dragonballAuthor));
        assertTrue(doraemonAuthor.same(doraemonAuthor));
    }

    @Test
    public void test_SameGeneration() {
        assertFalse(doraemonAuthor.sameGeneration(dragonballAuthor));
        assertTrue(doraemonAuthor.sameGeneration(doraemonAuthor));
    }

    @Test
    public void test_equals() {
        assertFalse(doraemonAuthor.equals(dragonballAuthor));
        assertTrue(doraemonAuthor.equals(doraemonAuthor));
    }
}
