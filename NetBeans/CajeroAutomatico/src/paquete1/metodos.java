package paquete1;

import java.util.Scanner;

public abstract class metodos {

    protected int transacciones, retiro, deposito;
    private static int Saldo;
    public Scanner tecla = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int Seleccion = 0;
        do {
            do {
                System.out.println("Seleccione una de las siguientes opciones: "
                        + "\n    1. Consultar credito."
                        + "\n    2. Retirar Credito."
                        + "\n    3. Deposito de Credito."
                        + "\n    4. Salir.");
                Seleccion = tecla.nextInt();

                if (Seleccion >= 1 && Seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------");
                    System.out.println("Opcion no disponible");
                    System.out.println("---------------------");
                }
            } while (bandera == 0);
            if (Seleccion == 1) {
                    metodos consulta = new Consulta();
                    consulta.Transacciones();
            } else if (Seleccion == 2) {
                    metodos retiro = new Retiro();
                    retiro.Transacciones();
            } else if (Seleccion == 3) {
                    metodos ingreso = new Ingreso();
                    ingreso.Transacciones();
            } else if (Seleccion == 4) {

                System.out.println("---------------------------");
                System.out.println("-¡Gracias!, Vuelva pronto.-");
                System.out.println("---------------------------");
                bandera = 2;
            }

        } while (bandera != 2);
        

    }
    public abstract void Transacciones();

    public static int getSaldo() {
        return Saldo;
    }
    public static void setSaldo(int aSaldo) {
        Saldo = aSaldo;
    }

    
}
