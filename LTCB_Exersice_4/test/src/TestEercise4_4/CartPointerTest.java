package TestEercise4_4;

import Exercise4_4.CartPointer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartPointerTest {
    private CartPointer cartPointer1;
    private CartPointer cartPointer2;

    @Before
    public void setUpCase() {
        cartPointer1 = new CartPointer(4, 3);
        cartPointer2 = new CartPointer(5, 5);
    }

    @Test
    public void test_CartPointer() {
        assertNotNull(cartPointer1);
        assertNotNull(cartPointer2);
    }

    @Test
    public void test_DistanceToO() {
        assertEquals(5.0, cartPointer1.distanceToO(), 0.1);
        assertEquals(7.07, cartPointer2.distanceToO(), 0.01);
    }

    @Test
    public void test_Translate() {
        System.out.println(cartPointer1.translate(1, 2));
        System.out.println(cartPointer2.translate(1, 2));
    }

    @Test
    public void test_DistanceTo() {
        assertEquals(2.236, cartPointer1.distanceTo(cartPointer2), 0.0001);
    }
}
