package TestExercise3_4;

import Baitap3_4.Route;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestRoute {

    @Test
    public void test_Route() {
        Route route1 = new Route("Ha Noi", "Sai Gon");
        Route route2 = new Route("HSai Gon", "Da Lat");

        assertNotNull(route1);
        assertNotNull(route2);
    }

    @Test
    public void test_IsSameDestination() {
        Route route1 = new Route("Ha Noi", "Sai Gon");
        Route route2 = new Route("HSai Gon", "Da Lat");
        Route route3 = new Route("Ha Noi", "Da Lat");

        assertFalse(route1.isSameDestination(route2));
        assertTrue(route2.isSameDestination(route3));
    }
}
