package ejemplos;


public class Converciones {
    public static void main(String[] args) {
        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);
        System.out.println("Deg a Rad " + anguloGrados + "° = " + anguloRadianes + " Rad" );
        
        
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Deg a Rad " + anguloRadianes + " Rad = " + anguloGrados + "°" );
    }
}
