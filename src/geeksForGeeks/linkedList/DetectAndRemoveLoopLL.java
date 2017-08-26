package geeksForGeeks.linkedList;

public class DetectAndRemoveLoopLL {
	 static Node head;
	 
	 
	    // Function that detects loop in the list
	    int detectAndRemoveLoop(Node node) {
	    	Node slow=node,fast=node;
	    	while(slow!=null && fast!=null && fast.next!=null){
	    		slow=slow.next;
	    		fast=fast.next.next;
	    		if(slow==fast){
	    			removeLoop(slow,node);
	    			return 1;
	    		}
	    	}
	    	return 0;
	    }
	 
	    // Function to remove loop
	    void removeLoop(Node loop, Node curr) {
	    	Node ptr1=curr,ptr2=null;
	    	
	    	while(1==1){
	    	ptr2=loop;
	    	
	    	while(ptr2.next!=loop && ptr2.next!=ptr1){
	    		ptr2=ptr2.next;
	    	}
	    	if(ptr2.next==ptr1){
	    		break;
	    	}
	    	ptr1=ptr1.next;	    		
	    	}
	    	ptr2.next=null;
	    }
	 
	    // Function to print the linked list
	    void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	    // Driver program to test above functions
	    public static void main(String[] args) {
	    	DetectAndRemoveLoopLL list = new DetectAndRemoveLoopLL();
	        list.head = new Node(50);
	        list.head.next = new Node(20);
	        list.head.next.next = new Node(15);
	        list.head.next.next.next = new Node(4);
	        list.head.next.next.next.next = new Node(10);
	 
	        // Creating a loop for testing 
	        head.next.next.next.next.next = head.next.next;
	        list.detectAndRemoveLoop(head);
	        System.out.println("Linked List after removing loop : ");
	        list.printList(head);
	    }
}
