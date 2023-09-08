
import javax.swing.*;
import java.awt.event.*;

public class Logear extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, label4;
    private JTextField tf1, tf2;
    private JButton boton1, boton2;
    private String texto1, texto2;
    String Contraseña1, Usuario1;

    public Logear() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Registrarse Registrarse1 = new Registrarse();
        Contraseña1 = Registrarse1.Contraseña;
        Usuario1 = Registrarse1.Usuario;

        label1 = new JLabel("Inicia la sesión para comenzar a utilizar este programa");
        label1.setBounds(30, 10, 375, 15);
        add(label1);

        label2 = new JLabel("Usuario:");
        label2.setBounds(10, 40, 50, 10);
        add(label2);

        label3 = new JLabel("Contraseña:");
        label3.setBounds(10, 60, 80, 10);
        add(label3);

        label4 = new JLabel("¿No tienes cuenta todavía? ¡Intenta crearte una nueva!");
        label4.setBounds(30, 110, 410, 15);
        add(label4);

        tf1 = new JTextField("");
        tf1.setBounds(90, 35, 100, 20);
        add(tf1);

        tf2 = new JTextField("");
        tf2.setBounds(90, 55, 100, 20);
        add(tf2);

        boton1 = new JButton("Iniciar sesión");
        boton1.setBounds(90, 80, 120, 20);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("¡Crea una cuenta ahora!");
        boton2.setBounds(100, 140, 200, 20);
        add(boton2);
        boton2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            
            texto1 = tf1.getText();
            texto2 = tf2.getText();
            
            if (texto1.equals("") || texto2.equals("")) {
                
                JOptionPane.showMessageDialog(null, "¡Rellene los datos para continuar!");
                
            } else if (texto1.equals(Usuario1) && texto2.equals(Contraseña1)) {
                
                JOptionPane.showMessageDialog(null, "¡Logeo de sesión completado!");
                
            } else if (Usuario1.equals("") || Contraseña1.equals("")) {
            
                JOptionPane.showMessageDialog(null, "Tienes que crearte una cuenta para logear en esta aplicacion.");
            
            } else {
                
                JOptionPane.showMessageDialog(null, "Usuario/Contraseña Incorrecto/s");
                
            }
        }

        if (e.getSource() == boton2) {
            Registrarse Registrarse1 = new Registrarse();
            Registrarse1.setBounds(0, 0, 290, 180);
            Registrarse1.setVisible(true);
            Registrarse1.setResizable(false);
            Registrarse1.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Logear Logear1 = new Logear();
        Logear1.setBounds(0, 0, 380, 190);
        Logear1.setVisible(true);
        Logear1.setResizable(false);
        Logear1.setLocationRelativeTo(null);
    }

}
