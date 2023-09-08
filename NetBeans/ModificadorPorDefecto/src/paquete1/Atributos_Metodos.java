package paquete1;

/**
 *
 * @author loren
 */
public class Atributos_Metodos {
    public int valorUno;  //gracias a que está en public puede ser distribuido a TOOOODOOS los archivos dentro o fuera del paquete
    int valorDos;         //está en defecto y eso significa que puede ser pasadado solo de .java a otro
    private int valorTres;// significa te jodiste wey. solo se puede usar para este mismo .java Y NADA MAS solo este al menos de que se utilice la opcion Getter y Setter (se puede hacer de forma automatica: "click derecho/refactor/encapsulate fields/elegis lo que queres y le das a refactor")
    
    public void Metodos(){
        
    }

    /**
     * @return the valorTres
     */
    public int getValorTres() {
        return valorTres;
    }

    /**
     * @param valorTres the valorTres to set
     */
    public void setValorTres(int valorTres) {
        this.valorTres = valorTres;
    }
    
    
}
