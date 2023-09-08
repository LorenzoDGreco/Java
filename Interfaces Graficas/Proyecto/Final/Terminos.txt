import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terminos extends JFrame implements ChangeListener, ActionListener
{
  private JButton boton1, boton2;
  private JTextArea area1;
  private JScrollPane scrollpane1;
  private JLabel label1,label2;
  private JCheckBox checkbox;
  String nombre= "";

  public Terminos()
  {
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource("Imagenes/icon.png")).getImage());

   Inicio Inicio1 = new Inicio();
   nombre = Inicio1.texto;

   label1= new JLabel("TÉRMINOS Y CONDICIONES");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono",1, 14));
   label1.setForeground(new Color(0,0,0));
   add(label1);

   ImageIcon imagen = new ImageIcon("Imagenes/coca-cola.png");
   label2= new JLabel(imagen);
   label2.setBounds(315,135,300,300);
   add(label2);

   area1 = new JTextArea();
   area1.setEditable(false);
   area1.setFont(new Font("Andale Mono",0,9));

   area1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                 "\n\n          1- PROHIBIDA SU VENTA O DISTRIBUCION DEL PROGRAMA SIN LA AUTORIZACION DEL DESARROLLADOR DEL PROGRAMA." +
                   "\n          2- PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DE LAS INTERFACES GRAFICAS."+
                   "\n          3- EL PROGRAMADOR NO SE HACE RESPONSABLE DEL MAL USO DE ESE SOFTWARE" +
                 "\n\n        LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"+
                   "\n        (EL PROGRAMADOR: LORENZO GRECO), NO SE HACE RESPONSABLE DEL USO QUE USTED HAGA CON ESTE SOFTWARE"+
                   "\n        Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (ACEPTO) SI USTED NO ACEPTA ESTOS TERMINOS," +
                   "\n        HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                 "\n\n        PARA MAYOR INFORMACION JODASE. NO TENGO NINGUN DATO EN LA WEB"
);


   scrollpane1 = new JScrollPane(area1);
   scrollpane1.setBounds(10,40,575,200);
   add(scrollpane1);

   checkbox= new JCheckBox("Yo " + nombre + " Acepto");
   checkbox.setBounds(10,250,300,30);
   checkbox.addChangeListener(this);
   add(checkbox);

   boton1 = new JButton("Continuar");
   boton1.setBounds(10,290,100,30);
   add(boton1);
   boton1.addActionListener(this);
   boton1.setEnabled(false);

   boton2 = new JButton("No Acepto");
   boton2.setBounds(120,290,100,30);
   add(boton2);
   boton2.addActionListener(this);
   boton2.setEnabled(true);
  }

  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == boton1)
   {
    Principal Principal1 = new Principal();
    Principal1.setBounds(0,0,640,535);
    Principal1.setVisible(true);
    Principal1.setLocationRelativeTo(null);
    Principal1.setResizable(false);
    this.setVisible(false);
   }
   if(e.getSource() == boton2)
   {
    JOptionPane.showMessageDialog(null, "Haz cancelado los términos y condiciones,"+ 
                                      "\npor ende no puedes utulizar este programa.");
    Inicio Inicio1 = new Inicio();
    Inicio1.setBounds(0,0,350,450);
    Inicio1.setVisible(true);
    Inicio1.setResizable(false);
    Inicio1.setLocationRelativeTo(null);
    this.setVisible(false);
   }
  }

  public void stateChanged(ChangeEvent e)
  {
   if(checkbox.isSelected() == true)
   {
    boton1.setEnabled(true);
    boton2.setEnabled(false);
   }
   if(checkbox.isSelected() == false)
   {
    boton1.setEnabled(false);
    boton2.setEnabled(true);
   }
  }


  public static void main(String args[])
  {
   Terminos Terminos1 = new Terminos();
   Terminos1.setBounds(0,0,600,360);
   Terminos1.setVisible(true);
   Terminos1.setResizable(false);
   Terminos1.setLocationRelativeTo(null);
  }
}