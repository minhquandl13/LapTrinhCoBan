package TestEercise4_4;

import Exercise4_4.CartPointer;

import Exercise4_4.Rectangle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private CartPointer cartPointer;
    private CartPointer cartPointer2;

    private Rectangle rectangle;

    @Before
    public void setUpCase() {
        cartPointer = new CartPointer(4, 3);
        cartPointer2 = new CartPointer(4, 3);

        rectangle = new Rectangle(cartPointer, 30, 1);
    }

    @Test
    public void test_Shape() {
        assertNotNull(rectangle);
    }

    @Test
    public void test_Area() {
        assertEquals(0.0, rectangle.distanceToO(), 0.1);
    }


    @Test
    public void test_DistanceToO() {
        assertEquals(0.0, rectangle.distanceToO(), 0.1);
    }

    @Test
    public void test_Contains() {
        assertFalse(rectangle.contains(cartPointer2));
    }

    @Test
    public void test_BoundingBox() {
        System.out.println(rectangle.boundingBox());
    }

    @Test
    public void test_Perimeter() {
        assertEquals(62.0, rectangle.perimeter(), 0.1);
    }
}
