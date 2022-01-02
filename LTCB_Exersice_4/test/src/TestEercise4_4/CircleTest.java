package TestEercise4_4;

import Exercise4_4.CartPointer;
import Exercise4_4.Circle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private CartPointer cartPointer;

    private Circle circle;

    @Before
    public void setUpCase() {
        cartPointer = new CartPointer(5, 5);
        circle = new Circle(cartPointer, 20);
    }

    @Test
    public void test_Circle() {
        assertNotNull(circle);
    }

    @Test
    public void test_Area() {
        assertEquals(1256.64, circle.area(), 0.01);
    }

    @Test
    public void test_DistanceToO() {
        assertEquals(7.07, circle.distanceToO(), 0.01);
    }

    @Test
    public void test_Contains() {
        assertTrue(circle.contains(cartPointer));
        assertFalse(circle.contains(new CartPointer(100, 200)));
    }

    @Test
    public void test_BoundingBox() {
        System.out.println(circle.boundingBox());
    }

    @Test
    public void test_Perimeter() {
        assertEquals(125.66, circle.perimeter(), 0.01);
    }
}
