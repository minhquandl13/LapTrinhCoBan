package TestExercise3_4;

import Baitap3_4.ClockTime;

import Baitap3_4.Schedule;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSchedule {
    private ClockTime clockTime1;
    private ClockTime clockTime2;
    private ClockTime clockTime3;

    private  Schedule schedule1;
    private  Schedule schedule2;
    private  Schedule schedule3;

    @Before
    public void setUpTestcase() {

        clockTime1 = new ClockTime(3, 31);
        clockTime2 = new ClockTime(11, 30);
        clockTime3 = new ClockTime(12, 30);

        schedule1 = new Schedule(clockTime1, clockTime3);
        schedule2 = new Schedule(clockTime3, clockTime2);
        schedule3 = new Schedule(clockTime1, clockTime2);
    }

    @Test
    public void test_Schedule() {
        assertNotNull(schedule1);
        assertNotNull(schedule2);
        assertNotNull(schedule3);
    }

    @Test
    public void test_IsSameTrainDepartureTime() {
        assertTrue(schedule1.isSameTrainDepartureTime(schedule3));
        assertFalse(schedule2.isSameTrainDepartureTime(schedule3));
    }

    @Test
    public void test_GetTripTime() {
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
