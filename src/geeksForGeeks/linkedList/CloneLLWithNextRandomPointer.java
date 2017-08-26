package geeksForGeeks.linkedList;

import java.util.HashMap;
import java.util.Map;

public class CloneLLWithNextRandomPointer {
    
	NodeClone head;//Linked list head reference
    

    // Linked list constructor
    public CloneLLWithNextRandomPointer(NodeClone head)
    {
        this.head = head;
    }
 
    // push method to put data always at the head
    // in the linked list.
    public void push(int data)
    {
    	NodeClone node = new NodeClone(data);
        node.next = this.head;
        this.head = node;
    }
 
    // Method to print the list.
    void print()
    {
    	NodeClone temp = head;
        while (temp != null)
        {
        	NodeClone random = temp.random;
            int randomData = (random != null)? random.data: -1;
            System.out.println("Data = " + temp.data +
                               ", Random data = "+ randomData);
            temp = temp.next;
        }
    }
 
    // Actual clone method which returns head
    // reference of cloned linked list.
    public CloneLLWithNextRandomPointer clone()
    {
    	NodeClone origCurr=this.head,cloneCurr=null;
    	
    	Map<NodeClone,NodeClone> map=new HashMap<NodeClone,NodeClone>();
    	while(origCurr!=null){
    		cloneCurr=new NodeClone(origCurr.data);
    		map.put(origCurr, cloneCurr);
    		origCurr=origCurr.next;
    	}
    	origCurr=this.head;
    	while(origCurr!=null){
    		cloneCurr=map.get(origCurr);
    		cloneCurr.next=map.get(origCurr.next);
    		cloneCurr.random=map.get(origCurr.random);
    		origCurr=origCurr.next;
    	}
    	
    	return new CloneLLWithNextRandomPointer(map.get(this.head));
    	
    }

 
    // Main method.
    public static void main(String[] args)
    {
        // Pushing data in the linked list.
  
    	CloneLLWithNextRandomPointer list=new CloneLLWithNextRandomPointer(new NodeClone(5));
        
    	list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
 
        // Setting up random references.
        list.head.random = list.head.next.next;
        list.head.next.random =
            list.head.next.next.next;
        list.head.next.next.random =
            list.head.next.next.next.next;
        list.head.next.next.next.random =
            list.head.next.next.next.next.next;
        list.head.next.next.next.next.random =
            list.head.next;
 
        // Making a clone of the original linked list.
        CloneLLWithNextRandomPointer clone = list.clone();
 
        // Print the original and cloned linked list.
        System.out.println("Original linked list");
        list.print();
        System.out.println("\nCloned linked list");
        clone.print();
    }
}
