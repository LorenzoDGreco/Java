import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Inicio extends JFrame implements ActionListener
{
  private JLabel label1, label2, label3, label4;
  private JButton boton;
  private JTextField textfield;
  public static String texto = "";

  public Inicio()
  {
   setLayout(null);
   setTitle("Bienvenido");
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("Imagenes/icon.png")).getImage());
   ImageIcon imagen = new ImageIcon("Imagenes/logo-coca.png");

   boton = new JButton("Ingresar");
   boton.setBounds(125,280,100,30);
   boton.setBackground(new Color(255,255,255));
   boton.setFont(new Font("Andale Mono",1,12));  //es la tipografia
   boton.setForeground(new Color(255,0,0));       //es el color de la letra
   add(boton);
   boton.addActionListener(this);

   label1 = new JLabel(imagen);
   label1.setBounds(25,15,300,150);
   add(label1);

   label2 = new JLabel("Sistema de Control Vacacional");
   label2.setBounds(45,135,300,30);
   label2.setFont(new Font("Andale Mono", 3, 18));  // 0 normal , 1 negrita , 2 cursiva, 3= 1+2. El 18 es el tamaño
   label2.setForeground(new Color(255,255,255));
   add(label2);

   label3 = new JLabel("Ingrese su nombre:");
   label3.setBounds(45,212,200,30);
   label3.setFont(new Font("Andale Mono", 1, 12));  // 0 normal , 1 negrita , 2 cursiva, 3= 1+2. El 18 es el tamaño
   label3.setForeground(new Color(255,255,255));
   add(label3);

   label4 = new JLabel("©2018 The Coca-Cola Company");
   label4.setBounds(85,375,300,30);
   label4.setFont(new Font("Andale Mono", 1, 12));  // 0 normal , 1 negrita , 2 cursiva, 3= 1+2. El 18 es el tamaño
   label4.setForeground(new Color(255,255,255));
   add(label4);

   textfield = new JTextField();
   textfield.setBounds(45,240,255,25);
   textfield.setBackground(new Color(224,224,224));
   textfield.setFont(new Font("Andale Mono",3,12));  //es la tipografia
   textfield.setForeground(new Color(255,0,0));       //es el color de la letra
   add(textfield);
  }

  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == boton)
   {
    texto = textfield.getText().trim();
    if(texto.equals(""))
    {
     JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
    }else
     {
      Terminos Terminos1 = new Terminos();
      Terminos1.setBounds(0,0,600,360);
      Terminos1.setVisible(true);
      Terminos1.setResizable(false);
      Terminos1.setLocationRelativeTo(null);
      this.setVisible(false);                    //puede ser Inicio o como puede ser this, cuando manejas muchas interfaces que ya no sabes que es que es mejor usar this
     }
   }
  }

  public static void main(String args[])
  {
   Inicio Inicio1 = new Inicio();
   Inicio1.setBounds(0,0,350,450);
   Inicio1.setVisible(true);
   Inicio1.setResizable(false);
   Inicio1.setLocationRelativeTo(null);
  }
}