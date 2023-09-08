package bitshifter;

public class BitShifter {

    public static void main(String[] args) {
        long inicioX = System.nanoTime();
        for (int x = 0; x < 1000000; x++) {
            int a = 0;
            a = 128/32;
        }
        long finX = System.nanoTime() - inicioX;
        
        long inicioY = System.nanoTime();
        for (int y = 0; y < 1000000; y++) {
            int b = 0;
            b = 128 >> 5;
        }
        long finY = System.nanoTime() - inicioY;
        System.out.println("Tiempo división: " + finX);
        System.out.println("Tiempo Shifting: " + finY);    
    }
    
}
/*
    mueve el bit 5 veces a la derecha
  128   64  32   16   8   4   2   1
   0    0   0    0    0   1   0   0

    ">>" así para dividir, "<<" Así para multiplicar
*/