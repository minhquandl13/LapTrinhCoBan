package TestExercise2_3;

import Baitap2_3.Image;
import junit.framework.TestCase;

public class ImageTest extends TestCase {

    public void test_Image() {
        Image imageA = new Image(1920, 1080, ".png", "high");
        Image imageB = new Image(1280, 720, ".jpg", "medium");

        assertNotNull(imageA);
        assertNotNull(imageB);
    }

    public void test_IsPortrait() {
        Image imageA = new Image(1920, 1080, ".png", "high");
        Image imageB = new Image(1280, 720, ".jpg", "medium");

        assertFalse(imageA.isPortrait());
        assertFalse(imageB.isPortrait());
        System.out.println(imageA.isPortrait());
    }

    public void test_Size() {
        Image imageA = new Image(1920, 1080, ".png", "high");
        Image imageB = new Image(1280, 720, ".jpg", "medium");

        assertEquals(imageA.size(), 2_073_600);
        assertEquals(imageB.size(), 921_600);
    }

    public void test_IsLarger() {
        Image imageA = new Image(1920, 1080, ".png", "high");
        Image imageB = new Image(1280, 720, ".jpg", "medium");

        Image otherImageA = new Image(1280, 720, ".jpg", "medium");
        Image otherImageB = new Image(1920, 1080, ".png", "high");

        assertTrue(imageA.isLarger(otherImageA));
        assertFalse(imageB.isLarger(otherImageB));
    }

    public void test_Equals() {
        Image imageA = new Image(1920, 1080, ".png", "high");
        Image imageC = new Image(1920, 1080, ".png", "high");
        Image imageB = new Image(1920, 1080, ".png", "high");

        assertEquals(imageA, imageB);
    }

    public void test_Same() {
        Image imageA = new Image(1920, 1080, ".png", "high");
        Image imageB = new Image(1920, 1080, ".png", "high");
        Image imageC = new Image(1920, 1080, ".png", "high");

        assertTrue(imageA.same(imageB));
        assertTrue(imageB.same(imageC));
    }

    public void test_SizeString() {
        Image imageA = new Image(1, 1080, ".png", "small");
        Image imageB = new Image(1, 20_000, ".jpg", "medium");
        Image imageC = new Image(1920, 1080, ".png", "large");
        Image imageD = new Image(-1, 720, ".jpg", "small");

        assertEquals(imageA.sizeString(), "small");
        assertEquals(imageB.sizeString(), "medium");
        assertEquals(imageC.sizeString(), "large");
        assertEquals(imageD.sizeString(), "small");
    }
}
