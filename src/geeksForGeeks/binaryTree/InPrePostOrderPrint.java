package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class InPrePostOrderPrint {

	    // Root of Binary Tree
	    Node root;
	 

	 
	    /* Given a binary tree, print its nodes according to the
	      "bottom-up" postorder traversal. */
	    void printPostorder(Node node)
	    {
	    	if(node == null){
	    		return;
	    	}
	    	printPostorder(node.left);
	    	printPostorder(node.right);
	    	System.out.print(node.key+" ");
	    }
	 
	    /* Given a binary tree, print its nodes in inorder*/
	    void printInorder(Node node)
	    {
	    	if(node == null){
	    		return;
	    	}
	    	printInorder(node.left);
	    	System.out.print(node.key+" ");
	    	printInorder(node.right);
	    }
	 
	    /* Given a binary tree, print its nodes in preorder*/
	    void printPreorder(Node node)
	    {
	    	if(node == null){
	    		return;
	    	}
	    	System.out.print(node.key+" ");
	    	printPreorder(node.left);
	    	printPreorder(node.right);
	    }
	    
	    void printLevelOrder() 
	    {
	        Queue<Node> queue = new LinkedList<Node>();
	        queue.add(root);
	        while (!queue.isEmpty()) 
	        {
	 
	            /* poll() removes the present head.
	            For more information on poll() visit 
	            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
	            Node tempNode = queue.poll();
	            System.out.print(tempNode.key + " ");
	 
	            /*Enqueue left child */
	            if (tempNode.left != null) {
	                queue.add(tempNode.left);
	            }
	 
	            /*Enqueue right child */
	            if (tempNode.right != null) {
	                queue.add(tempNode.right);
	            }
	        }
	    }
	
	 
	    // Driver method
	    public static void main(String[] args)
	    {
	    	InPrePostOrderPrint tree = new InPrePostOrderPrint();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.left.left.left = new Node(6);
	        tree.root.left.left.right = new Node(7);
	        tree.root.left.left.left.left = new Node(8);
	        tree.root.left.left.left.right = new Node(9);
	        tree.root.right.left = new Node(10);
	        tree.root.right.left.left = new Node(12);
	        tree.root.right.left.right = new Node(13);
	        tree.root.right.right = new Node(11);
	        tree.root.right.right.left = new Node(14);
	        tree.root.right.right.right = new Node(15);
	   	 
	 
	        System.out.println("Preorder traversal of binary tree is ");
	        tree.printPreorder(tree.root);
	 
	        System.out.println("\nInorder traversal of binary tree is ");
	        tree.printInorder(tree.root);
	 
	        System.out.println("\nPostorder traversal of binary tree is ");
	        tree.printPostorder(tree.root);
	        
	        
	        System.out.println("\nLevelorder traversal using queue of binary tree is ");
	        tree.printLevelOrder();
	    }
	}

