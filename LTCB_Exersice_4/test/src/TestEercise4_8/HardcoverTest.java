package TestEercise4_8;

import Exercise4_8.Hardcover;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class HardcoverTest {
    private Hardcover doraemon;
    private Hardcover conan;

    @Before
    public void setUpCase() {
        doraemon = new Hardcover("Doraemon", "Doraemon Author", 10.0, 1990);
        conan = new Hardcover("Conan", "Conan Author", 1.0, 1991);
    }

    @Test
    public void test_Hardcover() {
        assertNotNull(doraemon);
        assertNotNull(conan);
    }

    @Test
    public void test_SalePrice() {
        assertEquals(8.0, doraemon.salePrice(), 0.1);
        assertEquals(0.8, conan.salePrice(), 0.1);
    }

    @Test
    public void test_CheaperThan() {
        assertFalse(doraemon.cheaperThan(conan));
        assertTrue(conan.cheaperThan(doraemon));
    }

    @Test
    public void test_SameAuthor() {
        assertFalse(doraemon.sameAuthor(conan));
    }
}
