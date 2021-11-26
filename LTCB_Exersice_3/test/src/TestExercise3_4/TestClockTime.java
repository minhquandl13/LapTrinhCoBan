package TestExercise3_4;

import Baitap3_4.ClockTime;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClockTime {

    @Test
    public void test_ClockTime() {
        ClockTime clockTime1 = new ClockTime(3, 31);
        ClockTime clockTime2 = new ClockTime(11, 30);

        assertNotNull(clockTime1);
        assertNotNull(clockTime2);
    }

    @Test
    public void test_GetHour() {
        ClockTime clockTime1 = new ClockTime(3, 31);
        ClockTime clockTime2 = new ClockTime(11, 30);

        assertEquals(3, clockTime1.getHour());
        assertEquals(11, clockTime2.getHour());
    }

    @Test
    public void test_GetMinute() {
        ClockTime clockTime1 = new ClockTime(3, 31);
        ClockTime clockTime2 = new ClockTime(11, 30);

        assertEquals(31, clockTime1.getMinute());
        assertEquals(30, clockTime2.getMinute());
    }
}
