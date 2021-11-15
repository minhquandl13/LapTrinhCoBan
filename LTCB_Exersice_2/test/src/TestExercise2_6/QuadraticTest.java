package TestExercise2_6;

import Baitap2_6.Quadratic;
import junit.framework.TestCase;

public class QuadraticTest extends TestCase {
    public void test_Quadratic() {
        Quadratic quadratic1 = new Quadratic(2, 3, 4);
        Quadratic quadratic2 = new Quadratic(5, 0, 4);
        Quadratic quadratic3 = new Quadratic(2, 1, 1);
    }

    public void test_delta() {
        Quadratic quadratic1 = new Quadratic(2, 3, 4);
        Quadratic quadratic2 = new Quadratic(5, 10, 4);
        Quadratic quadratic3 = new Quadratic(2, 4, 2);

        assertEquals(-23.0, quadratic1.delta());
        assertEquals(20.0, quadratic2.delta());
        assertEquals(0.0, quadratic3.delta());
    }

    public void test_WhatKind() {
        Quadratic quadratic1 = new Quadratic(2, 3, 4);
        Quadratic quadratic2 = new Quadratic(5, 10, 4);
        Quadratic quadratic3 = new Quadratic(2, 4, 2);
        Quadratic quadratic4 = new Quadratic(0, 4, 2);

        assertEquals("none", quadratic1.whatKind());
        assertEquals("two solution", quadratic2.whatKind());
        assertEquals("one solution", quadratic3.whatKind());
        assertEquals("degenerate", quadratic4.whatKind());
    }
}
