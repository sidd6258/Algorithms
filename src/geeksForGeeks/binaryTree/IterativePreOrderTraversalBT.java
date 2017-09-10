package geeksForGeeks.binaryTree;

import java.util.Stack;

public class IterativePreOrderTraversalBT {
		 
	    Node root;
	     
	    void iterativePreorder()
	    {
	        iterativePreorder(root);
	    }
	 
	    // An iterative process to print preorder traversal of Binary tree
	    void iterativePreorder(Node node) {
	         if(node == null) return;
	         Stack<Node> stack = new Stack<Node>();	         
	         stack.push(node);
	         
	         while(!stack.isEmpty()){
	        	 Node temp= stack.pop();
	        	 System.out.print(temp.key+" ");
	        	 if(temp.right!=null){
	        		 stack.push(temp.right);
	        	 }
	        	 if(temp.left!=null){
	        		 stack.push(temp.left);
	        	 }
	        	 
	         }
	    }
	    
	 
	    // driver program to test above functions
	    public static void main(String args[]) {
	    	IterativePreOrderTraversalBT tree = new IterativePreOrderTraversalBT();
	        tree.root = new Node(10);
	        tree.root.left = new Node(8);
	        tree.root.right = new Node(2);
	        tree.root.left.left = new Node(3);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(3);
	        tree.iterativePreorder();
	 
	    }
	
}
