package linkedlists;

import linkedlists.DeleteMiddleNode.Node;

public class Partition {
	
	static Node head=null;
	private Node temp;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    Node PartionNode(Node n,int k)
    {
    	Node beforeStart=null;
    	Node beforeEnd=null;
    	Node afterEnd=null;
    	Node afterStart=null;

    	if(n.next==null)
    	{
    		System.out.println("No Node to partition \n ");   		
    	}  
    	while(n!=null)
    	{
    		Node next= n.next;
    		n.next=null;
    		if(n.data<k)
    		{
    			if(beforeStart==null)
    			{
    				beforeStart=n;  
    				beforeEnd=beforeStart;
    			}
    			beforeEnd.next=n;
    			 beforeEnd=n;
    		}
    		else
    		{
    			if(afterStart==null)
    			{
    				afterEnd=n; 
    				afterStart=n;
    			}
    			afterEnd.next=n;
    			afterEnd=n;
    		}
    		n=next;
    	}
    	beforeEnd.next=afterStart;
    	return beforeStart;
    }
	
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	
	public static void main(String[] args) {
		Partition list = new Partition();
        list.head = new Node(3);
        list.head.next = new Node(5);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next = new Node(1); 
        System.out.println("Given Linked List : \n ");
        list.printList(head); 
        Node partitioned=list.PartionNode(head,5);
        System.out.println("\n Linked List After Partition  : \n ");
        list.printList(partitioned); 

	}

}
