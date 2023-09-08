/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author loren
 */
public class Ingreso extends metodos {

    @Override
    public void Transacciones() {

        System.out.println("--------------------------------------------");
        System.out.print("Ingrese la cantidad que se quiera ingresar: ");
        deposito = tecla.nextInt();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("Ingresaste: " + deposito);
        System.out.println("Saldo total actual: " + getSaldo());
        System.out.println("--------------------------------------------");
    }
}
