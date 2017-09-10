package geeksForGeeks.binaryTree;

public class IsSubTree {

	    Node root1,root2;
	  
	    /* A utility function to check whether trees with roots as root1 and
	       root2 are identical or not */
	    boolean areIdentical(Node root1, Node root2) 
	    {
	    	if(root1 == null && root2 == null) return true;
	    	if(root1.key == root2.key && areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right)) return true;	    	
	    	return false;
	    }
	  
	    /* This function returns true if S is a subtree of T, otherwise false */
	    boolean isSubtree(Node T, Node S) 
	    {
	    	if(T == null) return true;
	    	if(S == null) return false;
	    	
	    	if(areIdentical(T,S)){
	    		return true;
	    	}
	    	return (isSubtree(T.left, S) || isSubtree(T.right, S));
	    }
	  
	    public static void main(String args[]) 
	    {
	    	IsSubTree tree = new IsSubTree();
	          
	        // TREE 1
	        /* Construct the following tree
	              26
	             /   \
	            10     3
	           /    \     \
	          4      6      3
	           \
	            30  */
	           
	        tree.root1 = new Node(26);
	        tree.root1.right = new Node(3);
	        tree.root1.right.right = new Node(3);
	        tree.root1.left = new Node(10);
	        tree.root1.left.left = new Node(4);
	        tree.root1.left.left.right = new Node(30);
	        tree.root1.left.right = new Node(6);
	  
	        // TREE 2
	        /* Construct the following tree
	           10
	         /    \
	         4      6
	          \
	          30  */
	           
	        tree.root2 = new Node(10);
	        tree.root2.right = new Node(6);
	        tree.root2.left = new Node(4);
	        tree.root2.left.right = new Node(30);
	  
	        if (tree.isSubtree(tree.root1, tree.root2))
	            System.out.println("Tree 2 is subtree of Tree 1 ");
	        else
	            System.out.println("Tree 2 is not a subtree of Tree 1");
	    }
	
}
