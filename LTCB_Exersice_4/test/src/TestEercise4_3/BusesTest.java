package TestEercise4_3;

import Exercise4_3.Buses;
import Exercise4_3.MetropolitanTransportation;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusesTest {

    @Test
    public void test_Buses() {
        MetropolitanTransportation buses = new Buses(4, 20, 2.5, 18);

        assertNotNull(buses);
    }
}
