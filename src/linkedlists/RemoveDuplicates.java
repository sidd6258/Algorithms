package linkedlists;

import java.util.HashSet;
import java.util.Iterator;

class RemoveDuplicates {
	 
    static Node head=null;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to remove duplicates from an
       unsorted linked list */
    HashSet<Integer> remove_duplicates(Node n) {
    	
    	HashSet<Integer> set=new HashSet<Integer>();
    	Node previous=null;
    	while(n.next!=null)
    	{
    		if(set.contains(n.data))
    		{
    			previous.next=n.next;
    		}
    		else
    		{
    			set.add(n.data);
    			previous=n;
    		}
    		n=n.next;
    	}
    	return set;

    }
 
    void printList(HashSet<Integer> set) {
    	Iterator<Integer> it=set.iterator();
    	while(it.hasNext())
        {
        	System.out.print(it.next() + " ");
        }
    }
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
    	RemoveDuplicates list = new RemoveDuplicates();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);
 
        System.out.println("Linked List before removing duplicates : \n ");
        list.printList(head);
 
        HashSet<Integer> set=list.remove_duplicates(head);
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        list.printList(set);
    }
}