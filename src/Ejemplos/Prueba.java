package Ejemplos;

import org.junit.Test;

import static org.junit.Assert.*;

public class Prueba {

    @Test
    public void myTestMethod(){
        assertEquals(2, 2);
        System.out.println("Good");
    }

    @Test
    public void myTestMethod2(){
        assertNotEquals(2, 3);
        System.out.println("Very Good");
    }
    @Test
    public void Test1(){
        assertTrue(true);
        System.out.println("Is true");
    }
    @Test
    public void Test2(){
        assertTrue( 2 == 2);
        System.out.println("Is true operation");
    }
    @Test
    public void Test3(){
        assertTrue("abc".length() ==3);
        System.out.println("Is true length");
    }
}
