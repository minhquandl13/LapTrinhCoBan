package TestEercise4_6;

import static org.junit.Assert.*;


import Exercise4_6.IceCream;
import org.junit.Test;
import org.junit.Before;

public class IceCreamTest {
    private IceCream sorbet;
    private IceCream frozenYogurt;
    private IceCream regular;

    @Before
    public void setUpCase() {
        sorbet = new IceCream("Nestle", 10.1, 10.1, "Sorbet", "Sorbet");
        frozenYogurt = new IceCream("Magnum", 2.3, 1, "Frozen Yogurt", "Frozen Yogurt");
        regular = new IceCream("Fanny", 1.0, 2.0, "Regular", "Regular");
    }

    @Test
    public void test_IceCream() {
        assertNotNull(sorbet);
        assertNotNull(frozenYogurt);
        assertNotNull(regular);
    }

    @Test
    public void test_UnitPrice() {
        assertEquals(1.0, sorbet.unitPrice(), 0.1);
        assertEquals(0.43, frozenYogurt.unitPrice(), 0.01);
        assertEquals(2.0, regular.unitPrice(), 0.1);
    }

    @Test
    public void test_LowerPrice() {
        assertTrue(sorbet.lowerPrice(2.0));
        assertFalse(frozenYogurt.lowerPrice(0.42));
        assertTrue(regular.lowerPrice(2.1));
    }

    @Test
    public void test_CheaperThan() {
        assertTrue(frozenYogurt.cheaperThan(sorbet));
        assertFalse(regular.cheaperThan(sorbet));
    }
}
