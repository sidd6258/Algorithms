package geeksForGeeks.binaryTree;

public class LevelOrderRecursiveBT {


	    Node root;
	  
	    /* Function to print REVERSE level order traversal a tree*/
	    void reverseLevelOrder(Node node) 
	    {
	    	int h=height(node);
	    	int i;
	    	for(i=1;i<=h;i++){
	    		printGivenLevel(node, i);
	    	}
	    }
	  
	    /* Print nodes at a given level */
	    void printGivenLevel(Node node, int level) 
	    {
	    	if(node == null) return;	    	
	    	if(level==1) System.out.print(node.key+" ");
	    	else if(level>1){
	    		printGivenLevel(node.left,level-1);
	    		printGivenLevel(node.right,level-1);
	    	}
	    }
	  
	    /* Compute the "height" of a tree -- the number of
	     nodes along the longest path from the root node
	     down to the farthest leaf node.*/
	    int height(Node node) 
	    {
	    	if(node==null) return 0;
	    	int lHeight=height(node.left);
	    	int rHeight=height(node.right);
	    	return Math.max(lHeight+1,rHeight+1);
	    }
	  
	    // Driver program to test above functions
	    public static void main(String args[]) 
	    {
	    	LevelOrderRecursiveBT tree = new LevelOrderRecursiveBT();
	  
	        // Let us create trees shown in above diagram
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	          
	        System.out.println("Level Order traversal of binary tree is : ");
	        tree.reverseLevelOrder(tree.root);
	    }
	
}

