import javax.swing.JOptionPane;


public class GameLoop implements Runnable {

   Player player1;
   Ghost ghost1;
   Ghost ghost2;
   Ghost ghost3;
   Ghost ghost4;
   volatile boolean gameRunning = true;
   volatile boolean endGame = false;

   

    public GameLoop(Player player1, Ghost ghost1, Ghost ghost2, Ghost ghost3, Ghost ghost4) {
                                    
      
         this.player1=player1;
         this.ghost1=ghost1;
         this.ghost2=ghost2;
         this.ghost3=ghost3;
         this.ghost4=ghost4;


        


         
    
         

    }

    public void run() {
       
       
        
                     

      while (gameRunning==true) {
           
            
            if (player1.getX()==ghost1.getX() && player1.getY() == ghost1.getY()) {
               gameRunning=false;
            }
            if (player1.getX()==ghost2.getX() && player1.getY() == ghost2.getY()) {
               gameRunning=false;
            }
            if (player1.getX()==ghost3.getX() && player1.getY() == ghost3.getY()) {
               gameRunning=false;
            }
            if (player1.getX()==ghost4.getX() && player1.getY() == ghost4.getY()) {
               gameRunning=false;
            }

                     
                     
      
            
            }
            
              String[] options = new String[] {"Back to arcade", "End game"};
            int response = JOptionPane.showOptionDialog(null, "Game over! Your score was " + player1.getBeeperCount(), "Game over",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);
             if (response == 0) {
               endGame=true;
            
               }
               
             else {
             System.exit(0);
             
    }
    }
    
    public boolean isRunning() {
            return(endGame);
    
    }
}


