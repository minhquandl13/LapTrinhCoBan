package TestEercise4_7;

import Exercise4_7.ATaxiVehicle;
import Exercise4_7.Cab;
import Exercise4_7.Limo;
import Exercise4_7.Van;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ATaxiVehicleTest {
    private ATaxiVehicle van;
    private ATaxiVehicle van1;

    private ATaxiVehicle limo;
    private ATaxiVehicle limo1;

    private ATaxiVehicle cab;
    private ATaxiVehicle cab1;

    @Before
    public void setUpCase() {
        van = new Van(123, 2, 5, true);
        van1 = new Van(1223, 3, 5, false);

        limo = new Limo(1231231, 1, 4, 10);
        limo1 = new Limo(21312, 1, 2, 4);

        cab = new Cab(13545, 1, 4);
        cab1 = new Cab(12321, 3, 3);
    }

    @Test
    public void test_ATaxiVehicle() {
        assertNotNull(van);
        assertNotNull(van1);

        assertNotNull(limo);
        assertNotNull(limo1);

        assertNotNull(cab);
        assertNotNull(cab1);
    }

    @Test
    public void test_Fare() {
        assertEquals(12.0, van.fare(2.0), 0.1);

        assertEquals(10.0, limo.fare(2.0), 0.1);
        assertEquals(4.0, limo1.fare(2.0), 0.1);

        assertEquals(8.0, cab.fare(2.0), 0.1);
        assertEquals(9.0, cab1.fare(3.0), 0.1);
    }

    @Test
    public void test_LowerPrice() {
        assertFalse(van.lowerPrice(2.0, 3.0));
        assertFalse(van.lowerPrice(2.0, 13.0));

        assertFalse(limo.lowerPrice(2.0, 5.0));
        assertTrue(limo1.lowerPrice(2.0, 6.0));

        assertTrue(cab.lowerPrice(2.0, 9.0));
        assertFalse(cab1.lowerPrice(3.0, 8.0));
    }

    @Test
    public void test_CheaperThan() {
        assertTrue(van.cheaperThan(2.0, van1));

        assertFalse(limo.cheaperThan(2.0, limo1));
        assertTrue(limo1.cheaperThan(2.0, limo));

        assertTrue(cab1.cheaperThan(2.0, cab));
    }
}
