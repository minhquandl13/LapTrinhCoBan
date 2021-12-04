package TestEercise4_2;
import Exercise4_2.*;
import org.junit.Test;


import static org.junit.Assert.*;
public class TextsTest {

    @Test
    public void test_Texts() {
        Gallery text = new Texts("Welcome.txt", 5_312, 830);

        assertNotNull(text);
    }
}