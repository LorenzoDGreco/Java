package lavadora_uno;

import java.util.Scanner;
import libreria.LLFun;

/**
 *
 * @author loren
 */
public class Lavadora_Uno {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 si es blanca / Presiona 2 si es de color");
        int TipoRopa = tecla.nextInt();

        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = tecla.nextInt();

        LLFun Funciones = new LLFun(TipoRopa, kilos);
        Funciones.setTipoRopa(2);
        System.out.println("El tipo de ropa es: " + Funciones.getTipoRopa());
        Funciones.CicloFinalizado();
    }
}
