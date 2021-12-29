package TestEercise4_7;

import Exercise4_7.Limo;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class LimoTest {
    private Limo limo;
    private Limo limo1;

    @Before
    public void setUpCase() {
        limo = new Limo(1231231, 1, 4, 10);
        limo1 = new Limo(21312, 1, 2, 4);
    }

    @Test
    public void test_Limo() {
        assertNotNull(limo);
        assertNotNull(limo1);
    }

    @Test
    public void test_UnitPrice() {
        assertEquals(10.0, limo.fare(2.0), 0.1);
        assertEquals(4.0, limo1.fare(2.0), 0.1);
    }

    @Test
    public void test_LowerPrice() {
        assertFalse(limo.lowerPrice(2.0, 5.0));
        assertTrue(limo1.lowerPrice(2.0, 6.0));
    }

    @Test
    public void test_CheaperThan() {
        assertFalse(limo.cheaperThan(2.0, limo1));
        assertTrue(limo1.cheaperThan(2.0, limo));
    }
}
