package TestExercise2_4;

import Baitap2_4.Coffee;
import junit.framework.TestCase;

public class CoffeeTest extends TestCase {

    public void test_Coffee() {
        Coffee coffeeA = new Coffee("NetCafe", 3_000, 1);
        Coffee coffeeB = new Coffee("NetCafe", 3_000, 2);
        Coffee coffeeC = new Coffee("NetCafe", 3_000, 7);
        Coffee coffeeD = new Coffee("NetCafe", 0, 0);
    }

    public void test_Cost() {
        Coffee coffeeA = new Coffee("NetCafe", 3_000, 1);
        Coffee coffeeB = new Coffee("NetCafe", 3_000, 2);
        Coffee coffeeC = new Coffee("NetCafe", 3_000, 7);
        Coffee coffeeD = new Coffee("NetCafe", 0, 0);

        assertEquals(3_000.0, coffeeA.cost());
        assertEquals(600.0, coffeeB.cost());
        assertEquals(5_250.0, coffeeC.cost());
        assertEquals(0.0, coffeeD.cost());
    }
}
