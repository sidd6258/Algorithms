package geeksForGeeks.binaryTree;

public class InOrderSuccessorBT {
		class Node 
		{
		    int data;
		    Node left, right, next;
		  
		    Node(int item) 
		    {
		        data = item;
		        left = right = next = null;
		    }
		}
	    Node root;
	    static Node next = null;
	  
	    /* Set next of p and all descendents of p by traversing them in 
	       reverse Inorder */
	    void populateNext(Node node) 
	    {
	    	if(node!=null){
	    		populateNext(node.right);
	    		node.next = next;
	    		next = node;
	    		populateNext(node.left);
	    	}
	    }
	  
	    /* Driver program to test above functions*/
	    public static void main(String args[]) 
	    {
	        /* Constructed binary tree is
	            10
	           /   \
	          8      12
	         /
	        3    */
	    	InOrderSuccessorBT tree = new InOrderSuccessorBT();
	        tree.root = tree.new Node(10);
	        tree.root.left = tree.new Node(8);
	        tree.root.right = tree.new Node(12);
	        tree.root.left.left = tree.new Node(3);
	  
	        // Populates nextRight pointer in all nodes
	        tree.populateNext(tree.root);
	  
	        // Let us see the populated values
	        Node ptr = tree.root.left.left;
	        while (ptr != null) 
	        {
	            // -1 is printed if there is no successor
	            int print = ptr.next != null ? ptr.next.data : -1;
	            System.out.println("Next of " + ptr.data + " is: " + print);
	            ptr = ptr.next;
	        }
	    }

}
