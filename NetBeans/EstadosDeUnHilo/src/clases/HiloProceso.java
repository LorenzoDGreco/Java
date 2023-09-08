package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloProceso extends Thread {

    public HiloProceso(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + getName());
            try {
                HiloProceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error dentro de la clase!! " + e);
            }
        }
    }
}
