package excepciones;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {

        try {
            //codigo
            int val1, val2, resultado;
            Scanner tecla = new Scanner(System.in);

            System.out.println("Ingrese el primer valor: ");
            val1 = tecla.nextInt();

            System.out.println("Ingese el segundo valor: ");
            val2 = tecla.nextInt();

            resultado = val1 / val2;

            System.out.println("Resultado de la diision es:" + resultado);
            
        } catch (Exception variable) {          //cualquier nombre
            //comportamiento
            System.out.println("Error!!! " + variable);
        } finally{
            System.out.println("Operacion Concluida!!");
        }
        /*
        int val1, val2, resultado;
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Ingrese el primer valor: ");
        val1 = tecla.nextInt();                             ESTA TODO DESABILITADO YA QUE AL USAR EL TRY TENES QUE PONER TODO EL CODICO AHÍ
        
        System.out.println("Ingese el segundo valor: ");
        val2 = tecla.nextInt();
        
        resultado = val1 / val2;
        
        System.out.println("Resultado de la diision es:" + resultado); */
    }

}
