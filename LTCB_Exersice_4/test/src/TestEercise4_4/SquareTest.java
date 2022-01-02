package TestEercise4_4;

import Exercise4_4.CartPointer;
import Exercise4_4.Square;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private CartPointer cartPointer;

    private Square square;

    @Before
    public void setUpCase() {
        cartPointer = new CartPointer(4, 3);

        square = new Square(cartPointer, 30);
    }

    @Test
    public void test_Shape() {
        assertNotNull(square);
    }

    @Test
    public void test_Area() {
        assertEquals(900, square.area(), 0.01);
    }

    @Test
    public void test_DistanceToO() {
        assertEquals(5.0, square.distanceToO(), 0.001);
    }

    @Test
    public void test_Contains() {
        assertFalse(square.contains(cartPointer));
    }


    @Test
    public void test_BoundingBox() {
        System.out.println(square.boundingBox());
    }

    @Test
    public void test_Perimeter() {
        assertEquals(120.0, square.perimeter(), 0.1);
    }
}



