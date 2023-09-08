package ejemplos;

public class FuncionesTrigonometricas {

    public static void main(String[] args) {
        double resultado = 0;
        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);

        //seno
        resultado = Math.sin(anguloRadianes);
        System.out.println("Seno de " + anguloGrados + "° = " + resultado);

        //coseno
        resultado = Math.cos(anguloRadianes);
        System.out.println("Coseno de " + anguloGrados + "° = " + resultado);

        //Tangente
        resultado = Math.tan(anguloRadianes);
        System.out.println("Tangente de " + anguloGrados + "° = " + resultado);

        double valorIngresado = 0.707;
        //Arco Coseno
        anguloRadianes = Math.acos(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco Coseno de " + valorIngresado + " = " + anguloGrados + "°");

        //Arco Coseno
        anguloRadianes = Math.asin(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco Seno de " + valorIngresado + " = " + anguloGrados + "°");

        //Arco Coseno
        anguloRadianes = Math.atan(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco Tangente de " + valorIngresado + " = " + anguloGrados + "°");

    }
}
