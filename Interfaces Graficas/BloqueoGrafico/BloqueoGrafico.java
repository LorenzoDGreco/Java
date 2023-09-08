import javax.swing.*;

public class BloqueoGrafico extends JFrame
{
  public BloqueoGrafico() 
  {
   setLayout(null);
  }
  public static void main(String args[])
  {
   BloqueoGrafico BloqueoGrafico1 = new BloqueoGrafico();  //BloqueoGrafico1 es una variable
   BloqueoGrafico1.setBounds(500,300, 400, 100); //eje X,Y  Ancho,Altura
   BloqueoGrafico1.setVisible(true);
   BloqueoGrafico1.setLocationRelativeTo(null);
   BloqueoGrafico1.setResizable(false);
  }
}
