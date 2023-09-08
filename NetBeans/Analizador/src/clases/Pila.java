package clases;

public class Pila {

    private Nodo UltimoValorIngresado;

    public Pila() {
        UltimoValorIngresado = null;
    }

    public void insertar(char valor) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.info = valor;

        if (UltimoValorIngresado == null) {

            nuevo_nodo.siguiente = null;
            UltimoValorIngresado = nuevo_nodo;

        } else {
            nuevo_nodo.siguiente = UltimoValorIngresado;
            UltimoValorIngresado = nuevo_nodo;
        }
    }

    public char extraer() {
        if (UltimoValorIngresado != null) {
            char informacion = UltimoValorIngresado.info;
            UltimoValorIngresado = UltimoValorIngresado.siguiente;
            return informacion;
        } else {
            return Character.MAX_VALUE;
        }
    }
    
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
}
