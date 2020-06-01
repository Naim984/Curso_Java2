package com.company;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    private int nbErrors = 0;

    public void testAdd() {
        Calculadora calculadora1 = new Calculadora();
        double result = calculadora1.add(10, 50);
        assertEquals(60, result, 0);

    }

    public static void main(String[] args) {
        CalculadoraTest test = new CalculadoraTest();
        try {
            test.testAdd();
        } catch (Throwable e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors > 0) {
            throw new IllegalStateException("There were " + test.nbErrors
                    + " error(s)");
        }
    }
}



