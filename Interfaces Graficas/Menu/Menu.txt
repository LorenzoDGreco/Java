import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener
{
  private JMenuBar menubar;
  private JMenu menu1, menu2;
  private JMenuItem menuitem1,menuitem2,menuitem3,menuitem4;

  public menu()
  {
   setLayout(null);
   menubar = new JMenuBar();
   setJMenuBar(menubar);  //no hace falta declarar una ubicacion ya que se auto ubica dependiendo la resolucion
   
   menu1 = new JMenu("Colres");
   menubar.add(menu1);
   menu2= new JMenu("Usuario");
   menubar.add(menu2);

   menuitem1 = new JMenuItem("Rojo");
   menuitem1.addActionListener(this);
   menu1.add(menuitem1);

   menuitem2= new JMenuItem("Verde");
   menuitem2.addActionListener(this);
   menu1.add(menuitem2);

   menuitem3= new JMenuItem("azul");
   menuitem3.addActionListener(this);
   menu1.add(menuitem3);

   menuitem4= new JMenuItem("Salir");
   menuitem4.addActionListener(this);
   menu2.add(menuitem4);
  }

  public void actionPerformed(ActionEvent Evento)
  {
   Container container1 = this.getContentPane(); //crea un cuadrado que ocupa toda la pantalla (con el ".getContentPane();" hace que se centre en TODA la interfaz grafica, sino solo ocupa lo que le decidas mas adelante) luego ese cuadrado es el que será pintado.

   if(Evento.getSource() == menuitem1)
   {
    container1.setBackground(new Color(255,0,0));//RGB Rojo Verde Azul sino Red Green Blue
   }

   if(Evento.getSource() == menuitem2)
   {
    container1.setBackground(new Color(0,255,0));//RGB Rojo Verde Azul sino Red Green Blue    
   }

   if(Evento.getSource() == menuitem3)
   {
    container1.setBackground(new Color(0,0,255));//RGB Rojo Verde Azul sino Red Green Blue    
   }

   if(Evento.getSource() == menuitem4)
   {
    System.exit(0);
   }
  }

  public static void main(String args[])
  {
   menu menu1 = new menu();
   menu1.setBounds(0,0,400,300);
   menu1.setVisible(true);
   menu1.setResizable(false);
   menu1.setLocationRelativeTo(null);
  }

















}