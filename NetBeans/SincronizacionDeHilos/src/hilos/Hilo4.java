/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author loren
 */
public class Hilo4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("K");
            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en funcion hilo4: " + e);
            }
        }
    }
}
