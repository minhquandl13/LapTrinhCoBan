package TestEercise4_5;

import Exercise4_5.AGallery;
import Exercise4_5.Image;
import Exercise4_5.Sound;
import Exercise4_5.Text;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class AGalleryTest {
    private AGallery image;
    private AGallery sound;
    private AGallery text;

    @Before
    public void setUpCase() {
        image = new Image("abc", 1, 1, 1, "high");
        sound = new Sound("xyz", 2, 1);
        text = new Text("asd", 3, 100);
    }

    @Test
    public void test_AGallery() {
        assertNotNull(image);
        assertNotNull(sound);
        assertNotNull(text);
    }

    @Test
    public void test_TimeToDownload() {
        assertEquals(0.001, image.timeToDownload(1000.0), 0.1);
        assertEquals(0.002, sound.timeToDownload(1000.0), 0.1);
        assertEquals(0.003, text.timeToDownload(1000.0), 0.1);
    }

    @Test
    public void test_SmallerThan() {
        assertFalse(image.smallerThan(0));
        assertTrue(sound.smallerThan(4));
        assertFalse(text.smallerThan(3));
    }

    @Test
    public void test_SameName() {
        assertTrue(image.sameName("abc"));
        assertFalse(sound.sameName("qwe"));
        assertTrue(text.sameName("asd"));
    }
}
