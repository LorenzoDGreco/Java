/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebametodosleep;

/**
 *
 * @author loren
 */
public class PruebaMetodoSleep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("asdasd");
        try{
        Thread.sleep(1000);
        }catch(InterruptedException e) {
            System.out.println("asd");
        }
        System.out.println("asdasdasd");
    }
    
}
