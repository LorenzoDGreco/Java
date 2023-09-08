
package ambitos;

public class Ambitos {

    public static int variable_estatica = 30;
    int variable_global=40;
    
    void miMetodo(int parametreo){
        int variableLocal = 10;
        System.out.println("El valor de variableLocal es: " + variableLocal);
        System.out.println("El valor Global es: " + variable_global);
    }
    
    void algo (){
        System.out.println("El valor de la variableLocal es: " + variableLocal);
        System.out.println("El valor Global es: " + variable_global);
    }
}
