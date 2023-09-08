package clases;


public class Proceso extends Thread{
    int valfor;
    
   public Proceso(String texto){
       super(texto);
   }
    
    @Override
    public void run(){
        for(int i= 0 ; i <= valfor; i++){
            System.out.println(i + this.getName());
        }
        System.out.println("");
    }
    
    public void RecibirNumerito(int valor){
        this.valfor = valor;
    }
}
