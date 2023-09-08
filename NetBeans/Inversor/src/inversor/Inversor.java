package inversor;

import java.util.Scanner;

public class Inversor {

    public static void main(String[] args) {
        String Palabra = "", PalabraInvertida = "";
        int LongPalabra = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe una palabra o frase: ");
        Palabra = entrada.nextLine();
        
        LongPalabra= Palabra.length();
        
        while (LongPalabra!=0) {
          
            PalabraInvertida += Palabra.substring(LongPalabra -1, LongPalabra);
            LongPalabra--; 
        }
        System.out.println("Palabra Invertida: " + PalabraInvertida);
    }

}
