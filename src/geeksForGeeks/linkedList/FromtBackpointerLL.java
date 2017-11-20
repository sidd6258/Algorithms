package geeksForGeeks.linkedList;

import java.util.Stack;

public class FromtBackpointerLL {
		Node head;  // head of list
		 
	 
	    // This function rotates a linked list counter-clockwise
	    // and updates the head. The function assumes that k is
	    // smaller than size of linked list. It doesn't modify
	    // the list if k is greater than or equal to size
	    void changeLink(Node head)
	    {
	    	Stack<Node> st=new Stack<>();
	    	Node current=head;
	    	while(current!=null){
	    		st.push(current);
	    		current=current.next;
	    	}
	    	current=head;
	    	Node slow=current;
	    	Node fast=current;
	    	while(fast.next.next!=null){
	    		slow=current.next;
	    		fast=current.next.next;
	    		current=current.next;
	    	}
	    	current=head;
	    	while(current.data!=slow.data){
	    		Node oldnext=current.next;
	    		current.next=st.pop();
	    		current.next.next=oldnext;
	    		current=oldnext;
	    	}
	    	current.next=null;
	    	printList();	    	
	    }
	 
	    /*  Given a reference (pointer to pointer) to the head
	        of a list and an int, push a new node on the front
	        of the list. */
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
	    	FromtBackpointerLL llist = new FromtBackpointerLL();
	 
	        // create a list 10->20->30->40->50->60
	        for (int i = 50; i >= 10; i -= 10)
	            llist.push(i);
	 
	        System.out.println("Given list");
	        llist.printList();
	 
	        llist.changeLink(llist.head);
	 
	        System.out.println("Rotated Linked List");
	        llist.printList();
	    }
}
