import java.util.Scanner;
public class Cadenas
{
  public static void main (String args[])
  {
   Scanner Tecla = new Scanner (System.in);
   String Cadena= "", CadenaSub="";
   int NumCaracteres=0 , NumEntr=0, NumSal=0;

   System.out.print("Introduce una serie de Caracteres: ");
   Cadena = Tecla.nextLine();

   NumCaracteres = Cadena.length();

   System.out.println("Su cadena es " + Cadena + " y tiene un total de " + NumCaracteres + " caracteres.");

   System.out.print("¿Desde que caracter desea empezar a extraer esa cadena?: ");
   NumEntr= Tecla.nextInt();
   System.out.print("¿Hasta donde quiere extraer esa cadena?: ");
   NumSal= Tecla.nextInt();

   CadenaSub = Cadena.substring(NumEntr, NumSal);
   System.out.print("La cadena que elegiste es: " + CadenaSub);
  }
}