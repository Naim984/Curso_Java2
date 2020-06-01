package Ejemplos;

public class TrianguleUtilities {
    static public double getArea(int base, int height){
        return 0.5 * base * height;
    }
    static int getPerimeter(int sideA, int sideB, int sideC){
        return sideA + sideB + sideC;
    }
    public static boolean isEquilateral( int sideA, int sideB, int sideC){
      //  throw new java.lang.UnsupportedOperationException("Not yea implemented");
        return (sideA == sideB && sideB == sideC && sideA == sideC);
         }
}
