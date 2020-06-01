package Ejemplos;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrianguleUtilitiesIsoTest {



    @Test
    public void isIsoceles() {
        int sideA = 3;
        int sideB = 2;
        int sideC = 3;
        assertTrue(TrianguleUtilitiesIso.isIsoceles(sideA,sideB,sideC));

    }
}