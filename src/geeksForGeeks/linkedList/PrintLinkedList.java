package geeksForGeeks.linkedList;

public class PrintLinkedList {
	Node head;
	
	void printList(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args)
	    {
	        /* Start with the empty list. */
		PrintLinkedList llist = new PrintLinkedList();
	 
	        llist.head       = new Node(1);
	        Node second      = new Node(2);
	        Node third       = new Node(3);
	 
	        llist.head.next = second; // Link first node with the second node
	        second.next = third; // Link first node with the second node
	 
	        llist.printList();
	    }
}
