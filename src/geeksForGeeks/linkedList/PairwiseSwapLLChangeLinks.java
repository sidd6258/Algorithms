package geeksForGeeks.linkedList;

public class PairwiseSwapLLChangeLinks {
	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to pairwise swap elements of a linked list */
    Node pairWiseSwap(Node node) {
 
        // If linked list is empty or there is only one node in list
        if (node == null || node.next == null) {
            return null;
        }
        
        Node prev=node;
        Node curr=node.next;
        node=curr;
        
        while(curr!=null){
        	Node next=curr.next;
        	curr.next=prev;
        	if(next==null||next.next==null){
        		prev.next=next;
        		break;
        	}
        	prev.next=next.next;
        	prev=next;
        	curr=next.next;
        }
        return node;
    }
 
    /* Function to print nodes in a given linked list */
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
 
        /* The constructed linked list is:
         1->2->3->4->5->6->7 */
    	PairwiseSwapLLChangeLinks list = new PairwiseSwapLLChangeLinks();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
 
        System.out.println("Linked list before calling pairwiseSwap() ");
        list.printList(head);
        Node st = list.pairWiseSwap(head);
        System.out.println("");
        System.out.println("Linked list after calling pairwiseSwap() ");
        list.printList(st);
        System.out.println("");
 
    }
}
