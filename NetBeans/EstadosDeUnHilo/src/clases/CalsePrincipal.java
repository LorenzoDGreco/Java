package clases;

public class CalsePrincipal {

    public static void main(String[] args) {
        HiloProceso hilo1 = new HiloProceso(" Hilo1");
        HiloProceso hilo2 = new HiloProceso(" Hilo2");

        hilo1.start();

        try {
            hilo1.sleep(1000);
        } catch (InterruptedException variable) {
            System.out.println("Error en el hilo1!! " + variable);
        }

        hilo2.start();

        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2!! " + e);
        }

    }

}
