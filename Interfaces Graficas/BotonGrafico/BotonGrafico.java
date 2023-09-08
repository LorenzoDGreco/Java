import javax.swing.*;
import java.awt.event.*;

public class BotonGrafico extends JFrame implements ActionListener   //agrega las interrupciones o eventos a la clase
{
  JButton boton1; //definis la variable boton
  
  public BotonGrafico()
  {
   setLayout(null);
   boton1 = new JButton("Cerrar");
   boton1.setBounds(300,250,100,50);
   add(boton1);
   boton1.addActionListener(this); //Espera a que cliken el boton
  }
  public void actionPerformed(ActionEvent evento)  //Primero se programa el "evento", osea. El boton. esto es para capturar el evento
  {
   if(evento.getSource() == boton1)
   {
    System.exit(0);
   }
  }

  public static void main(String args[])
  {
   BotonGrafico BotonGrafico1 = new BotonGrafico();
   BotonGrafico1.setBounds(0,0,450, 350);
   BotonGrafico1.setResizable(true);
   BotonGrafico1.setVisible(true);
   BotonGrafico1.setLocationRelativeTo(null);
   }
} 