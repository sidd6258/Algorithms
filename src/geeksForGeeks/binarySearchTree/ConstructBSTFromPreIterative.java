package geeksForGeeks.binarySearchTree;

import java.util.Stack;

public class ConstructBSTFromPreIterative {
		 
	    // The main function that constructs BST from pre[]
	    Node constructTree(int pre[], int size) {
	 
	    	Node root=new Node(pre[0]);
	    	Stack<Node> stack=new Stack<>();
	    	stack.push(root);
	    	for(int i=1;i<size;++i){
	    		Node temp=null;
	    		
	    		while(!stack.isEmpty() && pre[i]>stack.peek().key){
	    			temp=stack.pop();
	    		}
	    		if(temp!=null){
	    			temp.right=new Node(pre[i]);
	    			stack.push(temp.right);
	    		}
	    		else{
	    			temp=stack.peek();
	    			temp.left=new Node(pre[i]);
	    			stack.push(temp.left);
	    		}
	    	}
	    	return root;
	    }
	 
	    // A utility function to print inorder traversal of a Binary Tree
	    void printInorder(Node node) {
	        if (node == null) {
	            return;
	        }
	        printInorder(node.left);
	        System.out.print(node.key + " ");
	        printInorder(node.right);
	    }
	 
	    // Driver program to test above functions
	    public static void main(String[] args) {
	    	ConstructBSTFromPreIterative tree = new ConstructBSTFromPreIterative();
	        int pre[] = new int[]{10, 5, 1, 7, 40, 50};
	        int size = pre.length;
	        Node root = tree.constructTree(pre, size);
	        System.out.println("Inorder traversal of the constructed tree is ");
	        tree.printInorder(root);
	    }
	
}
