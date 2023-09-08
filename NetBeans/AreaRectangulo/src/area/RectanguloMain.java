package area;

import java.util.Scanner;

public class RectanguloMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame el valor de la base: ");
        int base = entrada.nextInt();

        System.out.print("Dame el valor de la Altura: ");
        int altura = entrada.nextInt();

        Rectangulo Area = new Rectangulo(base, altura);
        Area.Imprimir();
    }

}
