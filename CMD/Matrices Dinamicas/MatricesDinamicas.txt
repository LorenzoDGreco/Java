import java.util.Scanner;
public class MatricesDinamicas
{
  public static void main(String args[])
  {
   Scanner Tecla = new Scanner(System.in);
   int filas= 0, columnas=0, contador=0;
   
   System.out.println("Ingrese la cantidad deseada de filas: ");
   filas = Tecla.nextInt();

   System.out.println("Ingrese la cantidad deseada de columnas: ");
   columnas = Tecla.nextInt();

   int num[][]=new int[filas][columnas];

   
   for(int j=0; j<filas;j++)
   {
    for(int i=0; i<columnas; i++)
    {
     num[j][i]=contador;
     contador++;
     System.out.print("[" + num[j][i] + "]");
    }
    System.out.println("");
   }

  }
}