package clases;

import java.util.Scanner;

public class ConConstructor {
    public ConConstructor(){
        Scanner tecla = new Scanner(System.in);
        String name = "";
        
        System.out.println("Dame tu name: ");
        name = tecla.nextLine();
        System.out.println("Tu name es: " + name);
        
    }
}
