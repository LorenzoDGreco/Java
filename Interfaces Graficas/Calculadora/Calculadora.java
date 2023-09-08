import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener
{
  private JTextField TextField1,TextField2;
  private JButton BotonSuma, BotonResta, BotonMultiplicacion, BotonDivision, BotonExit;
  private JLabel label1, label2, label3;

  public Calculadora()
  {
   setLayout(null);
   label1 = new JLabel("Valor 1:");
   label1.setBounds(10,10,100,30);
   add(label1);

   label2 = new JLabel("Valor 2:");
   label2.setBounds(10,45,100,30);
   add(label2);

   label3 = new JLabel("Resultado");
   label3.setBounds(10,80,100,30);
   add(label3);

   TextField1 = new JTextField();
   TextField1.setBounds(110,10,150,30);
   add(TextField1);

   TextField2 = new JTextField();
   TextField2.setBounds(110,45, 150,30);
   add(TextField2);

   BotonExit = new JButton("Salida");
   BotonExit.setBounds(470, 120, 100,30);
   add(BotonExit);
   BotonExit.addActionListener(this);

   BotonSuma = new JButton("Suma");
   BotonSuma.setBounds(270,10, 150,30);
   add(BotonSuma);
   BotonSuma.addActionListener(this);

   BotonResta = new JButton("Resta");
   BotonResta.setBounds(420,10,150,30);
   add(BotonResta);
   BotonResta.addActionListener(this);

   BotonMultiplicacion = new JButton("Multiplicacion");
   BotonMultiplicacion.setBounds(270,45, 150,30);
   add(BotonMultiplicacion);
   BotonMultiplicacion.addActionListener(this);

   BotonDivision = new JButton("Division");
   BotonDivision.setBounds(420,45,150,30);
   add(BotonDivision);
   BotonDivision.addActionListener(this);
  }

  public void actionPerformed(ActionEvent Evento)
  {
   if(Evento.getSource() == BotonExit)
   {
    System.exit(0);
   }
   if(Evento.getSource() == BotonSuma)
   {
    int Val1=0 , Val2= 0, Resultado=0;
    Val1 = Integer.parseInt(TextField1.getText());
    Val2 = Integer.parseInt(TextField2.getText());
    Resultado= Val1 + Val2;
    label3.setText("Resultado: " + Resultado);
   }
   if(Evento.getSource() == BotonResta)
   {
    int Val1=0 , Val2= 0, Resultado=0;
    Val1 = Integer.parseInt(TextField1.getText());
    Val2 = Integer.parseInt(TextField2.getText());
    Resultado= Val1 - Val2;
    label3.setText("Resultado: " + Resultado);
   }
   if(Evento.getSource() == BotonMultiplicacion)
   {
    int Val1=0 , Val2= 0, Resultado=0;
    Val1 = Integer.parseInt(TextField1.getText());
    Val2 = Integer.parseInt(TextField2.getText());
    Resultado= Val1 * Val2;
    label3.setText("Resultado: " + Resultado);
   }
   if(Evento.getSource() == BotonDivision)
   {
    int Val1=0 , Val2= 0, Resultado=0;
    Val1 = Integer.parseInt(TextField1.getText());
    Val2 = Integer.parseInt(TextField2.getText());
    Resultado= Val1 / Val2;
    label3.setText("Resultado: " + Resultado);
   }
  }
  public static void main(String args[])
  {
    Calculadora Calculadora1 = new Calculadora();
    Calculadora1.setBounds(0,0, 600, 200);
    Calculadora1.setVisible(true);
    Calculadora1.setResizable(false);
    Calculadora1.setLocationRelativeTo(null);
  }
}