//DrawPanelTest.java
//creating JFrame to display DrawPanel
import javax.swing.JFrame;

public class DrawPanelTest
{
   public static void main(String[] args)
   {
      
      DrawPanel panel = new DrawPanel();
      
      // create a new frame to hold the panel
      JFrame application = new JFrame();

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      application.add(panel);      
      application.setSize(250, 250); 
      application.setVisible(true);     
   } 
} // end class DrawPanelTest
