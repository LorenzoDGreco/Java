import javax.swing.*;

public class AreaTexto extends JFrame
{
  private JTextArea textoarea;
  private JTextField texto;

  public AreaTexto()
  {
   setLayout(null);
   texto = new JTextField();
   texto.setBounds(0,0, 500,30);
   add(texto);

   textoarea = new JTextArea();
   textoarea.setBounds(0,50,500,500);
   add(textoarea);
  }
  public static void main(String args[])
  {
   AreaTexto AreaTexto1 = new AreaTexto();
   AreaTexto1.setBounds(0,0,500,600);
   AreaTexto1.setVisible(true);
   AreaTexto1.setResizable(false);
   AreaTexto1.setLocationRelativeTo(null);
  }
}