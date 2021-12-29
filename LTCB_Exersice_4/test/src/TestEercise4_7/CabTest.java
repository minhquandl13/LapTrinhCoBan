package TestEercise4_7;

import Exercise4_7.Cab;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CabTest {
    private Cab cab;
    private Cab cab1;

    @Before
    public void setUpCase() {
        cab = new Cab(13545, 1, 4);
        cab1 = new Cab(12321, 3, 3);
    }

    @Test
    public void test_Cab() {
        assertNotNull(cab);
        assertNotNull(cab1);
    }

    @Test
    public void test_Fare() {
        assertEquals(8.0, cab.fare(2.0), 0.1);
        assertEquals(9.0, cab1.fare(3.0), 0.1);
    }

    @Test
    public void test_LowerPrice() {
        assertTrue(cab.lowerPrice(2.0, 9.0));
        assertFalse(cab1.lowerPrice(3.0, 8.0));
    }

    @Test
    public void test_CheaperThan() {
        assertTrue(cab1.cheaperThan(2.0, cab));
    }
}
