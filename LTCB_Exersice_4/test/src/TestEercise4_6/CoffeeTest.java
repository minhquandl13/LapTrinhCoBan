package TestEercise4_6;

import Exercise4_6.Coffee;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CoffeeTest {
    private Coffee regular;
    private Coffee decaffeinated;

    @Before
    public void setUpCase() {
        regular = new Coffee("NetCafe", 1, 2.0, "Regular");
        decaffeinated = new Coffee("Cafe Pho", 10.0, 5.5, "Decaffeinated");
    }

    @Test
    public void test_Coffee() {
        assertNotNull(regular);
        assertNotNull(decaffeinated);
    }

    @Test
    public void test_UnitPrice() {
        assertEquals(2.0, regular.unitPrice(), 0.1);
        assertEquals(0.55, decaffeinated.unitPrice(), 0.1);
    }

    @Test
    public void test_LowerPrice() {
        assertTrue(regular.lowerPrice(3.0));
        assertFalse(decaffeinated.lowerPrice(0.5));
        assertFalse(regular.lowerPrice(1.5));
        assertTrue(decaffeinated.lowerPrice(0.56));
    }

    @Test
    public void test_CheaperThan() {
        assertFalse(regular.cheaperThan(decaffeinated));
    }
}
