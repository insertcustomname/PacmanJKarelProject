import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import java.lang.Math; 


public class BeeperPlacingGhost extends Ghost {
   public BeeperPlacingGhost(int x, int y, int dir) {
      super(x,y,dir,Display.INFINITY);
      
   } 
   
public void roamMaze() { 
   explode();
   
   while (true) {
    
         if (rightIsClear()) {
            turnRight();
         }
      
         else {
         
               while(!frontIsClear()) {
               
                     turnLeft();
               }
         }
         if (Math.random() < 0.005) {
            putBeeper();
         }
         move();
                    
}


   
   
   }
   
   
}