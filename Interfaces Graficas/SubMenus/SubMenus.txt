import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SubMenus extends JFrame implements ActionListener
{
  private JMenuBar menubar; //es la barra inicial
  private JMenu menu, menuresolucion, menucolor; //es la que va a TENER los submenus y va a tener los 2 submenus declarados en el mismo JMenu
  private JMenuItem itemresolucion1,itemresolucion2,itemcolor1,itemcolor2;

  public SubMenus()
  {
   setLayout(null);
   menubar = new JMenuBar();
   setJMenuBar(menubar);

   menu = new JMenu("Opciones");
   menubar.add(menu);

   menuresolucion = new JMenu("Resolucion");
   menu.add(menuresolucion);

   menucolor = new JMenu("Color Del Fondo");
   menu.add(menucolor);

   itemresolucion1 = new JMenuItem("200 x 100");
   menuresolucion.add(itemresolucion1);
   itemresolucion1.addActionListener(this);

   itemresolucion2 = new JMenuItem("400 x 200");
   menuresolucion.add(itemresolucion2);
   itemresolucion2.addActionListener(this);

   itemcolor1 = new JMenuItem("Azul");
   menucolor.add(itemcolor1);
   itemcolor1.addActionListener(this);

   itemcolor2 = new JMenuItem("Rojo");
   menucolor.add(itemcolor2);
   itemcolor2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == itemresolucion1)
   {
    setSize(200,100);
   }

   if(e.getSource() == itemresolucion2)
   {
    setSize(400,200);
   }

   if(e.getSource() == itemcolor1)
   {
    getContentPane().setBackground(new Color(0,0,255));
   }

   if(e.getSource() == itemcolor2)
   {
    getContentPane().setBackground(new Color(255,0,0));
   }
  }

  public static void main(String args[])
  {
   SubMenus SubMenus1 = new SubMenus();
   SubMenus1.setBounds(0,0,200,100);
   SubMenus1.setVisible(true);
   SubMenus1.setResizable(false);
   SubMenus1.setLocationRelativeTo(null);
  }
}