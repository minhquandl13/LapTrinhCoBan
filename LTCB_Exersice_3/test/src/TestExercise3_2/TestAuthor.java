package TestExercise3_2;

import Baitap3_2.Author;
import junit.framework.TestCase;

public class TestAuthor extends TestCase {

    public void test_Author() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960);
        Author dragonballAuthor = new Author("Dragonball Author", 1939);

        assertNotNull(doraemonAuthor);
        assertNotNull(dragonballAuthor);
    }

    public void test_CurrentAuthor() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960);
        Author dragonballAuthor = new Author("Dragonball Author", 1939);

        assertTrue(doraemonAuthor.currentAuthor());
        assertFalse(dragonballAuthor.currentAuthor());
    }

    public void test_Same() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960);
        Author dragonballAuthor = new Author("Dragonball Author", 1939);

        assertFalse(doraemonAuthor.same(dragonballAuthor));
        assertTrue(doraemonAuthor.same(doraemonAuthor));
    }

    public void test_SameGeneration() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960);
        Author dragonballAuthor = new Author("Dragonball Author", 1939);

        assertFalse(doraemonAuthor.sameGeneration(dragonballAuthor));
        assertTrue(doraemonAuthor.sameGeneration(doraemonAuthor));
    }

    public void equals() {
        Author doraemonAuthor = new Author("Doraemon Author", 1960);
        Author dragonballAuthor = new Author("Dragonball Author", 1939);

        assertFalse(doraemonAuthor.equals(dragonballAuthor));
        assertTrue(doraemonAuthor.equals(doraemonAuthor));
    }
}
