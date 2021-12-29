package TestEercise4_6;

import static org.junit.Assert.*;

import Exercise4_6.Juice;
import org.junit.Test;
import org.junit.Before;

public class JuiceTest {
    private Juice frozen;
    private Juice fresh;
    private Juice bottled;
    private Juice canned;

    @Before
    public void setUpCase() {
        frozen = new Juice("abc", 12.5, 15, "Orange", "Frozen");
        fresh = new Juice("xyz", 13.5, 1, "Apple", "Fresh");
        bottled = new Juice("asd", 1, 20, "Lemon", "Bottled");
        canned = new Juice("qwe", 2, 10, "Grapes", "Canned");
    }

    @Test
    public void test_Juice() {
        assertNotNull(frozen);
        assertNotNull(fresh);
        assertNotNull(bottled);
        assertNotNull(canned);
    }

    @Test
    public void test_UnitPrice() {
        assertEquals(1.2, frozen.unitPrice(), 0.1);
        assertEquals(0.07, fresh.unitPrice(), 0.01);
        assertEquals(20.0, bottled.unitPrice(), 0.1);
        assertEquals(5.0, canned.unitPrice(), 0.1);
    }

    @Test
    public void test_LowerPrice() {
        assertTrue(frozen.lowerPrice(2.3));
        assertTrue(fresh.lowerPrice(0.1));
        assertTrue(bottled.lowerPrice(20.1));
        assertFalse(canned.lowerPrice(2.3));
    }

    @Test
    public void test_CheaperThan() {
        assertFalse(frozen.cheaperThan(fresh));
        assertTrue(canned.cheaperThan(bottled));
        assertTrue(fresh.cheaperThan(canned));
        assertFalse(bottled.cheaperThan(frozen));
    }
}