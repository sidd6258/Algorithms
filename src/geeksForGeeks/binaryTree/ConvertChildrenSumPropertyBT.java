package geeksForGeeks.binaryTree;

public class ConvertChildrenSumPropertyBT {

	    Node root;
	    /* This function changes a tree to to hold children sum
	       property */
	  
	    void convertTree(Node node) 
	    {
	    	int leftData=0;
	    	int rightData=0;
	    	int diff=0;
	    	if(node == null || (node.left == null && node.right == null)) return;
	    	else{
	    		convertTree(node.left);
	    		convertTree(node.right);
	    		
	    		if(node.left !=null){
	    			leftData = node.left.key;
	    		}
	    		if(node.right != null){
	    			rightData = node.right.key;
	    		}
	    		diff = leftData + rightData - node.key;
	    		
	    		if(diff > 0){
	    			node.key = node.key + diff;
	    		} else {
	    			increment(node,-diff);
	    		}
	    	}
	    }
	  
	    /* This function is used to increment subtree by diff */
	    void increment(Node node, int diff) 
	    {
	       if(node.left != null){
	    	   node.left.key = node.left.key + diff;
	    	   increment(node.left,diff);
	       }
	       else if(node.right != null) {
	    	   node.right.key = node.right.key + diff;
	    	   increment(node.right,diff);
	       }
	    }
	  
	    /* Given a binary tree, printInorder() prints out its
	     inorder traversal*/
	    void printInorder(Node node) 
	    {
	        if (node == null)
	            return;
	             
	        /* first recur on left child */
	        printInorder(node.left);
	  
	        /* then print the data of node */
	        System.out.print(node.key + " ");
	  
	        /* now recur on right child */
	        printInorder(node.right);
	    }
	  
	    // Driver program to test above functions
	    public static void main(String args[]) 
	    {
	    	ConvertChildrenSumPropertyBT tree = new ConvertChildrenSumPropertyBT();
	        tree.root = new Node(50);
	        tree.root.left = new Node(7);
	        tree.root.right = new Node(2);
	        tree.root.left.left = new Node(3);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(1);
	        tree.root.right.right = new Node(30);
	  
	        System.out.println("Inorder traversal before conversion is :");
	        tree.printInorder(tree.root);
	  
	        tree.convertTree(tree.root);
	        System.out.println("");
	  
	        System.out.println("Inorder traversal after conversion is :");
	        tree.printInorder(tree.root);
	  
	    }
	
}
