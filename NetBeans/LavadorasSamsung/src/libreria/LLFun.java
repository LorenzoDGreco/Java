/*
 * Clase para las funciones logiucas de una lavadora de Samsung
 */
package libreria;

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
        if (getKilos() <= 12) {     //en el caso que el lavaropa solo soporte una maxima de 12 kilos
            setLlenadoCompleto(1);
            System.out.println("Llenando...");
            System.out.println("LLenado Completo");
        } else {
            System.out.println("Error, no se pudo iniciar porque superaste el peso limite, por favor reduce la cantidad y intentalo de nuevo");
            setLlenadoCompleto(0);
        }
    }

    private void Lavado() {
        Llenado();
        if (getLlenadoCompleto() == 1) {
            if (TipoRopa == 1) {
                System.out.println("Se ingreso ropa blanca/ Lavado Suave");
                System.out.println("Lavando...");
                setLavadoCompleto(1);
            }
            else if (TipoRopa == 2) {
                System.out.println("Ropa de Color / Lavado Intenso");
                System.out.println("Lavando...");
                setLavadoCompleto(1);
            } 
            else {
                System.out.println("El tipo de ropa no está disponible / Elija 1 para blanco, elija 2 para color");
                System.out.println("Será tomado como ropa de Color / Lavado Intenso");
                System.out.println("Lavando...");
                setLavadoCompleto(1);
            }
        } 
    }

    private void Secado() {
        Lavado();
        if (getLavadoCompleto() == 1) {
            System.out.println("Secando...");
            System.out.println("Secado Terminado!");
            setSecadoCompleto(1);
        } 
    }

    public void CicloFinalizado() {
        Secado();
        if (getSecadoCompleto() == 1) {
            System.out.println("Ya puede retirar la ropa!.");
        }
    }
    // Setter y Getter
    public int getTipoRopa(){
        return TipoRopa;
    }
    public void setTipoRopa(int TipoRopa){
        this.TipoRopa = TipoRopa;
        
    }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    /**
     * @return the llenadoCompleto
     */
    public int getLlenadoCompleto() {
        return llenadoCompleto;
    }

    /**
     * @param llenadoCompleto the llenadoCompleto to set
     */
    public void setLlenadoCompleto(int llenadoCompleto) {
        this.llenadoCompleto = llenadoCompleto;
    }

    /**
     * @return the lavadoCompleto
     */
    public int getLavadoCompleto() {
        return lavadoCompleto;
    }

    /**
     * @param lavadoCompleto the lavadoCompleto to set
     */
    public void setLavadoCompleto(int lavadoCompleto) {
        this.lavadoCompleto = lavadoCompleto;
    }

    /**
     * @return the secadoCompleto
     */
    public int getSecadoCompleto() {
        return secadoCompleto;
    }

    /**
     * @param secadoCompleto the secadoCompleto to set
     */
    public void setSecadoCompleto(int secadoCompleto) {
        this.secadoCompleto = secadoCompleto;
    }
    
}
