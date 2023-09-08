/*
 * Clase para las funciones logiucas de una lavadora de Samsung
 */
package llfun;

/**
 *
 * @author Lorenzo Greco
 */
public class LLFun {

    private int kilos = 0, llenadoCompleto = 0, TipoRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;

    public LLFun(int kilos, int TipoRopa) {
        this.kilos = kilos;
        this.TipoRopa = TipoRopa;
    }

    private void Llenado() {
        if (kilos <= 12) {     //en el caso que el lavaropa solo soporte una maxima de 12 kilos
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("LLenado Completo");
        } else {
            System.out.println("Error, no se pudo uniciar porque superaste el peso limite, por favor reduce la cantidad y intentalo de nuevo");
        }
    }

    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (TipoRopa == 1) {
                System.out.println("Se ingreso ropa blanca/ Lavado Suave");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            } else if (TipoRopa == 2) {
                System.out.println("Ropa de Color / Lavado Intenso");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no está disponible / Elija 1 para blanco, elija 2 para color");
                System.out.println("Será tomado como ropa de Color / Lavado Intenso");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }
        } else {
            System.out.println("No se terminó de lavar");
        }
    }

    private void Secado() {
        Lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Secando...");
            System.out.println("Secado Terminado!");
            secadoCompleto = 1;
        } else {
            System.out.println("No se terminó de lavar");
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (secadoCompleto == 1) {
            System.out.println("Ya puede retirar la ropa!.");
        }else{
            System.out.println("No se a terminado de lavar");
        }
    }
}
