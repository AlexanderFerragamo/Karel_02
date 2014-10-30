/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Alexander Ferragamo>  // replace <...> with your name
* @version <october 30> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
 public class Athlete extends Robot
   {
   
   public Athlete()
   {
   
      super(1, 1, Display.NORTH, Display.INFINITY);
      }
      public Athlete(int x, int y, int dir, int beep);
      {   
      super(x, y, dir, beep);
      }
      public void turnAround();
      {
      turnLeft();
      turnLeft();
      }
      public void turnRight();
      {
      turnLeft();
      turnLeft();
      turnLeft();
      }
   

   
     }

