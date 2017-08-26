package linkedlists;


public class DeleteMiddleNode {

	static Node head=null;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    void DeleteMiddleNode1(Node n,int k)
    {
    	Node previous=null;
    	if(n.next==null)
    	{
    		System.out.println("No Node to delete \n ");   		
    	}
    	
    	while(n.next!=null)
    	{
    		if(n.data==k)
    		{
    			n=previous;
    			previous.next=n.next.next;
    		}
    		previous=n;
    		n=n.next;
    	}

    }
    
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	
	public static void main(String[] args) {
		DeleteMiddleNode list = new DeleteMiddleNode();
        list.head = new Node(10);
        list.head.next = new Node(11);
        list.head.next.next = new Node(12);
        list.head.next.next.next = new Node(13);
        list.head.next.next.next.next = new Node(14);
        list.head.next.next.next.next.next = new Node(15);
        list.head.next.next.next.next.next.next = new Node(16);
 
        System.out.println("Given Linked List : \n ");
        list.printList(head); 
        System.out.println("\nNode to deleted is 13 \n ");
        list.DeleteMiddleNode1(head,13);
        System.out.println("\nAfter deletion : \n ");
        list.printList(head); 

	}
}
