public class GhostLoop implements Runnable {

   Ghost ghost1;

    public GhostLoop(Ghost ghost1) {
                                    
      
         this.ghost1=ghost1;
    
         

    }

    public void run() {
        
               ghost1.roamMaze();
                         
            }
}


