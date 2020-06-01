package Ejemplos;

public class TrianguleUtilitiesIso {


    static int getPerimeter(int sideA, int sideB, int sideC){
        return sideA + sideB + sideC;
    }
    public static boolean isIsoceles( int sideA, int sideB, int sideC){
      //  throw new java.lang.UnsupportedOperationException("Not yea implemented");
        return sideA == sideB || sideB == sideC;
         }
}
