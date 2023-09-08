package paquete1;


public class Consulta extends metodos{
    @Override
    public void Transacciones(){
                System.out.println("----------------------------------------");
                System.out.println("El Saldo actual de la cuenta es: " + getSaldo());
                System.out.println("----------------------------------------");
    }
}
