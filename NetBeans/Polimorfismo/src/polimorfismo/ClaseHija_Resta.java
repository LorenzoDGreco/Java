package polimorfismo;

public class ClaseHija_Resta extends Operaciones_ClasePadre {

    @Override
    public void Operaciones() {
        resultado = valor1 - valor2;
    }
    //La info esta en la clase hija Suma
}
