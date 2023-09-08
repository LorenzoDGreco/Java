package clases;

public class Proceso2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("segundo for: " + i);
        }
        System.out.println("termino la segunda");
    }
}
