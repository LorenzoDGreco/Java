
import javax.swing.*;
import java.awt.event.*;

public class Registrarse extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, label4;
    private JTextField tf1, tf2;
    private JButton boton1;
    public String Texto1 = "", Texto2 = "";
    public static String Contraseña = "", Usuario = "";

    public Registrarse() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label1 = new JLabel("¡Bienvenido a la creacion de usuario!");
        label1.setBounds(20, 10, 220, 15);
        add(label1);

        label2 = new JLabel("Llena todas las casillas para crear tu cuenta");
        label2.setBounds(10, 30, 260, 15);
        add(label2);

        label3 = new JLabel("Usuario:");
        label3.setBounds(30, 60, 50, 10);
        add(label3);

        label4 = new JLabel("Contraseña:");
        label4.setBounds(10, 90, 80, 10);
        add(label4);

        tf1 = new JTextField();
        tf1.setBounds(80, 55, 160, 20);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(80, 85, 160, 20);
        add(tf2);

        boton1 = new JButton("¡Crea la cuenta!");
        boton1.setBounds(120, 120, 140, 25);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Texto1 = tf1.getText();
            Texto2 = tf2.getText();
            if (Texto1.equals("") || Texto2.equals("")) {
                JOptionPane.showMessageDialog(null, "¡Rellena todos los campos para continuar!");
            } else {
                Usuario = tf1.getText();
                Contraseña = tf2.getText();
                JOptionPane.showMessageDialog(null, "¡Cuenta creada correctamente!");
                Logear Logear1 = new Logear();
                Logear1.setBounds(0, 0, 380, 190);
                Logear1.setVisible(true);
                Logear1.setResizable(false);
                Logear1.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        Registrarse Registrarse1 = new Registrarse();
        Registrarse1.setBounds(0, 0, 280, 180);
        Registrarse1.setVisible(true);
        Registrarse1.setResizable(false);
        Registrarse1.setLocationRelativeTo(null);
    }

}
