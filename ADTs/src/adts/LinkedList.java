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
 
 
 public class LinkedList
 {  // begin LinkedList class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
        Node head, current;
 	
 	// ********** constructors ***********
        public LinkedList ()
        {
            head = new Node ();
            current = head;
        }
 	
 	// ********** accessors **********
        public Object get ()
        {
            return current.getData ();
        }
        
        public void find (Object o)
        {
            if (current.getData() != o)
            {
                Node temp = current;
                current = head.getPointer ();

                while ((current.getData () != o) && (current.getPointer () != null))
                {
                    current = current.getPointer();
                }

                if (current.getData () != o)
                {
                    System.out.println ("Could not find.");
                    current = temp;
                }
            }
        }
        
        public boolean isEmpty ()
        {
            return (head.getPointer () == null);
        }
 	
 	// ********** mutators **********
        public void next ()
        {
            if (current.getPointer () != null)
            {
                current = current.getPointer ();
            }
            else
            {
                System.out.println ("End of list reached. Please reset.");
            }
        }
        public void reset ()
        {
            current = head.getPointer();
        }
        
        public void insert (Object o)
        {
            Node temp = current;
            current = new Node (o, current.getPointer ());
            temp.editPointer (current);
        }
        
        public void insertFirst (Object o)
        {
            Node temp = new Node (o, head.getPointer ());
            head.editPointer(temp);
        }
        
        public void insertLast (Object o)
        {
            while (current.getPointer () != null)
            {
                current = current.getPointer ();
            }
            
            Node temp = current;
            current = new Node (o, current.getPointer ());
            temp.editPointer (current);
        }
        
        public void delete ()
        {
            Node temp = current;
            current = head.getPointer();
            
            while (current.getPointer () != temp)
            {
                current = current.getPointer ();
            }
            
            current.editPointer (temp.getPointer ());
        }
        
        public void deleteFirst ()
        {
            Node temp = head.getPointer();
            temp = temp.getPointer();
            
            head.editPointer(temp);
            current = temp;
        }
        
        public void deleteLast ()
        {
            //Node temp = current;
            Node prev = current;
            
            if (current.getPointer () == null) //if currently on last element
            {
                //Node prev = current;
                current = head.getPointer();
                
                while (current.getPointer () != prev)
                {
                    current = current.getPointer ();
                }
            }
            else //if not
            {
                while (current.getPointer () != null)
                {
                    prev = current;
                    current = current.getPointer ();
                }
            }
            
            prev.editPointer (null);
            //current = temp;
            current = prev;
        }
        
        private class Node
    {  // begin Node class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
            Node pointer;
            Object data;
 	
 	// ********** constructors ***********
            private Node ()
            {
                data = "***HEAD***";
            }
            
            private Node (Object o, Node n)
            {
                pointer = n;
                data = o;
            }
 	
 	// ********** accessors **********
            private Object getData ()
            {
                return data;
            }
            
            private Node getPointer ()
            {
                return pointer;
            }
 	
 	// ********** mutators **********
            private void editData (Object o)
            {
                data = o;
            }
            private void editPointer (Node n)
            {
                pointer = n;
            }
 
    }  // end Node class
 
 }  // end LinkedList class

