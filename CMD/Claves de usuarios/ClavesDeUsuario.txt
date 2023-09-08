import java.util.Scanner;
public class ClavesDeUsuario 
{
  public static void main(String args[])
  {

   Scanner Tecla = new Scanner (System.in);
   String Nombre= "Lorenzo", Nombre_ingresado= "", Clave="1234", Clave_ingresada="";

   System.out.print("Ingrese el Nombre del usuario: ");
   Nombre_ingresado = Tecla.nextLine();

   System.out.print("Ingrese la Clave del usuario: ");
   Clave_ingresada = Tecla.nextLine();

   if(Nombre_ingresado.equals(Nombre) && Clave_ingresada.equals(Clave))
   {
    System.out.println("Inicio Correcto.");
   }
   else
   {
    System.out.println("Usuario/Clave incorrecta, intentelo denuevo.");
   }
  }
}