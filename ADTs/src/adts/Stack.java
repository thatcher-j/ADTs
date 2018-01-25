/* **********************************************************
 * Programmer:  Joshua R. Thatcher
 * Class:		CS40S
 * 
 * Assignment:	ADTs
 *
 * Description:	Stack data type class
 *
 * 
 * *************************************************************
 */
package adts;
 
 // import files here as needed
import java.util.ArrayList;


 
 
 public class Stack
 {  // begin class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
 	ArrayList<Object> obj = new ArrayList<>();
        
 	// ********** constructors ***********
 	public Stack ()
        {
            
        }
        
 	// ********** accessors **********
        public Object peek () //checks the top element of the stack without removing it
        {
            return (obj.get(obj.size() - 1));
        }
        
        public boolean isEmpty () //checks if there is anything in the stack
        {
            return (obj.size() == 0);
        }
 	
 	// ********** mutators **********
        public void push (Object o) //add a new object to the top
        {
            obj.add (o);
        }
        
        public Object pop () //takes the current top and returns the value
        {
            Object o = obj.get(obj.size() - 1);
            obj.remove(obj.size() - 1); 
            return o;
        }
 
 }  // end class