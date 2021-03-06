package geeksForGeeks.linkedList;

public class RotateLL {
	Node head;  // head of list
	 
 
    // This function rotates a linked list counter-clockwise
    // and updates the head. The function assumes that k is
    // smaller than size of linked list. It doesn't modify
    // the list if k is greater than or equal to size
    void rotate(int k)
    {
    	if(k==0) return;
    	
    	Node current=head;
    	int count=1;
    	
    	while(count<k && current!=null){
    		current=current.next;
    		count++;
    	}
    	if(current==null){
    		return;
    	}
    	Node KthNode=current;
    	
    	while(current.next!=null){
    		current=current.next;
    	}
    	
    	current.next=head;
    	head=KthNode.next;
    	KthNode.next=null;
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
    	RotateLL llist = new RotateLL();
 
        // create a list 10->20->30->40->50->60
        for (int i = 60; i >= 10; i -= 10)
            llist.push(i);
 
        System.out.println("Given list");
        llist.printList();
 
        llist.rotate(4);
 
        System.out.println("Rotated Linked List");
        llist.printList();
    }
}
