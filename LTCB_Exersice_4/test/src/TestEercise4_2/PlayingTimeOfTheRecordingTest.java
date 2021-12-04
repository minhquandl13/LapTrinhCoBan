package TestEercise4_2;
import Exercise4_2.*;
import org.junit.Test;


import static org.junit.Assert.*;
public class PlayingTimeOfTheRecordingTest {

    @Test
    public void test_PlayingTimeOfTheRecordingTest() {
        PlayingTimeOfTheRecording time = new PlayingTimeOfTheRecording(3, 20);

        assertNotNull(time);
    }
}
