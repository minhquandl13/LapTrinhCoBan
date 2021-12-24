package TestEercise4_5;

import Exercise4_5.Text;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class TextTest {
    private Text text;

    @Before
    public void setUpCase() {
        text = new Text("asd", 3, 100);
    }

    @Test
    public void test_Text() {
        assertNotNull(text);
    }


    @Test
    public void test_TimeToDownload() {
        assertEquals(0.003, text.timeToDownload(1000.0), 0.1);
    }

    @Test
    public void test_SmallerThan() {
        assertFalse(text.smallerThan(3));
        assertTrue(text.smallerThan(24));
    }

    @Test
    public void test_SameName() {
        assertTrue(text.sameName("asd"));
        assertFalse(text.sameName("abc"));
    }
}
