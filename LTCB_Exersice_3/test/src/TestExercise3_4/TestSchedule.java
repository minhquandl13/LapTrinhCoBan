package TestExercise3_4;

import Baitap3_4.ClockTime;
import Baitap3_4.Schedule;
import junit.framework.TestCase;

public class TestSchedule extends TestCase {
    private ClockTime clockTime1 = new ClockTime(3, 31);
    private ClockTime clockTime2 = new ClockTime(11, 30);
    private ClockTime clockTime3 = new ClockTime(12, 30);

    public void test_Schedule() {
        Schedule schedule1 = new Schedule(clockTime1, clockTime3);
        Schedule schedule2 = new Schedule(clockTime3, clockTime2);
        Schedule schedule3 = new Schedule(clockTime1, clockTime2);

        assertNotNull(schedule1);
        assertNotNull(schedule2);
        assertNotNull(schedule3);
    }

    public void test_IsSameTrainDepartureTime() {
        Schedule schedule1 = new Schedule(clockTime1, clockTime3);
        Schedule schedule2 = new Schedule(clockTime3, clockTime2);
        Schedule schedule3 = new Schedule(clockTime1, clockTime2);

        assertTrue(schedule1.isSameTrainDepartureTime(schedule3));
        assertFalse(schedule2.isSameTrainDepartureTime(schedule3));
    }

    public void test_GetTripTime() {
        Schedule schedule1 = new Schedule(clockTime1, clockTime3);
        Schedule schedule2 = new Schedule(clockTime3, clockTime2);
        Schedule schedule3 = new Schedule(clockTime1, clockTime2);

        ClockTime a = schedule1.getTripTime();
        ClockTime b = schedule2.getTripTime();
        ClockTime c = schedule3.getTripTime();

        assertEquals(8, a.getHour());
        assertEquals(59, a.getMinute());

        assertEquals(1, b.getHour());
        assertEquals(0, b.getMinute());

        assertEquals(7, c.getHour());
        assertEquals(59, c.getMinute());
    }
}
