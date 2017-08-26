package geeksForGeeks.binaryTree;

public class BinaryTreeDelete {

	    Node root;
	  
	    /*  This function traverses tree in post order to 
	        to delete each and every node of the tree */
	    void deleteTree(Node node) 
	    {
	    	if(node == null) return;
	    	
	    	deleteTree(node.left);
	    	deleteTree(node.right);
	    	
	    	System.out.println("Deleted node is "+ node.key);
	    	node = null;
	    }
	  
	    /* Driver program to test above functions */
	    public static void main(String[] args) 
	    {
	    	BinaryTreeDelete tree = new BinaryTreeDelete();
	  
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	  
	        /* Print all root-to-leaf paths of the input tree */
	        tree.deleteTree(tree.root);
	        tree.root = null;
	        System.out.println("Tree deleted");
	  
	    }
}
