package TestEercise4_5;

import Exercise4_5.Sound;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
public class SoundTest {
    private Sound sound;

    @Before
    public void setUpCase() {
        sound = new Sound("xyz", 2, 1);
    }

    @Test
    public void test_Sound() {
        assertNotNull(sound);
    }

    @Test
    public void test_TimeToDownload() {
        assertEquals(0.002, sound.timeToDownload(1000.0), 0.1);
    }

    @Test
    public void test_SmallerThan() {
        assertTrue(sound.smallerThan(4));
        assertFalse(sound.smallerThan(0));
    }

    @Test
    public void test_SameName() {
        assertFalse(sound.sameName("qwe"));
        assertTrue(sound.sameName("xyz"));
    }
}
