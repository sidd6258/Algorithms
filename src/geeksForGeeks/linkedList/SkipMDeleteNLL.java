package geeksForGeeks.linkedList;

public class SkipMDeleteNLL {
	 Node head;  // head of list
	
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
	    
	    void skipMdeleteN(int M, int N){
	    	Node cur=head;
	    	Node t;
	    	while(cur!=null){
	    		for(int i=1;i<M && cur!=null;i++){
	    			cur=cur.next;
	    		}
	    		if(cur==null){
	    			return;
	    		}
	    		t=cur.next;
	    		for(int i=1;i<=N && t!=null;i++){
	    			t=t.next;
	    		}
	    		cur.next=t;
	    		cur=t;
	    	}
	    }
	 
	     /* Drier program to test above functions */
	    public static void main(String args[])
	    {
	    	SkipMDeleteNLL llist = new SkipMDeleteNLL();
	    	int M=2, N=3;
	        /* Constructed Linked List is 1->2->3->4->5->6->7->
	           8->8->9->null */
	        llist.push(10);
	        llist.push(9);
	        llist.push(8);
	        llist.push(7);
	        llist.push(6);
	        llist.push(5);
	        llist.push(4);
	        llist.push(3);
	        llist.push(2);
	        llist.push(1);
	         
	        System.out.println("Given Linked list is :");
	        llist.printList();
	         
	        llist.skipMdeleteN(M, N);
	 
	        System.out.println("Linked list after deletion is :");
	        llist.printList();
	    }
}
