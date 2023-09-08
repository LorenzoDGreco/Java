import javax.swing.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ItemListener
{
  private JComboBox ComboBox;

  public ComboBox()
  {
   setLayout(null);
   ComboBox = new JComboBox();
   ComboBox.setBounds(10,10,100,30);
   add(ComboBox);
   //ahora a agregar un texto al cuadro
   ComboBox.addItem("Rojo");
   ComboBox.addItem("Azul");   
   ComboBox.addItem("Ultima :O");
   ComboBox.addItemListener(this);
  }
  public void itemStateChanged(ItemEvent Eventos)
  {
   if(Eventos.getSource() == ComboBox)
   {
    String Texto= "";
    Texto= ComboBox.getSelectedItem().toString();  //se pasara a texto lo que se lea en el listado/boton/cosito grafico
    setTitle(Texto);    
   } 
  }

  public static void main(String args[])
  {
   ComboBox ComboBox1 = new ComboBox();
   ComboBox1.setBounds(0,0,120,250);
   ComboBox1.setVisible(true);
   ComboBox1.setResizable(false);
   ComboBox1.setLocationRelativeTo(null);
  }
}