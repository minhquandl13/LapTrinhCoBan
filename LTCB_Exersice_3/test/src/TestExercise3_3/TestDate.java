package TestExercise3_3;

import Baitap3_3.Date;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestDate  {

    @Test
    public void test_Date() {
        Date date1 = new Date(11, 11, 2011);
        Date date2 = new Date(6, 13, 2019);

        assertNotNull(date1);
        assertNotNull(date2);
    }
}
