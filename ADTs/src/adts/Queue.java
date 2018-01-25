/* **********************************************************
 * Programmer:	Joshua R. Thatcher
 * Class:		CS40S
 * 
 * Assignment:	ADTs
 *
 * Description:	Queue data type class 
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
 	public Object peek () //checks the top element in the queue
        {
            return (obj.get(obj.size() - 1));
        }
        
        public boolean isEmpty () //checks if the queue is empty
        {
            return (obj.size() == 0);
        }
        
 	// ********** mutators **********
        public void enqueue (Object o) //add a new element to the queue
        {
            obj.add (o);
            
            for (int i = 0; i < obj.size () - 1; i++) //cycle through the queue until everything is higher than o
            {
                Object temp = obj.get(0);
                obj.add (temp);
                obj.remove (0);
            }
        }
        
        public void dequeue () //remove the top element
        {
            obj.remove(obj.size() - 1);
        }
 
 }  // end class