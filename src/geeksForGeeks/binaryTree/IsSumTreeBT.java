package geeksForGeeks.binaryTree;

public class IsSumTreeBT {

	    Node root;
	  
	    /* A utility function to get the sum of values in tree with root
	     as root */
	    int sum(Node node) 
	    {
	    	if(node==null)return 0;
	    	return sum(node.left)+node.key+sum(node.right);
	    }
	  
	    /* returns 1 if sum property holds for the given
	       node and both of its children */
	    int isSumTree(Node node) 
	    {
	    	int ls=0,rs=0;
	    	if(node==null || node.left==null||node.right==null) return 1;
	    	ls= sum(node.left);
	    	rs = sum(node.right);
	    	
	    	if((node.key == ls+rs) && isSumTree(node.left)!=0 && isSumTree(node.right)!=0) return 1;
	    	return 0;
	    }
	  
	    /* Driver program to test above functions */
	    public static void main(String args[]) 
	    {
	    	IsSumTreeBT tree = new IsSumTreeBT();
	        tree.root = new Node(26);
	        tree.root.left = new Node(10);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(6);
	        tree.root.right.right = new Node(3);
	  
	        if (tree.isSumTree(tree.root) != 0)
	            System.out.println("The given tree is a sum tree");
	        else
	            System.out.println("The given tree is not a sum tree");
	    }
	
}