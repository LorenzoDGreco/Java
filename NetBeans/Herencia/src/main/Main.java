/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import herencia.hija_suma;
import herencia.hija_resta;

/**
 *
 * @author Alumno
 */
public class Main {

    public static void main(String[] args) {
        hija_suma suma1 = new hija_suma();
        hija_resta resta1 = new hija_resta();

        suma1.PedirDatos();
        suma1.Sumar();
        System.out.print("El resultado de la suma es: ");
        suma1.Resultado();

        resta1.PedirDatos();
        resta1.Resta();
        System.out.print("El resultado de la resta es: ");
        resta1.Resultado();
    }

}
