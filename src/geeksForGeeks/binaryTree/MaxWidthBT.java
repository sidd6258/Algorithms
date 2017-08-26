package geeksForGeeks.binaryTree;

import java.util.*;

public class MaxWidthBT {

		Node root;

	 
	    // Function to find the maximum width of 
	    // the tree using level order traversal
	    static int maxwidth(Node root) 
	    {
	    	if(root == null){
	    		return 0;
	    	}
	    	Queue<Node> q= new LinkedList<Node>();
	    	q.add(root);
	    	int maxWidth = 0;
	    	while(!q.isEmpty()){
	    		int count=q.size();
	    		maxWidth = Math.max(maxWidth, count);
	    		while(count-- > 0){
	    			Node temp=q.remove();
	    			System.out.print(temp.key+" ");
	    			if(temp.left != null){
	    				q.add(temp.left);
	    			}
	    			if(temp.right != null){
	    				q.add(temp.right);
	    			}
	    		}
	    		System.out.println();
	    	}
	    	return maxWidth;
	    }
	 
	    public static void main(String[] args) 
	    {
	    	MaxWidthBT tree = new MaxWidthBT();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.right = new Node(8);
	        tree.root.right.right.left = new Node(6);
	        tree.root.right.right.right = new Node(7);
	 
	                /*   Constructed Binary tree is:
	                1
	              /   \
	            2      3
	          /  \      \
	         4    5      8
	                   /   \
	                  6     7    */
	                   
	        System.out.println("Maximum width = " + maxwidth(tree.root));
	    }
	
}
