
package suma;

import java.util.Scanner;


public class SumaMain {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Dame el primer valor: ");
        int valorUno = entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        int valorDos = entrada.nextInt();
        
        Suma valores = new Suma(valorDos, valorUno);
        valores.Imprimir();
    }
}
