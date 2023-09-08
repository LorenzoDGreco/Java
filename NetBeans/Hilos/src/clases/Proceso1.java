package clases;

public class Proceso1 extends Thread {  //para utilizar los hilos hace falta utilizar la programacion orientada a objetos (POO) y agregar el threads ya que ese se va a encargar de hacer toda la wea unida
    
    // a la vez esto es un polimorfismo
    @Override
    public void run() {   //Si no se coloca el Run kgaste fuego makinolita no va  a andar ni por putas
        for (int i = 0; i <= 5; i++) {
            System.out.println("primer for: " + i);

        }
        System.out.println("termino la primera");
    }
}
