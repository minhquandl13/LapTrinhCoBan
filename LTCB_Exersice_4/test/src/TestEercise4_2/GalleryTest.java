package TestEercise4_2;


import Exercise4_2.*;
import org.junit.Test;


import static org.junit.Assert.*;

public class GalleryTest {

    @Test
    public void test_Gallery() {
        Gallery image = new Images("Flower.gif", 57_234, 100, 50, "medium");
        Gallery text = new Texts("Welcome.txt", 5_312, 830);
        Gallery sound = new Sounds("Theme.mp3", 40_960, new PlayingTimeOfTheRecording(3, 20));

        assertNotNull(image);
        assertNotNull(text);
        assertNotNull(sound);
    }
}
