package polimorfismo;

public class Main {

    public static void main(String[] args) {
        Operaciones_ClasePadre Suma = new ClaseHija_suma();   //para poder utilizar el polimorfismo tenes que aguarrar la accion padre que tiene, declaras variable y despues se declara con la que se quiere comunicar para que haga la funcion
        Operaciones_ClasePadre Resta = new ClaseHija_Resta();

        Suma.Pedir_Datos();
        Suma.Operaciones();
        System.out.print("El valor de su Suma es: ");
        Suma.Mostrarresultado();

        Resta.Pedir_Datos();
        Resta.Operaciones();
        System.out.print("El valor de su Resta es: ");
        Resta.Mostrarresultado();
    }
}
