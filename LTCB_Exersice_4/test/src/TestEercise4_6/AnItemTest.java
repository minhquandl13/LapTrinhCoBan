package TestEercise4_6;

import Exercise4_6.AnItem;
import Exercise4_6.Coffee;
import Exercise4_6.IceCream;
import Exercise4_6.Juice;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class AnItemTest {
    private AnItem frozen;
    private AnItem fresh;
    private AnItem bottled;
    private AnItem canned;

    private AnItem regular;
    private AnItem decaffeinated;

    private AnItem sorbet;
    private AnItem frozenYogurt;
    private AnItem regular1;

    @Before
    public void setUpCase() {
        frozen = new Juice("abc", 12.5, 15, "Orange", "Frozen");
        fresh = new Juice("xyz", 13.5, 1, "Apple", "Fresh");
        bottled = new Juice("asd", 1, 20, "Lemon", "Bottled");
        canned = new Juice("qwe", 2, 10, "Grapes", "Canned");

        regular = new Coffee("NetCafe", 1, 2.0, "Regular");
        decaffeinated = new Coffee("Cafe Pho", 10.0, 5.5, "Decaffeinated");

        sorbet = new IceCream("Nestle", 10.1, 10.1, "Sorbet", "Sorbet");
        frozenYogurt = new IceCream("Magnum", 2.3, 1, "Frozen Yogurt", "Frozen Yogurt");
        regular1 = new IceCream("Fanny", 1.0, 2.0, "Regular", "Regular");
    }

    @Test
    public void test_AnItem() {
        assertNotNull(frozen);
        assertNotNull(fresh);
        assertNotNull(bottled);
        assertNotNull(canned);

        assertNotNull(regular);
        assertNotNull(decaffeinated);

        assertNotNull(sorbet);
        assertNotNull(frozenYogurt);
        assertNotNull(regular1);
    }

    @Test
    public void test_UnitPrice() {
        assertEquals(1.2, frozen.unitPrice(), 0.1);
        assertEquals(0.07, fresh.unitPrice(), 0.01);
        assertEquals(20.0, bottled.unitPrice(), 0.1);
        assertEquals(5.0, canned.unitPrice(), 0.1);

        assertEquals(2.0, regular.unitPrice(), 0.1);
        assertEquals(0.55, decaffeinated.unitPrice(), 0.1);

        assertEquals(1.0, sorbet.unitPrice(), 0.1);
        assertEquals(0.43, frozenYogurt.unitPrice(), 0.01);
        assertEquals(2.0, regular1.unitPrice(), 0.1);
    }

    @Test
    public void test_LowerPrice() {
        assertTrue(frozen.lowerPrice(2.3));
        assertTrue(fresh.lowerPrice(0.1));
        assertTrue(bottled.lowerPrice(20.1));
        assertFalse(canned.lowerPrice(2.3));

        assertTrue(regular.lowerPrice(3.0));
        assertFalse(decaffeinated.lowerPrice(0.5));
        assertFalse(regular.lowerPrice(1.5));
        assertTrue(decaffeinated.lowerPrice(0.56));

        assertTrue(sorbet.lowerPrice(2.0));
        assertFalse(frozenYogurt.lowerPrice(0.42));
        assertTrue(regular.lowerPrice(2.1));
    }

    @Test
    public void test_CheaperThan() {
        assertFalse(frozen.cheaperThan(fresh));
        assertTrue(canned.cheaperThan(bottled));
        assertTrue(fresh.cheaperThan(canned));
        assertFalse(bottled.cheaperThan(frozen));

        assertFalse(regular.cheaperThan(decaffeinated));

        assertTrue(frozenYogurt.cheaperThan(sorbet));
        assertFalse(regular1.cheaperThan(sorbet));
    }
}
