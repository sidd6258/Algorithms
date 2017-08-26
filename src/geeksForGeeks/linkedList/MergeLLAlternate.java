package geeksForGeeks.linkedList;

public class MergeLLAlternate {

	    Node head;  // head of list

	    /* Inserts a new Node at front of the list. */
	    void push(int new_data)
	    {
	        /* 1 & 2: Allocate the Node &
	                  Put in the data*/
	        Node new_node = new Node(new_data);
	 
	        /* 3. Make next of new Node as head */
	        new_node.next = head;
	 
	        /* 4. Move the head to point to new Node */
	        head = new_node;
	    }
	 
	    // Main function that inserts nodes of linked list q into p at
	    // alternate positions. Since head of first list never changes
	    // and head of second list/ may change, we need single pointer
	    // for first list and double pointer for second list.
	    void merge(MergeLLAlternate q)
	    {
	    	Node p_curr=head;
	    	Node q_curr=q.head;
	    	Node p_next,q_next;
	    	
	    	while(p_curr!=null && q_curr!=null){
	    		p_next=p_curr.next;
	    		q_next=q_curr.next;
	    		
	    		q_curr.next=p_next;
	    		p_curr.next=q_curr;
	    		
	    		if(q_next==null){
	    			q_curr.next=p_next;
	    		}
	    		else{
	    			p_curr=p_next;
	    		}    		
	    		if(p_next==null){
	    			q_curr.next=q_next;
	    		}
	    		else{
	    			q_curr=q_next;	  
	    		}	    		  		
	    	}
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
	    	MergeLLAlternate llist1 = new MergeLLAlternate();
	    	MergeLLAlternate llist2 = new MergeLLAlternate();
	        llist1.push(5);
	        llist1.push(4);
	        llist1.push(3);
	        llist1.push(2);
	        llist1.push(1);
	        
	        System.out.println("First Linked List:");
	        llist1.printList();
	 
	        llist2.push(8);
	        llist2.push(7);
	        llist2.push(6);

	 
	        System.out.println("Second Linked List:");
	        llist2.printList();
	        llist1.merge(llist2);
	 
	        System.out.println("Merged linked list:");
	        llist1.printList();

	    }
	
}
