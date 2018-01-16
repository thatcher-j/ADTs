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
        public Object peek ()
        {
            return (obj.get(obj.size() - 1));
        }
        
        public Boolean isEmpty ()
        {
             return obj.get (0) == null;
        }
 	
 	// ********** mutators **********
        public void push (Object o)
        {
            obj.add (o);
        }
        
        public Object pop ()
        {
            Object o = obj.get(obj.size() - 1);
            obj.remove(obj.size() - 1); 
            //printOut ();
            return o;
        }
        
        public void printOut () //FOR TESTING. REMOVE WHEN FINISHED
        {
            
            for (int i = 0; i < obj.size (); i++)
            {
                System.out.println (obj.get(i));
            }
        }
 
 }  // end class