//En este programa se va a ver el funcionamiento del polimorfismo. ¿Que es?, es una operacion que se utiliza para 2 o mas operaciones totalmente distintas. 
//Esta misma solo se puede usar si se aplican las herencias
package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_ClasePadre { //se le ingresa la palabra "abstract" cuando quieras utilizar el polimorfismo

    protected int valor1, valor2, resultado;  //Cuando se utilizan las herencias es muy recomendable utilizar el protected
    Scanner teclado = new Scanner(System.in);

    public void Pedir_Datos() {
        System.out.print("Dame el primer valor: ");
        valor1 = teclado.nextInt();

        System.out.print("Dame el segundo valor: ");
        valor2 = teclado.nextInt();
    }

    public abstract void Operaciones();  //esta es la operacion del polimerfismo
    //esto basicamente te re kbe el chori y tenes que usar herencias para poder utilizarlo porque por alguna extraña razon mistica no se puede utilizar el "abstract" dentro de una clase que tenga la variable "abstract"

    public void Mostrarresultado() {
        System.out.println(resultado);
    }
}
