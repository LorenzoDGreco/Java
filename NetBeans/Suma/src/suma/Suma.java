package suma;

public class Suma {

    private int valor1, valor2, resultado;

    public Suma(int valorUno, int valorDos) {
        this.valor1 = valorUno;
        this.valor2 = valorDos;

    }

    public void Operacion() {
        resultado = valor1 + valor2;

    }

    public void Imprimir() {
       Operacion();
        System.out.println("El Resultado de la suma es: " + resultado);
       
    }
}
