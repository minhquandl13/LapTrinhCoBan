package TestEercise4_3;

import Exercise4_3.Limos;
import Exercise4_3.MetropolitanTransportation;
import org.junit.Test;

import static org.junit.Assert.*;

public class LimosTest {

    @Test
    public void test_Limos() {
        MetropolitanTransportation limos = new Limos(4, 10, 2_000, 6.0);

        assertNotNull(limos);
    }
}
