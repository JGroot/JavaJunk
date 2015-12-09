import java.applet.Applet;
import java.awt.*;
import java.awt.Event;

public class mouseEvents extends JApplet
{
   private JTextField[] mouseStates;
   private String[] text = {"Entered", "Here", "There", "Yo", "Dude", "Hey", "OHMY"};
   public void init()
   {
    setLayout(new FlowLayout());
    mouseStates = new JTextField[8];
    
    for (int i = 0; i < 8; i++)
    {
      mouseStates[i] = new JTextField(text[i], 10);
      mouseStates[i].setEditable(false);
      add(mouseStates[i]);
     } 
     addMouseListener(new MyMouseListener());
     addMouseMotionListener(new MyMouseMotionlistener());
      
   }
   
   public void clearTextFields()
   {
      for (int i = 0; i < 6; i++)
         mouseStates[i].setBackground(Color.lightGray);
   }
   
   private class MyMouseListener implements MouseListener
   {  
      public void mousePressed(MouseEvent e)
      {
         clearTextFields();
         mouseStates[0].setBackground(Color.yellow);
      }
      
      public void mouseReleased(MouseEvent e)
      {
         clearTextFields();
         mouseStates[2].setBackground(Color.yellow);
      }
      
        public void mouseEntered(MouseEvent e)
      {
         clearTextFields();
         mouseStates[3].setBackground(Color.yellow);
      }
      
        public void mouseExited(MouseEvent e)
      {
         clearTextFields();
         mouseStates[4].setBackground(Color.yellow);
      }
      
     
      private class MyMouseMotionListener implements MouseMotionListener
      {
           public void mouseDragged(MouseEvent e)
           {
            clearTextFields();
            mouseStates[5].setBackground(Color.yellow);
           }
           
           public void mouseMoved(MouseEvent e)
           {
            clearTextFields();
            mouseStates[6].setText("Ooga Booga" + e.getX());
            mouseStates[6].setText("Dooga Doo " + e.getY());
           }
 
      }

   }
}