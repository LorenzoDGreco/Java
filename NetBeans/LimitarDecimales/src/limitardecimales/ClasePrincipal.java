package limitardecimales;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
        
public class ClasePrincipal {

    public static void main(String[] args) {

        double numero = 2;
        double raiz = Math.sqrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        
        //Utilizando la clase DecumalFormat
        DecimalFormat df = new DecimalFormat("#.00"); //La cantidad de 0 son los numeros que estas permitiendo mostrar
        System.out.println("La raíz cuadrada de " + numero + " es: " + df.format(raiz));
        
        //Utilizando String format
        System.out.println("La raíz cuadrada de " + numero + " es: " + String.format("%.4f", raiz));  //pues deja la f y cambia el 2 por lo que se quiera mostrar
        
        //Utilizando la clase Math.round
        System.out.println("La raíz cuadrada de " + numero + " es: " + (double)Math.round(raiz * 1000000d)/1000000); //cada 0 es un numero mas que se permite, ademas al utilizar este codigo sale 1.41... en vez de 1,41...
        
        //Utilizando BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(8, RoundingMode.HALF_UP);
        System.out.println("La raíz cuadrada de " + numero + " es: " + bd.doubleValue());
    }
}
