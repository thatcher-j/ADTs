/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
package adts;
 
 // import files here as needed
import java.util.*;
 
 public class Queue
 {  // begin class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
        ArrayList<Object> obj = new ArrayList<>();
 	
 	// ********** constructors ***********
        public Queue ()
        {
            
        }
 	
 	// ********** accessors **********
 	public Object peek ()
        {
            return (obj.get(obj.size() - 1));
        }
        
        public Boolean isEmpty ()
        {
             return obj.get (0) == null;
        }
        
 	// ********** mutators **********
        public void enqueue (Object o)
        {
            obj.add (o);
            
            for (int i = 0; i < obj.size () - 1; i++)
            {
                Object temp = obj.get(0);
                obj.add (temp);
                obj.remove (0);
            }
        }
        
        public void dequeue ()
        {
            obj.remove(obj.size() - 1);
        }
        
        public void printOut () //FOR TESTING. REMOVE WHEN FINISHED
        {
            for (int i = 0; i < obj.size (); i++)
            {
                System.out.println (obj.get(i));
            }
        }
        
 
 }  // end class