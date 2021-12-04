package TestEercise4_3;

import Exercise4_3.MetropolitanTransportation;
import Exercise4_3.Subways;
import org.junit.Test;

import static org.junit.Assert.*;
public class SubWayTest {

    @Test
    public void test_SubWay() {
        MetropolitanTransportation subWays = new Subways(60, 40, 20_000, 6);

        assertNotNull(subWays);
    }
}
