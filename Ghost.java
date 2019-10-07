import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import java.lang.Math; 


public class Ghost extends Athlete {
   public Ghost(int x, int y, int dir, int beepers) {
      super(x,y,dir,beepers);
      
   } 
   
   public void roamMaze() { 
   int moveCount=0;
   while (true) {
    /*
         if (rightIsClear()) {
            turnRight();
         }
         
         */
               if (rightIsClear()) {
               if (Math.random() > 0.5) {

                     turnRight();
                     moveCount++;
                     
                     
                     }
               else { 
               
               
                    turnLeft();
                    moveCount++;
                    
                    
                    }
         }
      
         else {
         
               while(!frontIsClear()) {
               
                     turnLeft();
                     moveCount++;
               }
         }
         

         
           
                     

                     
                                   
                if (frontIsClear()) {
                move();
                moveCount++;
                
                }
                try {
            Thread.sleep(350);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         }
        
         
}

   
   
   }
   
   
   
   