import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class TerminosYCondiciones extends JFrame implements ActionListener, ChangeListener
{
  JButton boton;
  JCheckBox check;
  JLabel label;  


  public TerminosYCondiciones()
  {
   setLayout(null);
   label = new JLabel("Aceptar terminos y condiciones");
   label.setBounds(10,10, 400,30);
   add(label);

   check = new JCheckBox("Acepto");    
   check.setBounds(10,40,200,30);
   check.addChangeListener(this);
   add(check);

   boton = new JButton("Continuar");
   boton.setBounds(10,80, 100,30);
   add(boton);
   boton.addActionListener(this);
   boton.setEnabled(false);
  }

  public void stateChanged(ChangeEvent e)
  {
   if(check.isSelected() == true)
   {
    boton.setEnabled(true);
   }
   else
   {
    boton.setEnabled(false);
   }
  }

  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == boton)
   {
    System.exit(0);
   }
  }



  public static void main(String args[])
  {
   TerminosYCondiciones TerminosYCondiciones1 = new TerminosYCondiciones();
   TerminosYCondiciones1.setBounds(0,0, 350,300);
   TerminosYCondiciones1.setVisible(true);
   TerminosYCondiciones1.setResizable(false);
   TerminosYCondiciones1.setLocationRelativeTo(null);
  }
}