package TestEercise4_3;

import Exercise4_3.Cars;
import Exercise4_3.MetropolitanTransportation;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarsTest {

    @Test
    public void test_Cars() {
        MetropolitanTransportation cars = new Cars(4, 6, "Ferrari", 4);

        assertNotNull(cars);
    }
}
