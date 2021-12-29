package TestEercise4_8;

import Exercise4_8.Hardcover;
import Exercise4_8.Paperback;
import Exercise4_8.Sale;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ABookTest {
    private Hardcover doraemon;
    private Hardcover conan;

    private Paperback dragonBall;
    private Paperback doremon;

    private Sale yaiba;
    private Sale yugioh;

    @Before
    public void setUpCase() {
        doraemon = new Hardcover("Doraemon", "Doraemon Author", 10.0, 1990);
        conan = new Hardcover("Conan", "Conan Author", 1.0, 1991);

        dragonBall = new Paperback("Dragon Ball", "Dragon Ball Author", 5.0, 2000);
        doremon = new Paperback("Doraemon", "Doraemon Author", 2.0, 2001);

        yaiba = new Sale("Yaiba", "Yaiba Author", 5, 1998);
        yugioh = new Sale("Yugioh", "Yugioh Author", 1,2000);
    }

    @Test
    public void test_Hardcover() {
        assertNotNull(doraemon);
        assertNotNull(conan);

        assertNotNull(dragonBall);
        assertNotNull(doremon);

        assertNotNull(yaiba);
        assertNotNull(yugioh);
    }

    @Test
    public void test_SalePrice() {
        assertEquals(8.0, doraemon.salePrice(), 0.1);
        assertEquals(0.8, conan.salePrice(), 0.1);

        assertEquals(5.0, dragonBall.salePrice(), 0.1);
        assertEquals(2.0, doremon.salePrice(), 0.1);

        assertEquals(2.5, yaiba.salePrice(), 0.1);
        assertEquals(0.5, yugioh.salePrice(), 0.1);
    }

    @Test
    public void test_CheaperThan() {
        assertFalse(doraemon.cheaperThan(conan));
        assertTrue(conan.cheaperThan(doraemon));

        assertTrue(doremon.cheaperThan(dragonBall));

        assertTrue(yugioh.cheaperThan(yaiba));
    }

    @Test
    public void test_SameAuthor() {
        assertFalse(doraemon.sameAuthor(conan));

        assertFalse(doremon.sameAuthor(dragonBall));

        assertFalse(yugioh.sameAuthor(yaiba));
    }
}
