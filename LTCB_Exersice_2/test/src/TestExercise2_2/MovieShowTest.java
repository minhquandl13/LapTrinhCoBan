package TestExercise2_2;

import Baitap2_2.MovieShow;
import junit.framework.TestCase;

public class MovieShowTest extends TestCase {
    public void test_MovieShow() {
        MovieShow aMovieA = new MovieShow(5.0, 20.0, 0.15);
        MovieShow aMovieB = new MovieShow(6.0, 40.0, 0.1);
        MovieShow aMovieC = new MovieShow(7.0, 50.0, 0.2);

        assertEquals(465.0, aMovieA.totalProfit(100), 0.001);
        assertEquals(550.0, aMovieB.totalProfit(100), 0.001);
        assertEquals(630.0, aMovieC.totalProfit(100), 0.001);
    }

    public void test_Cost() {
        MovieShow aMovieA = new MovieShow(5.0, 20.0, 0.15);
        MovieShow aMovieB = new MovieShow(6.0, 40.0, 0.1);
        MovieShow aMovieC = new MovieShow(7.0, 50.0, 0.2);

        assertEquals(35.0, aMovieA.cost(100), 0.001);
        assertEquals(50.0, aMovieB.cost(100), 0.001);
        assertEquals(70.0, aMovieC.cost(100), 0.001);
    }

    public void test_Revenue() {
        MovieShow aMovieA = new MovieShow(5.0, 20.0, 0.15);
        MovieShow aMovieB = new MovieShow(6.0, 40.0, 0.1);
        MovieShow aMovieC = new MovieShow(7.0, 50.0, 0.2);


        assertEquals(500.0, aMovieA.revenue(100), 0.001);
        assertEquals(600.0, aMovieB.revenue(100), 0.001);
        assertEquals(700.0, aMovieC.revenue(100), 0.001);
    }

    public void test_TotalProfit() {
        MovieShow aMovieA = new MovieShow(5.0, 20.0, 0.15);
        MovieShow aMovieB = new MovieShow(6.0, 40.0, 0.1);
        MovieShow aMovieC = new MovieShow(7.0, 50.0, 0.2);

        assertEquals(465.0, aMovieA.totalProfit(100), 0.001);
        assertEquals(550.0, aMovieB.totalProfit(100), 0.001);
        assertEquals(630.0, aMovieC.totalProfit(100), 0.001);
    }
}
