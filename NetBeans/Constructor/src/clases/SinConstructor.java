package clases;
import java.util.Scanner;

public class SinConstructor {
    private Scanner tecla = new Scanner(System.in);
    String nombre = "";
    public void PedirNombre(){
        System.out.println("Cual es tu nombre??: ");
        nombre = tecla.nextLine(); 
    }
    
    public void Imprimir(){
        System.out.println("Tu nombre es: " + nombre);
    }
}
