package TestEercise4_3;

import Exercise4_3.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class MetropolitanTransportationTest {

    @Test
    public void test_MetropolitanTransportation() {
        MetropolitanTransportation buses = new Buses(4, 20, 2.5, 18);
        MetropolitanTransportation subWays = new Subways(60, 40, 20_000, 6);
        MetropolitanTransportation cars = new Cars(4, 6, "Ferrari", 4);
        MetropolitanTransportation limos = new Limos(4, 10 , 2_000, 6.0);

        assertNotNull(buses);
        assertNotNull(subWays);
        assertNotNull(cars);
        assertNotNull(limos);
    }
}
