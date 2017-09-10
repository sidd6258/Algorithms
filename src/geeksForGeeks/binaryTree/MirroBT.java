package geeksForGeeks.binaryTree;

public class MirroBT {

	    Node root;
	 
	    void mirror()
	    {
	        root = mirror(root);
	    }
	 
	    Node mirror(Node node)
	    {
	    	if(node == null){
	    		return null;
	    	}
	    	mirror(node.left);
	    	mirror(node.right);
	    	Node temp = node.right;
	    	node.right = node.left;
	    	node.left = temp;
	    	return node;
	    }
	 
	    void inOrder()
	    {
	        inOrder(root);
	    }
	 
	    /* Helper function to test mirror(). Given a binary
	       search tree, print out its data elements in
	       increasing sorted order.*/
	    void inOrder(Node node)
	    {
	        if (node == null)
	            return;
	 
	        inOrder(node.left);
	        System.out.print(node.key + " ");
	 
	        inOrder(node.right);
	    }
	 
	    /* testing for example nodes */
	    public static void main(String args[])
	    {
	        /* creating a binary tree and entering the nodes */
	    	MirroBT tree = new MirroBT();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	 
	        /* print inorder traversal of the input tree */
	        System.out.println("Inorder traversal of input tree is :");
	        tree.inOrder();
	        System.out.println("");
	 
	        /* convert tree to its mirror */
	        tree.mirror();
	 
	        /* print inorder traversal of the minor tree */
	        System.out.println("Inorder traversal of binary tree is : ");
	        tree.inOrder();
	 
	    }
	
}
