package geeksForGeeks.binaryTree;

public class PrintNodeAtSomeDistanceFromNode {

	    Node root;
	  
	    void printKDistant(Node node, int k) 
	    {
	    	if(node == null) return;
	    	if(k==0){
	    		System.out.println(node.key);
	    		return;
	    	}
	    	else {
	    	if(node.left != null){
	    		printKDistant(node.left,k-1);
	    	}
	    	if(node.right != null){
	    		printKDistant(node.right,k-1);
	    	}
	    	}
	    }
	     
	    /* Driver program to test above functions */
	    public static void main(String args[]) {
	    	PrintNodeAtSomeDistanceFromNode tree = new PrintNodeAtSomeDistanceFromNode();
	         
	        /* Constructed binary tree is
	                1
	              /   \
	             2     3
	            /  \   /
	           4    5 8 
	        */
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(8);
	  
	        tree.printKDistant(tree.root, 2);
	    }
	
}
