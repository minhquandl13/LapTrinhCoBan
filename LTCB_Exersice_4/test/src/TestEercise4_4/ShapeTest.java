package TestEercise4_4;

import Exercise4_4.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {
    private CartPointer cartPointer1;
    private CartPointer cartPointer2;
    private CartPointer cartPointer3;

    private IShape dot;
    private IShape square;
    private IShape square1;
    private IShape circle;
    private IShape rectangle;


    @Before
    public void setUpCase() {
        cartPointer1 = new CartPointer(4, 3);
        cartPointer2 = new CartPointer(4, 3);
        cartPointer3 = new CartPointer(5, 5);

        dot = new Dot(cartPointer1);
        square = new Square(cartPointer2, 30);
        square1 = new Square(cartPointer2, 0);
        circle = new Circle(cartPointer3, 20);
        rectangle = new Rectangle(cartPointer2, 30, 1);

    }

    @Test
    public void test_area() {
        assertEquals(0.0, dot.area(), 0.01);
        assertEquals(900, square.area(), 0.01);
        assertEquals(1256.64, circle.area(), 0.01);
        assertEquals(30.0, rectangle.area(), 0.1);
    }

    @Test
    public void test_DistanceTo0() {
        assertEquals(5.0, dot.distanceToO(), 0.001);
        assertEquals(5.0, square.distanceToO(), 0.001);
        assertEquals(7.07, circle.distanceToO(), 0.01);
        assertEquals(0.0, rectangle.distanceToO(), 0.1);

    }

    @Test
    public void test_Contains() {
        assertTrue(dot.contains(cartPointer1));
        assertFalse(square.contains(cartPointer2));
        assertFalse(circle.contains(new CartPointer(100, 200)));
//        assertTrue(rectangle.contains(cartPointer2));
    }

    @Test
    public void test_BoundingBox() {
        System.out.println(dot.boundingBox());
        System.out.println(square.boundingBox());
        System.out.println(circle.boundingBox());

//        assertEquals(square1 ,dot.boundingBox());
    }

    @Test
    public void test_Perimeter() {
        assertEquals(1.0, dot.perimeter(), 0.1);
        assertEquals(120.0, square.perimeter(), 0.1);
        assertEquals(125.66, circle.perimeter(), 0.01);
        assertEquals(62.0, rectangle.perimeter(), 0.1);
    }
}
