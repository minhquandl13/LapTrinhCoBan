package TestExercise3_4;

import Baitap3_4.ClockTime;
import Baitap3_4.Route;
import Baitap3_4.Schedule;
import Baitap3_4.Train;
import junit.framework.TestCase;

public class TestTrain extends TestCase {
    private ClockTime clockTime1 = new ClockTime(3, 31);
    private ClockTime clockTime2 = new ClockTime(11, 30);
    private ClockTime clockTime3 = new ClockTime(12, 30);
    private ClockTime clockTime4 = new ClockTime(19, 25);
    private ClockTime clockTime5 = new ClockTime(11, 30);

    private Schedule schedule1 = new Schedule(clockTime1, clockTime3);
    private Schedule schedule2 = new Schedule(clockTime3, clockTime4);
    private Schedule schedule3 = new Schedule(clockTime4, clockTime2);
    private Schedule schedule4 = new Schedule(clockTime3, clockTime5);
    private Schedule schedule5 = new Schedule(clockTime4, clockTime5);

    private Route route1 = new Route("Ha Noi", "Sai Gon");
    private Route route2 = new Route("HSai Gon", "Da Lat");
    private Route route3 = new Route("Ha Noi", "Da Nang");
    private Route route4 = new Route("Sai Gon", "Da Nang");
    private Route route5 = new Route("Ha Noi", "Da Lat");

    public void test_Train() {
        Train trainA = new Train(schedule1, route1, true);
        Train trainB = new Train(schedule2, route2, false);
        Train trainC = new Train(schedule3, route3, false);
        Train trainD = new Train(schedule4, route4, true);
        Train trainE = new Train(schedule5, route5, true);

        assertNotNull(trainA);
        assertNotNull(trainB);
        assertNotNull(trainC);
        assertNotNull(trainD);
        assertNotNull(trainE);
    }

    public void test_IsDestination() {
        Train trainA = new Train(schedule1, route1, true);
        Train trainB = new Train(schedule2, route2, false);
        Train trainC = new Train(schedule3, route3, false);
        Train trainD = new Train(schedule4, route4, true);
        Train trainE = new Train(schedule5, route5, true);

        assertFalse(trainA.isSameDestination(trainB));
        assertTrue(trainB.isSameDestination(trainE));
        assertTrue(trainC.isSameDestination(trainD));
        assertFalse(trainE.isSameDestination(trainC));
        assertFalse(trainC.isSameDestination(trainA));
    }

    public void test_IsTimeTrainDeparture() {
        Train trainA = new Train(schedule1, route1, true);
        Train trainB = new Train(schedule2, route2, false);
        Train trainC = new Train(schedule3, route3, false);
        Train trainD = new Train(schedule4, route4, true);
        Train trainE = new Train(schedule5, route5, true);

        assertTrue(trainC.isTimeTrainDeparture(trainE));
        assertFalse(trainA.isTimeTrainDeparture(trainC));
        assertTrue(trainD.isTimeTrainDeparture(trainB));
        assertFalse(trainB.isTimeTrainDeparture(trainE));
        assertFalse(trainE.isTimeTrainDeparture(trainA));
    }

    public void test_GetTripTime() {
        Train trainA = new Train(schedule1, route1, true);
        Train trainB = new Train(schedule2, route2, false);
        Train trainC = new Train(schedule3, route3, false);
        Train trainD = new Train(schedule4, route4, true);
        Train trainE = new Train(schedule5, route5, true);

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
