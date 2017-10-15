package geeksForGeeks.linkedList;

public class DeleteGivenKeyLL {
	Node head; // head of list
 
    /* Given a key, deletes the first occurrence of key in linked list */
	void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (head.data==key)
        {
            head = head.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp.next != null && temp.next.data != key)
        {
            temp = temp.next;
        }    
 
        // If key was not present in linked list
        if (temp == null) return;
 
        // Unlink the node from linked list
        temp.next = temp.next.next;
    }
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
 
    /* Drier program to test above functions. Ideally this function
    should be in a separate user class. It is kept here to keep
    code compact */
    public static void main(String[] args)
    {
    	DeleteGivenKeyLL llist = new DeleteGivenKeyLL();
 
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
 
        System.out.println("\nCreated Linked list is:");
        llist.printList();
 
        llist.deleteNode(3); // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
    }

}
