package polimorfismo;

public class ClaseHija_suma extends Operaciones_ClasePadre {

    //solo se puede sobre escribir utilizando las herencias
    @Override  //se utiliza para sobre escribir un metodo, en este caso se utiliza para que la misma funcion HAGA 2 COSAS COMPLETAMENTE DISTINTAS
    public void Operaciones() {  //y solo se pone el metodo que quieras sobre escribir
        resultado = valor1 + valor2;
    }
}
