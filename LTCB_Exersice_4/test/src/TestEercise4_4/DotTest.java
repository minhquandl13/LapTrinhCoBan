package TestEercise4_4;

import Exercise4_4.CartPointer;

import Exercise4_4.Dot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DotTest {
    private CartPointer cartPointer;

    private Dot dot;
    @Before
    public void setUpCase() {
        cartPointer = new CartPointer(4, 3);
        dot = new Dot(cartPointer);
    }

    @Test
    public void test_Shape() {
        assertNotNull(dot);
    }

    @Test
    public void test_Area() {
        assertEquals(0.0, dot.area(), 0.01);
    }

    @Test
    public void test_DistanceToO() {
        assertEquals(5.0, dot.distanceToO(), 0.001);
    }

    @Test
    public void test_Contains() {
        assertTrue(dot.contains(cartPointer));
    }

    @Test
    public void test_BoundingBox() {
        System.out.println(dot.boundingBox());
    }

    @Test
    public void test_Perimeter() {
        assertEquals(1.0, dot.perimeter(), 0.1);
    }
}
