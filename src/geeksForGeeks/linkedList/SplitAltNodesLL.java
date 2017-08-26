package geeksForGeeks.linkedList;

public class SplitAltNodesLL {
	Node head,head1;  // head of list
	  
	 
    void deleteAlt()
    {
    	if(head==null) return;
    	SplitAltNodesLL llist1=new SplitAltNodesLL();
    	SplitAltNodesLL llist2=new SplitAltNodesLL();
    
    	Node current=head;
    	while(current!=null){
    		if(current!=null){
    			llist1.push(current.data);
    		}    		
    		if(current.next!=null){
    			llist2.push(current.next.data);
    		} 
    		if(current.next==null){
    			current=current.next;
    		}    
    		else{
    			current=current.next.next;
    		}
    	}
    	llist1.printList();
    	llist2.printList();
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
        while(temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
    	SplitAltNodesLL llist = new SplitAltNodesLL();
         
        /* Constructed Linked List is 1->2->3->4->5->null */
    	llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
         
        System.out.println("Linked List before calling deleteAlt() ");
        llist.printList();
         
        llist.deleteAlt();
         
        System.out.println("Linked List after calling deleteAlt() ");
        llist.printList();
    }
}
