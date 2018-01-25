/* **********************************************************
 * Programmer:	Joshua R. Thatcher
 * Class:		CS40S
 * 
 * Assignment:	ADTs
 *
 * Description:	LinkedList data type class
 *
 * 
 * *************************************************************
 */
package adts;
 
 // import files here as needed
 
 
 public class LinkedList
 {  // begin LinkedList class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
        Node head, current;
 	
 	// ********** constructors ***********
        public LinkedList ()
        {
            head = new Node (); //create head using default constructor
            current = head; //set the current node to the head
        }
 	
 	// ********** accessors **********
        public Object get () //return the current node's payload
        {
            return current.getData ();
        }
        
        public void find (Object o) //automatically traverse the list to go directly to the node with a given payload
        {
            if (current.getData() != o) //if the payload isn't contained in the current node
            {
                Node temp = current;
                current = head.getPointer ();

                while ((current.getData () != o) && (current.getPointer () != null)) //while the payload isn't contained in the current node and it isn't the last node in the list
                {
                    current = current.getPointer();
                }

                if (current.getData () != o) //if the last element was reached but didn't have the given payload
                {
                    System.out.println ("Could not find.");
                    current = temp;
                }
            }
        }
        
        public boolean isEmpty () //if the list is empty
        {
            return (head.getPointer () == null);
        }
 	
 	// ********** mutators **********
        public void next () //advances the current node by one
        {
            if (current.getPointer () != null) //if not at the end of the list
            {
                current = current.getPointer ();
            }
            else
            {
                System.out.println ("End of list reached. Please reset.");
            }
        }
        public void reset () //move the pointer back to the beginning
        {
            current = head.getPointer();
        }
        
        public void insert (Object o) //insert a new piece of data at the current location
        {
            Node temp = current;
            current = new Node (o, current.getPointer ());
            temp.editPointer (current);
        }
        
        public void insertFirst (Object o) //insert a new piece of data at the start of the list
        {
            Node temp = new Node (o, head.getPointer ());
            head.editPointer(temp);
        }
        
        public void insertLast (Object o) //insert a new piece of data at the end of the list
        {
            while (current.getPointer () != null) //while not at the last element
            {
                current = current.getPointer ();
            }
            
            Node temp = current;
            current = new Node (o, current.getPointer ());
            temp.editPointer (current);
        }
        
        public void delete () //delete the current piece of data
        {
            Node temp = current;
            current = head.getPointer();
            
            while (current.getPointer () != temp) //while not at the previous node in the list
            {
                current = current.getPointer ();
            }
            
            current.editPointer (temp.getPointer ());
        }
        
        public void deleteFirst () //delete the first piece of data
        {
            Node temp = head.getPointer();
            temp = temp.getPointer();
            
            head.editPointer(temp);
            current = temp;
        }
        
        public void deleteLast () //delete the last piece of data
        {
            Node prev = current;
            
            if (current.getPointer () == null) //if currently on last element
            {
                current = head.getPointer();
                
                while (current.getPointer () != prev) //while not at the element previous to last element
                {
                    current = current.getPointer ();
                }
            }
            else //if not
            {
                while (current.getPointer () != null) //while not at the end of the list
                {
                    prev = current;
                    current = current.getPointer ();
                }
            }
            
            prev.editPointer (null);
            current = prev;
        }
        
        private class Node
    {  // begin Node class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
            Node pointer; //next node object in the list
            Object data; //payload
 	
 	// ********** constructors ***********
            private Node () //for the head
            {
                data = "***HEAD***";
            }
            
            private Node (Object o, Node n) //for all others
            {
                pointer = n;
                data = o;
            }
 	
 	// ********** accessors **********
            private Object getData () //return payload
            {
                return data;
            }
            
            private Node getPointer () //return next node in the list
            {
                return pointer;
            }
 	
 	// ********** mutators **********
            private void editData (Object o) //edit payload
            {
                data = o;
            }
            private void editPointer (Node n) //edit the pointer
            {
                pointer = n;
            }
 
    }  // end Node class
 
 }  // end LinkedList class

