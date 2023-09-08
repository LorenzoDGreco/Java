package clases;

public class ClasePrincipal {

    public static void main(String[] args) {
        
        Proceso1 hilo1 = new Proceso1(); //cuando se utiliza extends/herencia
        Thread hilo2 = new Thread(new Proceso2()); //cuando se utiliza implements/implementos
        //primero se crean las 2 variables y luego los seteas
        
        hilo1.start();
        hilo2.start();
        
        
        
        
        
        
        
        
        
        /*for (int i = 0; i <= 5; i++) {
            System.out.println("primer for: " + i);

        }
        System.out.println("termino la primera");

        for (int i = 0; i <= 5; i++) {
            System.out.println("segundo for: " + i);

        }
        System.out.println("termino la segunda");*/
    }
}
