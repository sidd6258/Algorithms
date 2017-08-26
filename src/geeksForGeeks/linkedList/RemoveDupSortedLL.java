package geeksForGeeks.linkedList;

public class RemoveDupSortedLL {
	   Node head;  // head of list
	   
	 
	    void removeDuplicates()
	    {
	        /*Another reference to head*/
	        Node current = head;
	
	 
	        /* do nothing if the list is empty */
	        if (head == null)    
	            return;
	 
	        /* Traverse list till the last node */
	        while (current.next != null) {
	 
	            /*Compare current node with the next node */
	            if (current.data == current.next.data) {
	                current.next = current.next.next;
	            }
	            else // advance if no deletion
	               current = current.next;
	        }
	    }
	                     
	    /* Utility functions */
	 
	    /* Inserts a new Node at front of the list. */
	    public void push(int new_data)
	    {
	        /* 1 & 2: Allocate the Node &
	                  Put in the data*/
	        Node new_node = new Node(new_data);
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head;
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node;
	    }
	 
	    /* Function to print linked list */
	     void printList()
	     {
	         Node temp = head;
	         while (temp != null)
	         {
	            System.out.print(temp.data+" ");
	            temp = temp.next;
	         }  
	         System.out.println();
	     }
	 
	     /* Drier program to test above functions */
	    public static void main(String args[])
	    {
	    	RemoveDupSortedLL llist = new RemoveDupSortedLL();
	        llist.push(20);
	        llist.push(13);
	        llist.push(13);
	        llist.push(11);
	        llist.push(11);
	        llist.push(11);
	         
	        System.out.println("List before removal of duplicates");
	        llist.printList();
	         
	        llist.removeDuplicates();
	         
	        System.out.println("List after removal of elements");
	        llist.printList();
	    }
}
