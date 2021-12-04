package TestEercise4_2;
import Exercise4_2.*;
import org.junit.Test;


import static org.junit.Assert.*;
public class ImagesTest {

    @Test
    public void test_Images() {
        Gallery image = new Images("Flower.gif", 57_234, 100, 50, "medium");

        assertNotNull(image);
    }
}
