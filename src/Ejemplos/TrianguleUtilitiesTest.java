package Ejemplos;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrianguleUtilitiesTest {

    @Test
    public void getArea() {
    }

    @Test
    public void getPerimeter() {
    }

    @Test
    public void isEquilateral() {
        assertFalse(TrianguleUtilities.isEquilateral(2, 3, 4));
        assertFalse(TrianguleUtilities.isEquilateral(2, 3, 3));
        assertTrue(TrianguleUtilities.isEquilateral(4, 4, 4));
    }
}