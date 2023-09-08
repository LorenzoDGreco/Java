import javax.swing.*;

public class Scroll extends JFrame
{
  private JTextField textfield;
  private JScrollPane scrollpane;
  private JTextArea textarea;

  public Scroll()
  {
   setLayout(null);
   textfield = new JTextField();
   textfield.setBounds(0,0,300,30);
   add(textfield);

   textarea = new JTextArea();
   scrollpane = new JScrollPane(textarea); //es que va a ir dentro del scroll pane
   scrollpane.setBounds(0,50,300,300);
   add(scrollpane);
  }

  public static void main(String args[])
  {
   Scroll Scroll1 = new Scroll();
   Scroll1.setBounds(0,0,310,380);
   Scroll1.setVisible(true);
   Scroll1.setResizable(false);
   Scroll1.setLocationRelativeTo(null);
  }
}