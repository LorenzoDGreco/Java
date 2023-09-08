package paquete1;

public class Retiro extends metodos {

    @Override
    public void Transacciones() {

        System.out.println("----------------------------------------");
        System.out.print("Ingrese la cantidad que se quiera retirar: ");
        retiro = tecla.nextInt();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones -  retiro);
            System.out.println("Retiraste: " + retiro);
            System.out.println("Saldo total actual: " + getSaldo());
            System.out.println("----------------------------------------");
        } else {
            System.out.println("         Saldo insuficiente");
            System.out.println("----------------------------------------");
        }

    }
}
