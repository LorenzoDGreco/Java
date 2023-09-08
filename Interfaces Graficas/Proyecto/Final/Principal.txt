import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener
{
  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElCreador,miSalir,miNuevo;
  private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelPaterno,labelMaterno,
                 labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
  private JTextField txtNombreTrabajador,txtPaternoTrabajador,txtMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombreAdmin = "";

  public Principal()
  {
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Pantalla Principal");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("Imagenes/icon.png")).getImage());

   Inicio Inicio1 = new Inicio();
   nombreAdmin = Inicio1.texto;

   mb = new JMenuBar();
   mb.setBackground(new Color(255,0,0));
   setJMenuBar(mb);

   menuOpciones = new JMenu("Opciones");
   menuOpciones.setBackground(new Color(255,0,0));
   menuOpciones.setFont(new Font("Andale Mono",1,14));
   menuOpciones.setForeground(new Color(255,255,255));
   mb.add(menuOpciones);

   menuCalcular = new JMenu("Calcular");
   menuCalcular.setBackground(new Color(255,0,0));
   menuCalcular.setFont(new Font("Andale Mono",1,14));
   menuCalcular.setForeground(new Color(255,255,255));
   mb.add(menuCalcular);   

   menuAcercaDe = new JMenu("Acerca de");
   menuAcercaDe.setBackground(new Color(255,0,0));
   menuAcercaDe.setFont(new Font("Andale Mono",1,14));
   menuAcercaDe.setForeground(new Color(255,255,255));
   mb.add(menuAcercaDe);

   menuColorFondo = new JMenu("Color de Fondo");
   menuColorFondo.setBackground(new Color(255,0,0));
   menuColorFondo.setForeground(new Color(255,0,0));
   menuColorFondo.setFont(new Font("Andale Mono",1,14));
   menuOpciones.add(menuColorFondo);
   menuColorFondo.addActionListener(this);

   miCalculo = new JMenuItem("Vacaciones");
   miCalculo.setFont(new Font("Andale Mono",1,14));
   miCalculo.setForeground(new Color(255,0,0));
   menuCalcular.add(miCalculo);
   miCalculo.addActionListener(this);

   miRojo = new JMenuItem("Rojo");
   miRojo.setFont(new Font("Andale Mono",1,14));
   miRojo.setForeground(new Color(255,0,0));
   menuColorFondo.add(miRojo);
   miRojo.addActionListener(this);

   miNegro = new JMenuItem("Negro");
   miNegro.setFont(new Font("Andale Mono",1,14));
   miNegro.setForeground(new Color(255,0,0));
   menuColorFondo.add(miNegro);
   miNegro.addActionListener(this);

   miMorado = new JMenuItem("Morado");
   miMorado.setFont(new Font("Andale Mono",1,14));
   miMorado.setForeground(new Color(255,0,0));
   menuColorFondo.add(miMorado);
   miMorado.addActionListener(this);

   miNuevo = new JMenuItem("Nuevo");
   miNuevo.setFont(new Font("Andale Mono",1,14));
   miNuevo.setForeground(new Color(255,0,0));
   menuOpciones.add(miNuevo);
   miNuevo.addActionListener(this);

   miElCreador = new JMenuItem("El Creador");
   miElCreador.setFont(new Font("Andale Mono",1,14));
   miElCreador.setForeground(new Color(255,0,0));
   menuAcercaDe.add(miElCreador);
   miElCreador.addActionListener(this);

   miSalir = new JMenuItem("Salir");
   miSalir.setFont(new Font("Andale Mono",1,14));
   miSalir.setForeground(new Color(255,0,0));
   menuOpciones.add(miSalir);
   miSalir.addActionListener(this);

   ImageIcon imagen= new ImageIcon("Imagenes/logo-coca.png");
   labelLogo = new JLabel(imagen);
   labelLogo.setBounds(5,5,250,100);
   add(labelLogo);

   labelBienvenido = new JLabel("Bienvenido " + nombreAdmin);
   labelBienvenido.setBounds(280,30,300,50);
   labelBienvenido.setFont(new Font("Andale Mono",1,32));
   labelBienvenido.setForeground(new Color(255,255,255));
   add(labelBienvenido);

   labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
   labelTitle.setBounds(45,140,900,25);
   labelTitle.setFont(new Font("Andale Mono",1,24));
   labelTitle.setForeground(new Color(255,255,255));
   add(labelTitle);

   labelNombre = new JLabel("Nombre Completo");
   labelNombre.setBounds(25,188,180,25);
   labelNombre.setFont(new Font("Andale Mono",1,12));
   labelNombre.setForeground(new Color(255,255,255));
   add(labelNombre);

   txtNombreTrabajador = new JTextField("");
   txtNombreTrabajador.setBounds(25,213,150,25);
   txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
   txtNombreTrabajador.setFont(new Font("Andale Mono",1,14));
   txtNombreTrabajador.setForeground(new Color(255,0,0));
   add(txtNombreTrabajador);

   labelPaterno = new JLabel("Apellido Paterno:");
   labelPaterno.setBounds(25,248,180,25);
   labelPaterno.setFont(new Font("Andale Mono",1,12));
   labelPaterno.setForeground(new Color(255,255,255));
   add(labelPaterno);

   txtPaternoTrabajador = new JTextField();
   txtPaternoTrabajador.setBounds(25,273,150,25);
   txtPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
   txtPaternoTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
   txtPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
   add(txtPaternoTrabajador);

   labelMaterno = new JLabel("Apellido Materno:");
   labelMaterno.setBounds(25,308,180,25);
   labelMaterno.setFont(new Font("Andale Mono",1,12));
   labelMaterno.setForeground(new Color(255,255,255));
   add(labelMaterno);

   txtMaternoTrabajador = new JTextField();
   txtMaternoTrabajador.setBounds(25,334,150,25);
   txtMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
   txtMaternoTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
   txtMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
   add(txtMaternoTrabajador);

   labelDepartamento = new JLabel("Departamento:");
   labelDepartamento.setBounds(220,188,180,25);
   labelDepartamento.setFont(new Font("Andale Mono",1,12));
   labelDepartamento.setForeground(new Color(255,255,255));
   add(labelDepartamento);

   comboDepartamento = new JComboBox();
   comboDepartamento.setBounds(220,213,220,25);
   comboDepartamento.setBackground(new java.awt.Color(224,224,224));
   comboDepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
   comboDepartamento.setForeground(new java.awt.Color(255,0,0));
   add(comboDepartamento);
   comboDepartamento.addItem("");
   comboDepartamento.addItem("Atención al Cliente");
   comboDepartamento.addItem("Departamento de Logística");
   comboDepartamento.addItem("Departamento de Gerencia");

   labelAntiguedad = new JLabel("Selecciona la antigüedad");
   labelAntiguedad.setBounds(220,248,180,25);
   labelAntiguedad.setFont(new Font("Andale Mono",1,12));
   labelAntiguedad.setForeground(new Color(255,255,255));
   add(labelAntiguedad);

   comboAntiguedad = new JComboBox();
   comboAntiguedad.setBounds(220,273,220,25);
   comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
   comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
   comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
   add(comboAntiguedad);
   comboAntiguedad.addItem("");
   comboAntiguedad.addItem("1 año de servicio");
   comboAntiguedad.addItem("2 a 6 años de servicio");
   comboAntiguedad.addItem("7 años o más de servicio");

   labelResultado = new JLabel("Resultado del Cálculo");
   labelResultado.setBounds(220,307,180,25);
   labelResultado.setFont(new Font("Andale Mono",1,12));
   labelResultado.setForeground(new Color(255,255,255));
   add(labelResultado);

   textarea1 = new JTextArea();
   textarea1.setEditable(false);
   textarea1.setFont(new Font("Andale Mono",1,11));
   textarea1.setForeground(new Color(255,0,0));
   textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
   scrollpane1= new JScrollPane(textarea1);
   scrollpane1.setBounds(220,333,385,90);
   add(scrollpane1);

   labelfooter= new JLabel("©2018 The Coca-Cola | Todos los derechos reservados.");
   labelfooter.setBounds(135,445,500,30);
   labelfooter.setFont(new Font("Andale Mono",1,12));
   labelfooter.setForeground(new Color(255,255,255));
   add(labelfooter);
  }

  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == miCalculo)
   {
    String nombreTrabajador = txtNombreTrabajador.getText();
    String P = txtPaternoTrabajador.getText();
    String M = txtMaternoTrabajador.getText();
    String Departamento = comboDepartamento.getSelectedItem().toString();
    String Antiguedad = comboAntiguedad.getSelectedItem().toString();

    if(nombreTrabajador.equals("") || P.equals("") || M.equals("") || Departamento.equals("") || Antiguedad.equals(""))
    {
     JOptionPane.showMessageDialog(null, "Tienes que llenar todos los campos para continuar.");
    } 
    else
    {
////////////////////////////////////////////////////////////////////////////////////////////////////
     if(Departamento.equals("Atención al Cliente"))
     {
      if(Antiguedad.equals("1 año de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+
                         "\n   Quien labora en " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 6 días de vacaciones.");
      }
      
      if(Antiguedad.equals("2 a 6 años de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+
                         "\n   Quien labora en " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 14 días de vacaciones.");
      }
      
      if(Antiguedad.equals("7 años o más de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+
                         "\n   Quien labora en " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 20 días de vacaciones.");
      }
     }
////////////////////////////////////////////////////////////////////////////////////////////////////
     if(Departamento.equals("Departamento de Logística"))
     {
      if(Antiguedad.equals("1 año de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+
                         "\n   Quien labora en el " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 7 días de vacaciones.");
      }
      
      if(Antiguedad.equals("2 a 6 años de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+
                         "\n   Quien labora en el " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 15 días de vacaciones.");
      }
       
      if(Antiguedad.equals("7 años o más de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+ 
                         "\n   Quien labora en el " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 22 días de vacaciones.");
      }
     }
////////////////////////////////////////////////////////////////////////////////////////////////////
     if(Departamento.equals("Departamento de Gerencia"))
     {
      if(Antiguedad.equals("1 año de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+
                         "\n   Quien labora en el " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 10 días de vacaciones.");
      }
      
      if(Antiguedad.equals("2 a 6 años de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+
                         "\n   Quien labora en el " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 20 días de vacaciones.");
      }
      
      if(Antiguedad.equals("7 años o más de servicio"))
      {
       textarea1.setText("\n   El Trabajador " + nombreTrabajador + " "+ P +" "+ M +"."+
                         "\n   Quien labora en el " + Departamento +" con " + Antiguedad + "." +
                         "\n   Recibe 30 días de vacaciones.");
      }
     }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
   }
   if(e.getSource() == miRojo)
   {
    getContentPane().setBackground(new Color (255,0,0));
   }
   if(e.getSource() == miNegro)
   {
    getContentPane().setBackground(new Color (0,0,0));
   }
   if(e.getSource() == miMorado)
   {
    getContentPane().setBackground(new Color (51,0,51));
   }
   if(e.getSource() == miNuevo)
   {
    textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
    txtNombreTrabajador.setText("");
    txtPaternoTrabajador.setText("");
    txtMaternoTrabajador.setText("");
    comboDepartamento.setSelectedIndex(0);
    comboAntiguedad.setSelectedIndex(0);
   }
   if(e.getSource() == miSalir)
   {
    Inicio Inicio1 = new Inicio();
    Inicio1.setBounds(0,0,350,450);
    Inicio1.setVisible(true);
    Inicio1.setResizable(false);
    Inicio1.setLocationRelativeTo(null);
    this.setVisible(false);
   }
   if(e.getSource() == miElCreador)
   {
    JOptionPane.showMessageDialog(null, "Esta Aplicacion fue programada por: Lorenzo Greco."+
                                       "\n        Fue diseñada desde 0 con java.");
   }
  }

  public static void main(String args[])
  {
   Principal Principal1 = new Principal();
   Principal1.setBounds(0,0,640,535);
   Principal1.setVisible(true);
   Principal1.setLocationRelativeTo(null);
   Principal1.setResizable(false);
  }
}