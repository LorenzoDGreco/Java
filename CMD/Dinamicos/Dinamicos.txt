import java.util.Scanner;
public class Dinamicos
{
  public static void main(String args[])
  {
   Scanner Tecla = new Scanner(System.in);
   int longitud= 0;

   System.out.println("Ingrese la cantidad deseada de numeros que se quiere ingresar: ");
   longitud = Tecla.nextInt();   

   int num[]=new int[longitud];

   for(int i=0; i<num.length;i++)
   {
    System.out.print("Ingresa el valor #"+ (i+1)+ ": ");
    num[i]=Tecla.nextInt();
   }
   for(int i=0; i<num.length;i++)
   {
    System.out.print("["+ num[i] +"]");
   }
  }
}