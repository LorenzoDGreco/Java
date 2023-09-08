import javax.swing.*;
import java.awt.event.*;

public class MultiplesBotones extends JFrame implements ActionListener
{
  private JLabel label1;
  private JButton boton1, boton2, boton3, boton4;
  
  public MultiplesBotones()
  {
   setLayout(null);
   boton1 = new JButton("Boton 1");
   boton1.setBounds(10,100, 100, 50);
   add(boton1);
   boton1.addActionListener(this);
   
   boton2 = new JButton("Boton 2");
   boton2.setBounds(120,100, 100, 50);
   add(boton2);
   boton2.addActionListener(this);
   
   boton3 = new JButton("Boton 3");
   boton3.setBounds(230, 100, 100, 50);
   add(boton3);
   boton3.addActionListener(this);

   boton4 = new JButton("Cerrar");
   boton4.setBounds(340, 200, 100, 50);
   add(boton4);
   boton4.addActionListener(this);

   label1 = new JLabel("En Espera...");
   label1.setBounds(120, 50, 310,30);
   add(label1);
  }

  public void actionPerformed(ActionEvent eventos)
  {
   if(eventos.getSource() == boton1)
   {
    label1.setText("Has presionado el Botón 1");
   }
   if(eventos.getSource() == boton2)
   {
    label1.setText("Has presionado el Botón 2");
   }
   if(eventos.getSource() == boton3)
   {
    label1.setText("Has presionado el Botón 3");
   }
   if(eventos.getSource() == boton4)
   {
    System.exit(0);
   }
  }
  public static void main(String args[])
  {
   MultiplesBotones MultiplesBotones1 = new MultiplesBotones();
   MultiplesBotones1.setBounds(0,0, 450, 300);
   MultiplesBotones1.setVisible(true);
   MultiplesBotones1.setLocationRelativeTo(null);
   MultiplesBotones1.setResizable(false);
  }
}