import javax.swing.*;
import javax.swing.event.*;

public class Check extends JFrame implements ChangeListener
{
  private JCheckBox check1, check2, check3; 

  public Check()
  {
   setLayout(null);
   check1 = new JCheckBox("Inglés");
   check1.setBounds(10,10,150,30);
   add(check1);
   check1.addChangeListener(this);

   check2 = new JCheckBox("Argentina");
   check2.setBounds(10,50,150,30);
   add(check2);
   check2.addChangeListener(this);

   check3 = new JCheckBox("Brazucas");
   check3.setBounds(10,90,150,30);
   add(check3);
   check3.addChangeListener(this);   
  }

  public void stateChanged(ChangeEvent e)
  {
   String texto = "";


   if(check1.isSelected() == true)
   {
    texto = texto + "Inglés ";
   }
   if(check2.isSelected() == true)
   {
    texto = texto + "Argentina ";
   }
   if(check3.isSelected() == true)
   {
    texto = texto + "Brazucas ";
   }
   setTitle(texto);
  }

  public static void main(String args[])
  {
   Check Check1 = new Check();
   Check1.setBounds(0,0,300,200);
   Check1.setVisible(true);
   Check1.setResizable(false);
   Check1.setLocationRelativeTo(null);




  }
}