package TestExercise3_2;
import Baitap3_2.BirthDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBirthDate {

    @Test
    public void BirthDate() {
        BirthDate birthDate = new BirthDate(1, 5, 2003);
        assertNotNull(birthDate);
    }
}
