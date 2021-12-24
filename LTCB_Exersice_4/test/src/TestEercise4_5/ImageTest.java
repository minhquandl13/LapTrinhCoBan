package TestEercise4_5;

import Exercise4_5.Image;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ImageTest {
    private Image image;

    @Before
    public void setUpCase() {
        image = new Image("abc", 1, 1, 1, "high");
    }

    @Test
    public void test_Image() {
        assertNotNull(image);
    }

    @Test
    public void test_TimeToDownload() {
        assertEquals(0.001, image.timeToDownload(1000.0), 0.1);
    }

    @Test
    public void test_SmallerThan() {
        assertFalse(image.smallerThan(0));
    }

    @Test
    public void test_SameName() {
        assertTrue(image.sameName("abc"));
    }
}
