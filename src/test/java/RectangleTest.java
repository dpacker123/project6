//David Packer
//Project 6
import bsu.comp152.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    //Inner rectangle was inside the outside rectangle which should have been a hit
    //This caused the test to fail when it should have passed
    // Fixed your code by making it an or instead of an and.
    // Also changed the sign from greater than to less than
    @Test
    public void testRectangleInsideRectangle() {
        Rectangle outerRectangle = new Rectangle(2, 4, 8, 1);
        Rectangle innerRectangle = new Rectangle(3, 3, 6, 2);
        assertTrue(outerRectangle.doesHit(innerRectangle));
    }

    @Test
    public void testRectangleOutsideRectangle() {
        Rectangle outerRectangle = new Rectangle(2, 4, 3, 3);
        Rectangle innerRectangle = new Rectangle(6, 8, 10, 5);
        assertFalse(outerRectangle.doesHit(innerRectangle));
    }

    @Test
    public void testRectangleOverlapUpperLeftRectangle() {
        Rectangle outerRectangle = new Rectangle(2, 4, 8, 1);
        Rectangle innerRectangle = new Rectangle(3, 3, 10, 2);
        assertTrue(outerRectangle.doesHit(innerRectangle));
    }

    @Test
    public void testRectangleIdentical() {
        Rectangle outerRectangle = new Rectangle(2, 4, 8, 1);
        Rectangle innerRectangle = new Rectangle(2, 4, 8, 1);
        assertTrue(outerRectangle.doesHit(innerRectangle));
    }

    @Test
    public void testRectangleInside() {
        Rectangle outerRectangle = new Rectangle(2, 4, 8, 1);
        Rectangle innerRectangle = new Rectangle(3, 3, 6, 2);
        assertTrue(innerRectangle.doesHit(outerRectangle));
    }

}

