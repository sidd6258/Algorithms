package geeksForGeeks.linkedList;


public class ReverseSingleLinkedList {
	
	static Node head;
	
	class Node{
		 Node next;
		 int value;
		 Node(int value) {this.value = value;}
		}
 
    /* Function to reverse the linked list */
    public Node reverseList(Node node) {
    	
    	if (node == null || node.next == null) {
            return node;
        }
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node = prev;
        return node;
    }
 
    // prints content of single linked list
    void printList(Node node) {

        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    	if(node==null){
    		System.out.print("null");
    	}
    }
    
    public void append(int new_data)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Node new_node = new Node(new_data);
 
        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
 
        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;
 
        /* 5. Else traverse till the last node */
        Node last = head; 
        while (last.next != null)
            last = last.next;
 
        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
 
    public static void main(String[] args) {
    	
    	ReverseSingleLinkedList list = new ReverseSingleLinkedList();   	
    	list.append(1);
    	list.append(2);
        list.append(3);
        list.append(4);         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
