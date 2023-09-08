import javax.swing.*;
import java.awt.event.*;

public class InsertarTeclado extends JFrame implements ActionListener
{
  private JTextField texto1;
  private JLabel label1;
  private JButton boton1, boton2;

  public InsertarTeclado()
  {
   setLayout(null);
   boton1 = new JButton("Aceptar");
   boton1.setBounds(10,100, 100, 50);
   add(boton1);
   boton1.addActionListener(this);
   
   boton2 = new JButton("Cerrar");
   boton2.setBounds(300, 100, 100, 50);
   add(boton2);
   boton2.addActionListener(this);
   
   label1 = new JLabel("Ingrese el Titulo");
   label1.setBounds(10, 10, 300,30);
   add(label1);
   
   texto1 = new JTextField();
   texto1.setBounds(120,17,150,20);
   add(texto1);
  }

  public void actionPerformed(ActionEvent eventos)
  {
   if(eventos.getSource() == boton1)
   {
    String texto= texto1.getText();   //la variable texto fue creada en esa misma lina de codigo
    setTitle(texto);
   }
   if(eventos.getSource() == boton2)
   {
    System.exit(0);
   }
  }
  public static void main(String args[])
  {
   InsertarTeclado InsertarTeclado1 = new InsertarTeclado();
   InsertarTeclado1.setBounds(0,0,430,225);
   InsertarTeclado1.setVisible(true);
   InsertarTeclado1.setResizable(false);
   InsertarTeclado1.setLocationRelativeTo(null);
  }
}