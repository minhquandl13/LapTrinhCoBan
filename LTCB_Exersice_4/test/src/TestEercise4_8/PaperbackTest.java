package TestEercise4_8;

import Exercise4_8.Paperback;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class PaperbackTest {
    private Paperback dragonBall;
    private Paperback doraemon;

    @Before
    public void setUpCase() {
        dragonBall = new Paperback("Dragon Ball", "Dragon Ball Author", 5.0, 2000);
        doraemon = new Paperback("Doraemon", "Doraemon Author", 2.0, 2001);
    }

    @Test
    public void test_Paperback() {
        assertNotNull(dragonBall);
        assertNotNull(doraemon);
    }

    @Test
    public void test_SalePrice() {
        assertEquals(5.0, dragonBall.salePrice(), 0.1);
        assertEquals(2.0, doraemon.salePrice(), 0.1);
    }

    @Test
    public void test_CheaperThan() {
        assertTrue(doraemon.cheaperThan(dragonBall));
    }

    @Test
    public void test_SameAuthor() {
        assertFalse(doraemon.sameAuthor(dragonBall));
    }
}
