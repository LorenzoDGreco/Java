import javax.swing.*;
import java.awt.event.*;

public class Conversiones extends JFrame implements ActionListener
{
  private JTextField TextField1;
  private JScrollPane ScrollPane1;
  private JTextArea TextArea1;
  private JButton Boton, BotonExit;

  String Texto = "";

  public Conversiones()
  {
   setLayout(null);
   TextField1 = new JTextField();
   TextField1.setBounds(10,10, 200, 30);
   add(TextField1);

   Boton = new JButton("Ingresar");
   Boton.setBounds(220, 10, 100, 30);
   add(Boton);
   Boton.addActionListener(this);

   BotonExit = new JButton("Salir");
   BotonExit.setBounds(330,10,100,30);
   add(BotonExit);
   BotonExit.addActionListener(this);  
   
   TextArea1 = new JTextArea();
   ScrollPane1 = new JScrollPane(TextArea1);
   ScrollPane1.setBounds(10,50,300,400);
   add(ScrollPane1);
  }

  public void actionPerformed(ActionEvent Evento)
  {
   if(Evento.getSource() == Boton)
   {    //lo de abajo, almacena lo escrito en el Field para luego pegarlo en el Area
    Texto += TextField1.getText() + "\n";   //el += es lo que crea el acumulador y el \n sirve para saltar a la otra linea (Se.. Es lo mismo que en el C normalito)
    TextArea1.setText(Texto);               //agrega el texto ingresado al TextArea
    TextField1.setText("");                 //Lo que hace es inseta espacios en blancos.. en otras palabras borra lo ingresado
   }
   if(Evento.getSource() == BotonExit)
   { 
    System.exit(0);
   }
  }

  public static void main(String args[])
  {
   Conversiones Conversiones1 = new Conversiones();
   Conversiones1.setBounds(0,0,500,460);
   Conversiones1.setVisible(true);
   Conversiones1.setResizable(false);
   Conversiones1.setLocationRelativeTo(null);
  }



















}