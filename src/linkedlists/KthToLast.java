package linkedlists;

import java.util.HashSet;

import linkedlists.RemoveDuplicates.Node;

public class KthToLast {
	static Node head=null;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    int KthElementFromLast(Node n,int k)
    {
    	if(n.next==null)
    	{
    		return 0;
    	}   		
    	int index=KthElementFromLast(n.next,k)+1;
    	if(index==k)
    	{
    		System.out.println("\n"+k+"th element to the last is "+n.data);
    	}
    	return index;
    }
 
    
	public static void main(String[] args) {
		KthToLast list = new KthToLast();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);
 
        System.out.println("Given Linked List : \n ");
        list.printList(head); 
        list.KthElementFromLast(head,5);

	}

}
