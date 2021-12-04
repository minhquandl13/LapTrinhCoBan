package TestEercise4_2;
import Exercise4_2.*;
import org.junit.Test;


import static org.junit.Assert.*;
public class SoundTest {

    @Test
    public void test_Sounds() {
        Gallery sound = new Sounds("Theme.mp3", 40_960, new PlayingTimeOfTheRecording(3, 20));

        assertNotNull(sound);
    }
}