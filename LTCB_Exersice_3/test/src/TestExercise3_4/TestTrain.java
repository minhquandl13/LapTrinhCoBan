package TestExercise3_4;

import Baitap3_4.ClockTime;
import Baitap3_4.Route;
import Baitap3_4.Schedule;
import Baitap3_4.Train;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTrain {
    private ClockTime clockTime1;
    private ClockTime clockTime2;
    private ClockTime clockTime3;
    private ClockTime clockTime4;
    private ClockTime clockTime5;

    private Schedule schedule1;
    private Schedule schedule2;
    private Schedule schedule3;
    private Schedule schedule4;
    private Schedule schedule5;

    private Route route1;
    private Route route2;
    private Route route3;
    private Route route4;
    private Route route5;

    private Train trainA;
    private Train trainB;
    private Train trainC;
    private Train trainD;
    private Train trainE;

    @Before
    public void setUp() {
        clockTime1 = new ClockTime(3, 31);
        clockTime2 = new ClockTime(11, 30);
        clockTime3 = new ClockTime(12, 30);
        clockTime4 = new ClockTime(19, 25);
        clockTime5 = new ClockTime(11, 30);

        schedule1 = new Schedule(clockTime1, clockTime3);
        schedule2 = new Schedule(clockTime3, clockTime4);
        schedule3 = new Schedule(clockTime4, clockTime2);
        schedule4 = new Schedule(clockTime3, clockTime5);
        schedule5 = new Schedule(clockTime4, clockTime5);

        route1 = new Route("Ha Noi", "Sai Gon");
        route2 = new Route("HSai Gon", "Da Lat");
        route3 = new Route("Ha Noi", "Da Nang");
        route4 = new Route("Sai Gon", "Da Nang");
        route5 = new Route("Ha Noi", "Da Lat");


        trainA = new Train(schedule1, route1, true);
        trainB = new Train(schedule2, route2, false);
        trainC = new Train(schedule3, route3, false);
        trainD = new Train(schedule4, route4, true);
        trainE = new Train(schedule5, route5, true);
    }

    @Test
    public void test_Train() {
        assertNotNull(trainA);
        assertNotNull(trainB);
        assertNotNull(trainC);
        assertNotNull(trainD);
        assertNotNull(trainE);
    }

    @Test
    public void test_IsDestination() {
        assertFalse(trainA.isSameDestination(trainB));
        assertTrue(trainB.isSameDestination(trainE));
        assertTrue(trainC.isSameDestination(trainD));
        assertFalse(trainE.isSameDestination(trainC));
        assertFalse(trainC.isSameDestination(trainA));
    }

    @Test
    public void test_IsTimeTrainDeparture() {
        assertTrue(trainC.isTimeTrainDeparture(trainE));
        assertFalse(trainA.isTimeTrainDeparture(trainC));
        assertTrue(trainD.isTimeTrainDeparture(trainB));
        assertFalse(trainB.isTimeTrainDeparture(trainE));
        assertFalse(trainE.isTimeTrainDeparture(trainA));
    }

    @Test
    public void test_GetTripTime() {
        ClockTime a = trainA.getTripTime();
        ClockTime b = trainB.getTripTime();
        ClockTime c = trainC.getTripTime();
        ClockTime d = trainD.getTripTime();
        ClockTime e = trainE.getTripTime();

        assertEquals(8, a.getHour());
        assertEquals(59, a.getMinute());

        assertEquals(6, b.getHour());
        assertEquals(55, b.getMinute());

        assertEquals(7, c.getHour());
        assertEquals(55, c.getMinute());

        assertEquals(1, d.getHour());
        assertEquals(0, d.getMinute());

        assertEquals(7, e.getHour());
        assertEquals(55, e.getMinute());
    }
}
