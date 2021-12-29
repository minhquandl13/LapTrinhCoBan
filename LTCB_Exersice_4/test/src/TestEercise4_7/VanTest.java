package TestEercise4_7;

import Exercise4_7.Van;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class VanTest {
    private Van van;
    private Van van1;

    @Before
    public void setUpCase() {
        van = new Van(123, 2, 5, true);
        van1 = new Van(1223, 3, 5, false);
    }

    @Test
    public void test_Van() {
        assertNotNull(van);
        assertNotNull(van1);
    }

    @Test
    public void test_Fare() {
        assertEquals(12.0, van.fare(2.0), 0.1);
    }

    @Test
    public void test_LowerPrice() {
        assertFalse(van.lowerPrice(2.0, 3.0));
        assertFalse(van.lowerPrice(2.0, 13.0));
    }

    @Test
    public void test_CheaperThan() {
        assertTrue(van.cheaperThan(2.0, van1));
    }
}
