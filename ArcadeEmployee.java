import edu.fcps.karel2.Display;
public class ArcadeEmployee extends Athlete {

      public ArcadeEmployee() {
      
            super(5,4,Display.SOUTH,0);
      }
      public void waitForTransactions(Player player1) {
      while (true) {
               if (nextToABeeper()) {
               
               
               player1.stopListening();

               pickBeeper();
               MainGame.beginGame();
               
               }
               
    }
    
    }

  
}