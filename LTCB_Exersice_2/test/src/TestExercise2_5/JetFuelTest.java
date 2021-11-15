package TestExercise2_5;

import Baitap2_5.JetFuel;
import junit.framework.TestCase;

public class JetFuelTest extends TestCase {

    public void test_JetFuel() {
        JetFuel jetFuelA = new JetFuel(10, "bad", 100);
        JetFuel jetFuelB = new JetFuel(10, "medium", 1_000);
        JetFuel jetFuelC = new JetFuel(10, "good", 10_000);
    }

    public void test_TotalPrice() {
        JetFuel jetFuelA = new JetFuel(10, "bad", 100);
        JetFuel jetFuelB = new JetFuel(10, "medium", 1_000);
        JetFuel jetFuelC = new JetFuel(10, "good", 10_000);

        assertEquals(1_000, jetFuelA.totalCost());
        assertEquals(10_000, jetFuelB.totalCost());
        assertEquals(100_000, jetFuelC.totalCost());
    }

    public void test_DiscountPrice() {
        JetFuel jetFuelA = new JetFuel(10, "bad", 100);
        JetFuel jetFuelB = new JetFuel(10, "medium", 1_000);
        JetFuel jetFuelC = new JetFuel(10, "good", 11_000);

        assertEquals(1_000.0, jetFuelA.discountPrice());
        assertEquals(10_000.0, jetFuelB.discountPrice());
        assertEquals(11_000.0, jetFuelC.discountPrice());
    }
}
