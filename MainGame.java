import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;



public class MainGame{

   public static void CheckForEndGame(Player player1) {
   
      while (true) {
      
      
         if (player1.nextToARobot()) {
         
            player1.explode();
         }
      
      }
   
   
   }
   public static void startArcade() {
   
   
   Display.openWorld("/users/suhas/desktop/apcs/units/unit1/maps/arcade.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      ArcadeEmployee employee1 = new ArcadeEmployee();
      Player player1 = new Player();
      player1.startListening();
      employee1.waitForTransactions(player1);
      
          }
   public static void beginGame() {
   
   Display.openWorld("/users/suhas/desktop/apcs/units/unit1/maps/Pacman2.map");
      Display.setSize(15,15);
      Display.setSpeed(10);
      Player player1 = new Player();
      player1.startListening();
  
      
      
      Ghost ghost1 = new Ghost(2,14,Display.EAST,0);
      Ghost ghost2 = new Ghost(14,14,Display.WEST,0);
      Ghost ghost3 = new Ghost(11,6,Display.WEST,0);
      Ghost ghost4 = new Ghost(14,2,Display.WEST,0);



   
  
      GameLoop gloop = new GameLoop(player1,ghost1,ghost2,ghost3,ghost4);
      Thread gamethread = new Thread(gloop);
      gamethread.start();
      
      Ghost beeper1 = new BeeperPlacingGhost(6,10,Display.EAST);
      Ghost beeper2 = new BeeperPlacingGhost(10,4,Display.WEST);
   
  
      GhostLoop bloop = new GhostLoop(beeper1);
      Thread beeperthread = new Thread(bloop);
   
      beeperthread.start();
   
      GhostLoop bloop2 = new GhostLoop(beeper2);
      Thread beeperthread2 = new Thread(bloop2);
      beeperthread2.start();
      
      
   
     



      GhostLoop loop = new GhostLoop(ghost1);
   
      Thread loopthread1 = new Thread(loop);
      loopthread1.start();
    
      GhostLoop loop2 = new GhostLoop(ghost2);
      Thread loopthread2 = new Thread(loop2);
      loopthread2.start();
     
      GhostLoop loop3 = new GhostLoop(ghost3);
      Thread loopthread3 = new Thread(loop3);
      loopthread3.start();
      GhostLoop loop4 = new GhostLoop(ghost4);
      Thread loopthread4 = new Thread(loop4);
      loopthread4.start();
      while (!gloop.isRunning()) {
            
            
      
      }
      loopthread1.stop();
      loopthread2.stop();
      loopthread3.stop();
      loopthread4.stop();

      beeperthread.stop();
      beeperthread2.stop();
      gamethread.stop();
      player1.stopListening();

      startArcade();
      


   
   }
   
   public static void main(String[] args)
   {
   
   			//  Create a panel with a component to be moved
      startArcade();
      
            
      
      
      }

   
   
       

      
      
      
      
            
      
   
      
   
   
             
      
      
      
   
         
        
   
                        
            
}
	

      
      
   
   
   

