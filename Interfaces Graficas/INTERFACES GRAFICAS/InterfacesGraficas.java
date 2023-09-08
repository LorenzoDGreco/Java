import javax.swing.*;  //el asterisco es para importar toda la libreria, javax es por las interfaces graficas

public class InterfacesGraficas extends JFrame //agrega una "herencia" que está incluida en el JDK del java, son cosas pre diseñadas de otra gente
{
  private JLabel grafico1;  //es como una variable pero se utiliza para graficos

  public InterfacesGraficas() //es como una funcion aparte que la llamas cuando se te de la gana
  {
   setLayout(null);          //setea coordenadas para ponerlo en alguna parte del pograma, se usa null para evitar que se vaya a donde quiere
   grafico1 = new JLabel("Lo que sale en pantalla"); //es un objeto que por ahora parece al printf
   grafico1.setBounds(15,30,400,500); // ejes X,Y imagen ancho, altura
   add(grafico1);  //crea la etiqueta
  }
  public static void main(String args[])
  {
   InterfacesGraficas InterfacesGraficas1 = new InterfacesGraficas();
   InterfacesGraficas1.setBounds(0,0,400, 300);
   InterfacesGraficas1.setVisible(true);  //true= se ve false= no se ve
   InterfacesGraficas1.setLocationRelativeTo(null); //es para que se centre en el medio de la pantalla
  }
}