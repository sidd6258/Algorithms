package geeksForGeeks.linkedList;

import java.util.HashSet;

public class RemoveDuplicatesUnsortedLL {
     Node head;
    /* Function to remove duplicates from a
       unsorted linked list */
    static void removeDuplicate(Node head) 
    {
    	if(head==null) return;
    	
    	HashSet<Integer> hs=new HashSet<>();
    	Node current=head;
    	Node prev=null;
    	
    	while(current!=null){
    		if(hs.contains(current.data)){
    			prev.next=current.next;
    		}
    		else{
    			hs.add(current.data);
    			prev=current;
    		}
    		current=current.next;
    	}
 
    }
     
    /* Function to print nodes in a given linked list */
    static void printList(Node head) 
    {
        while (head != null) 
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
 
    public static void main(String[] args) 
    {
        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
    	RemoveDuplicatesUnsortedLL llist = new RemoveDuplicatesUnsortedLL();
        llist.head = new Node(10);
        llist.head.next = new Node(12);
        llist.head.next.next = new Node(11);
        llist.head.next.next.next = new Node(11);
        llist.head.next.next.next.next = new Node(12);
        llist.head.next.next.next.next.next = new Node(11);
        llist.head.next.next.next.next.next.next = new Node(10);
 
        System.out.println("Linked list before removing duplicates :");
        printList(llist.head);
 
        removeDuplicate(llist.head);
 
        System.out.println("\nLinked list after removing duplicates :");
        printList(llist.head);
    }
}
