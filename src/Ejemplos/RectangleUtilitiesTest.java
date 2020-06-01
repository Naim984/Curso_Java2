package Ejemplos;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleUtilitiesTest {
    @Test
    public void testGetPerimeter() {
        int height = 4;
        int width = 6;
        int expected = 20;// 2 * ( 4+6 )
        int actual = RectangleUtilities.getPerimeter(height, width);
        assertEquals(expected, actual);
    }


}