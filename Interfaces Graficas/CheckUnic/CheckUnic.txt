import javax.swing.*;
import javax.swing.event.*;

public class CheckUnic extends JFrame implements ChangeListener
{
  private JRadioButton radiobutton1,radiobutton2,radiobutton3; 
  private ButtonGroup bg; //abreviacion del BottonGroup :S

  public CheckUnic()
  {
   setLayout(null);
   bg = new ButtonGroup();
   radiobutton1 = new JRadioButton("800 x 600");
   radiobutton1.setBounds(10,10,150,30);
   add(radiobutton1);
   radiobutton1.addChangeListener(this);
   bg.add(radiobutton1);

   radiobutton2 = new JRadioButton("1024 x 800");
   radiobutton2.setBounds(10,50,150,30);
   add(radiobutton2);
   radiobutton2.addChangeListener(this);
   bg.add(radiobutton2);

   radiobutton3 = new JRadioButton("1600 x 900");
   radiobutton3.setBounds(10,90,150,30);
   add(radiobutton3);
   radiobutton3.addChangeListener(this);
   bg.add(radiobutton3);
  }

  public void stateChanged(ChangeEvent e)
  {
   if(radiobutton1.isSelected() == true)
   {
    setSize(800,600);
   }
   if(radiobutton2.isSelected() == true)
   {
    setSize(1024,800);
   }
   if(radiobutton3.isSelected() == true)
   {
    setSize(1600,900);
   }
  }

  public static void main(String args[])
  {
   CheckUnic CheckUnic1 = new CheckUnic();
   CheckUnic1.setBounds(0,0,800,600);
   CheckUnic1.setVisible(true);
   CheckUnic1.setResizable(false);
   CheckUnic1.setLocationRelativeTo(null);
  }























}