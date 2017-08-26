package geeksForGeeks.binarySearchTree;

public class MinValBST {
	    static Node head;
	     
	    /* Given a binary search tree and a number, 
	     inserts a new node with the given number in 
	     the correct place in the tree. Returns the new 
	     root pointer which the caller should then use 
	     (the standard trick to avoid using reference 
	     parameters). */
	    Node insert(Node node, int data) {
	         
	        /* 1. If the tree is empty, return a new,     
	         single node */
	        if (node == null) {
	            return (new Node(data));
	        } else {
	             
	            /* 2. Otherwise, recur down the tree */
	            if (data <= node.key) {
	                node.left = insert(node.left, data);
	            } else {
	                node.right = insert(node.right, data);
	            }
	 
	            /* return the (unchanged) node pointer */
	            return node;
	        }
	    }
	 
	    /* Given a non-empty binary search tree,  
	     return the minimum data value found in that 
	     tree. Note that the entire tree does not need 
	     to be searched. */
	    int minvalue(Node node) {
	    	if(node.left == null) return node.key;
	    	int min=node.key;
	    	while(node.left!=null){
	    		min=node.left.key;
	    		node=node.left;
	    	}
	    	return min;
	    }
	     
	    // Driver program to test above functions
	    public static void main(String[] args) {
	    	MinValBST tree = new MinValBST();
	        Node root = null;
	        root = tree.insert(root, 4);
	        tree.insert(root, 2);
	        tree.insert(root, 1);
	        tree.insert(root, 3);
	        tree.insert(root, 6);
	        tree.insert(root, 5);
	 
	        System.out.println("The minimum value of BST is " + tree.minvalue(root));
	    }
	
}
