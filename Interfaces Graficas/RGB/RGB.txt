import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGB extends JFrame implements ActionListener
{
  private JLabel label1,label2,label3;
  private JComboBox combo1,combo2,combo3;
  private JButton boton1, botonExit;

  public RGB()
  {
   setLayout(null);
   label1 = new JLabel("Rojo");
   label1.setBounds(10,13,60,10);   
   add(label1);

   combo1= new JComboBox();
   combo1.setBounds(40,10,50,20);
   for(int i=0; i<=255; i++)
   {
    combo1.addItem(String.valueOf(i));     //Es para transformar un numero a texto
   }
   add(combo1);

   label2 = new JLabel("Azul");
   label2.setBounds(10,40,100,10);
   add(label2);

   combo2= new JComboBox();
   combo2.setBounds(40,35,50,20);
   for(int i=0; i<=255; i++)
   {
    combo2.addItem(String.valueOf(i));     //Es para transformar un numero a texto
   }   
   add(combo2);

   label3 = new JLabel("Verde");
   label3.setBounds(5,65,100,10);
   add(label3);

   combo3= new JComboBox();
   combo3.setBounds(40,60,50,20);
   for(int i=0; i<=255; i++)
   {
    combo3.addItem(String.valueOf(i));     //Es para transformar un numero a texto
   }   
   add(combo3);

   boton1 = new JButton("Fijar Color");
   boton1.setBounds(10,90, 100, 30 );
   add(boton1);
   boton1.addActionListener(this);

   botonExit = new JButton("Exit");
   botonExit.setBounds(115,90, 100, 30 );
   add(botonExit);
   botonExit.addActionListener(this);
  }
  public void actionPerformed(ActionEvent Eventos)
  {
   if(Eventos.getSource() == boton1)
   {
    String cad1 = combo1.getSelectedItem().toString();
    String cad2 = combo2.getSelectedItem().toString();
    String cad3 = combo3.getSelectedItem().toString();

    int rojo = Integer.parseInt(cad1);
    int azul = Integer.parseInt(cad2);
    int verde = Integer.parseInt(cad3);

    Color color1 = new Color(rojo,verde,azul);

    boton1.setBackground(color1);
    botonExit.setBackground(color1);
   }
   if(Eventos.getSource() == botonExit)
   {
    System.exit(0);    
   }
  }

  public static void main (String args[])
  {
   RGB RGB1 = new RGB();
   RGB1.setBounds(0,0,225,150);
   RGB1.setVisible(true);
   RGB1.setResizable(false);
   RGB1.setLocationRelativeTo(null);
  }
} 