/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Lorenzo Greco
 */
public class ClaseMain {

    public static void main(String[] args) {
        Scanner Tecla = new Scanner(System.in);
        System.out.print("Introduce el numero para calcular su factorial: ");
        int numero = Tecla.nextInt();
        
        Factorial factorial = new Factorial();
        
        int factorial1 = factorial.factorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial1);
    }
}
