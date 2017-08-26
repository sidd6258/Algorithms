package geeksForGeeks.binaryTree;

public class BinaryTreeMaxDepth {
	
	     Node root;
	  
	    /* Compute the "maxDepth" of a tree -- the number of 
	       nodes along the longest path from the root node 
	       down to the farthest leaf node.*/
	    int maxDepth(Node node) 
	    {
	    	if(node == null) return 0;
	    	else {
	    		int ldepth= maxDepth(node.left) + 1;
	    		int rdepth = maxDepth(node.right) + 1;
	    		
	    		if(ldepth > rdepth){
	    			return ldepth;
	    		}
	    		else{
	    			return rdepth;
	    		}
	    		
	    	}
	    }
	      
	    /* Driver program to test above functions */
	    public static void main(String[] args) 
	    {
	    	BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();
	  
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	  
	        System.out.println("Height of tree is : " + 
	                                      tree.maxDepth(tree.root));
	    }

}
