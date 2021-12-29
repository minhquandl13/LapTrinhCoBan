package TestEercise4_8;

import Exercise4_8.Sale;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class SaleTest {
    private Sale yaiba;
    private Sale yugioh;

    @Before
    public void setUpCase(){
        yaiba = new Sale("Yaiba", "Yaiba Author", 5, 1998);
        yugioh = new Sale("Yugioh", "Yugioh Author", 1,2000);
    }

    @Test
    public void test_Sale() {
        assertNotNull(yaiba);
        assertNotNull(yugioh);
    }

    @Test
    public void test_SalePrice() {
        assertEquals(2.5, yaiba.salePrice(), 0.1);
        assertEquals(0.5, yugioh.salePrice(), 0.1);
    }

    @Test
    public void test_CheaperThan() {
        assertTrue(yugioh.cheaperThan(yaiba));
    }

    @Test
    public void test_SameAuthor() {
        assertFalse(yugioh.sameAuthor(yaiba));
    }
}
