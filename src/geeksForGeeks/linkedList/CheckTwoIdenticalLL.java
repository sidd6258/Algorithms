package geeksForGeeks.linkedList;

public class CheckTwoIdenticalLL {
	  Node head;  // head of list
	  
	    /* Returns true if linked lists a and b are identical,
	       otherwise false */
	    static boolean areIdentical(Node a,Node b)
	    {
	    	if(a==null && b==null) return true;
	    	if(a!=null && b!=null){
	    		return (a.data==b.data) && areIdentical(a.next,b.next);
	    	}
	    	return false;
	    }
	 
	    /* UTILITY FUNCTIONS TO TEST fun1() and fun2() */
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
	 
	 
	    /* Drier program to test above functions */
	    public static void main(String args[])
	    {
	    	CheckTwoIdenticalLL llist1 = new CheckTwoIdenticalLL();
	    	CheckTwoIdenticalLL llist2 = new CheckTwoIdenticalLL();
	 
	        /* The constructed linked lists are :
	           llist1: 3->2->1
	           llist2: 3->2->1 */
	 
	        llist1.push(1);
	        llist1.push(2);
	        llist1.push(3);
	 
	        llist2.push(1);
	        llist2.push(2);
	        llist2.push(3);
	 
	        if (areIdentical(llist1.head,llist2.head))
	            System.out.println("Identical ");
	        else
	            System.out.println("Not identical ");
	 
	    }
}
