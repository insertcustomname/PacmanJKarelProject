import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Player extends Athlete {
   private JFrame frame = new JFrame("Logging keystrokes to control character");
   private int beeperCount;

   public Player() {
      super(2,2,Display.NORTH,0);
      this.beeperCount=beeperCount;
      
   } 
   
   public void startListening() { 
   
      JPanel content = new JPanel();
            
            
            
      content.setLayout(null);
      JLabel component = new JLabel( );
      component.setSize( component.getPreferredSize() );
      component.setLocation(10, 10);
      content.add(component);
   
   
           this.frame=frame;
            JFrame.setDefaultLookAndFeelDecorated(true);

      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
      frame.add( content );
      frame.setSize(10, 10);
      frame.setLocationByPlatform( true );
      frame.setVisible(true);
      KeyListener keyListener = new MotionWithKeyListener(component);   
      component.addKeyListener(keyListener);
      component.setFocusable(true);
   
   
   }
   
    public void stopListening() {
         
         frame.setVisible(false);
         frame.dispose();
      
    }
     public int getBeeperCount() {
     
     return(beeperCount);
     }
      

   public  class MotionWithKeyListener extends KeyAdapter {
   
   
      private Component component;
   
      public MotionWithKeyListener(Component component)
      {
         this.component = component;
      
      }
   
      @Override
      public void keyPressed(KeyEvent e)
      {
      
         if (e.getKeyCode() == KeyEvent.VK_LEFT)
         {
            turnLeft();   
         }
         else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            turnRight();   
         
         }
         else if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (frontIsClear())
            {
               move();
            
            }
         
         }
         else if (e.getKeyCode() == KeyEvent.VK_DOWN)
         {
            turnAround();
         
         }
          else if (e.getKeyCode() == KeyEvent.VK_P) {
            if (nextToABeeper())
            {
               pickBeeper();
               beeperCount++;
            
            }
            
      
      }
       else if (e.getKeyCode() == KeyEvent.VK_D) {
            if (hasBeepers())
            {
               putBeeper();
            
            }
            
      
      }
   }

}
}