package herencia;
import java.util.Scanner;

public class Herencia {
    protected int valor1,valor2,result;
    Scanner teclado = new Scanner(System.in);
    
    public void PedirDatos() {
            System.out.print("Dame el primer valor: ");
            valor1 = teclado.nextInt();
            
            System.out.print("Dame el segundo valor: ");
            valor2 = teclado.nextInt();
   }
    public void  Resultado(){
        System.out.println(result);
    }
}
