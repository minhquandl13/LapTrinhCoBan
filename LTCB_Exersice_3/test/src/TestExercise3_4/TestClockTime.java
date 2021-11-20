package TestExercise3_4;

import Baitap3_4.ClockTime;
import junit.framework.TestCase;

public class TestClockTime extends TestCase {

        public void test_ClockTime() {
            ClockTime clockTime1 = new ClockTime(3, 31);
            ClockTime clockTime2 = new ClockTime(11, 30);

            assertNotNull(clockTime1);
            assertNotNull(clockTime2);
        }

        public void test_GetHour() {
            ClockTime clockTime1 = new ClockTime(3, 31);
            ClockTime clockTime2 = new ClockTime(11, 30);

            assertEquals(3, clockTime1.getHour());
            assertEquals(11, clockTime2.getHour());
        }

        public void test_GetMinute() {
            ClockTime clockTime1 = new ClockTime(3, 31);
            ClockTime clockTime2 = new ClockTime(11, 30);

            assertEquals(31, clockTime1.getMinute());
            assertEquals(30, clockTime2.getMinute());
        }
}
