import javax.swing.*;

public class UbicacionTexto extends JFrame 
{
  private JLabel label1;           //es una variable cualquiera
  private JLabel label2;

  public UbicacionTexto()  //Siempre se tiene que llamar igual que la clase ya que esto se guarda en la clase
  {
   setLayout(null);   //es para que no haga nada sin nuestro permiso
   label1 = new JLabel("Mira mama hice una interfaz grafica :D");
   label1.setBounds(10,20,300,30);
   add(label1); //para que aparezca en la pantalla
   label2 = new JLabel("Segunda palabra de la interfaz :,D");
   label2.setBounds(10, 40, 1000, 300);
   add(label2);  
  }
  public static void main (String args[])
  {
   UbicacionTexto UbicacionTexto1 = new UbicacionTexto();
   UbicacionTexto1.setBounds(0,0,500, 500);
   UbicacionTexto1.setResizable(false);                    // es para que no permita cambiar el tamaño de la interfaz
   UbicacionTexto1.setVisible(true);   
   UbicacionTexto1.setLocationRelativeTo(null);
   











  }
}