import java.util.Scanner;
public class CocaCola
{
  public static void main (String args[])
  {
   Scanner ingresado = new Scanner(System.in);
   String nombre= "";
   int clave= 0,  antiguedad=0;
   System.out.println("Bienvenido al Sistema Vacacional de Coca-Cola Company");
   System.out.println("Para empezar responde las siguientes preguntas para comprar y ver cuantos dias de vacaciones va a tener tu empleado.");
   
   System.out.println("Primera Pregunta: ¿Cuál es el nombre del trabajador?");
   nombre = ingresado.nextLine();

   System.out.println("Segunda Pregunta: ¿Cuantos años de servicio tiene el trabajador?");
   antiguedad = ingresado.nextInt();

   System.out.println("Tercera y Última Pregunta: ¿Cuál es la clave de su departamento?");
   clave = ingresado.nextInt();

   
   if(clave==1)
   {
    if(antiguedad==1){
     System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 6 días de vacaciones.");}
     else if(antiguedad >=2 && antiguedad<=6){
      System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 14 días de vacaciones.");}
     else if(antiguedad >=7){
       System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 20 días de vacaciones.");}
     else{
        System.out.println("El Trabajador " + nombre + " aún no puede entrar al sistema de vacaciones por su antiguedad de " + antiguedad + " años");}
   }


   else if (clave==2)
   {
    if(antiguedad==1){
     System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 7 días de vacaciones.");}
     else if(antiguedad >=2 && antiguedad<=6){
      System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 15 días de vacaciones.");}
     else if(antiguedad >=7){
       System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 22 días de vacaciones.");}
     else{
        System.out.println("El Trabajador " + nombre + " aún no puede entrar al sistema de vacaciones por su antiguedad de " + antiguedad + " años");}
   }

   else if (clave==3)
   {
    if(antiguedad==1){
     System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 10 días de vacaciones.");}
     else if(antiguedad >=2 && antiguedad<=6){
      System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 20 días de vacaciones.");}
     else if(antiguedad >=7){
       System.out.println("El trabajador " + nombre + " con su clave número " + clave + " tiene designado 30 días de vacaciones.");}
     else{
        System.out.println("El Trabajador " + nombre + " aún no puede entrar al sistema de vacaciones por su antiguedad de " + antiguedad + " años");}
   }



   else if (clave >= 4)
   {
    System.out.println("La clave " + clave + " no está registrada actualmente.");
   }

  }
}