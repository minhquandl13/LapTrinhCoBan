package TestExercise3_3;

import Baitap3_3.TemperatureRange;
import junit.framework.TestCase;

public class TestTemperatureRange extends TestCase {

    public void test_TemperatureRange() {
        TemperatureRange temperatureRange1 = new TemperatureRange(1, 100);
        TemperatureRange temperatureRange2 = new TemperatureRange(-1, 50);
        TemperatureRange temperatureRange3 = new TemperatureRange(0, 70);

        assertNotNull(temperatureRange1);
        assertNotNull(temperatureRange2);
        assertNotNull(temperatureRange3);
    }

    public void test_Within() {
        TemperatureRange temperatureRange1 = new TemperatureRange(1, 100);
        TemperatureRange temperatureRange2 = new TemperatureRange(-1, 50);
        TemperatureRange temperatureRange3 = new TemperatureRange(0, 70);

        assertFalse(temperatureRange1.within(temperatureRange3));
        assertFalse(temperatureRange1.within(temperatureRange2));
        assertTrue(temperatureRange1.within(temperatureRange1));
        assertFalse(temperatureRange1.within(temperatureRange3));
    }
}
