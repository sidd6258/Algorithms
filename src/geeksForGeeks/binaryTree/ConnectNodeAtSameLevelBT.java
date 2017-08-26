package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodeAtSameLevelBT {
	class Node 
	{
	    int data;
	    Node left, right, nextRight;
	  
	    Node(int item) 
	    {
	        data = item;
	        left = right = nextRight = null;
	    }
	}

	Node root;
	
	public void connect(Node node){
	
	if(node==null) return;
	Queue<Node> q = new LinkedList<Node>();
	q.add(node);
	while(!q.isEmpty()){
		int count = q.size();

		while(count-- > 0){
			Node temp=q.remove();
			if(temp.left!= null && temp.right != null){
				temp.left.nextRight = temp.right;
			}
			if(temp.left!= null) q.add(temp.left);
			if(temp.right!= null) q.add(temp.right);
		}
	}
	}
	  public static void main(String args[]) 
	    {
		  ConnectNodeAtSameLevelBT tree = new ConnectNodeAtSameLevelBT();
	         
	        /* Constructed binary tree is
	             10
	            /  \
	          8     2
	         /
	        3
	        */
	        tree.root = tree.new Node(10); 
	        tree.root.left = tree.new Node(8);
	        tree.root.right = tree.new Node(2);
	        tree.root.left.left = tree.new Node(3);
	  
	        // Populates nextRight pointer in all nodes
	        tree.connect(tree.root);
	        
	        int a = tree.root.nextRight != null ? tree.root.nextRight.data : -1;
	        System.out.println("nextRight of " + tree.root.data + " is "
	                + a);
	        int b = tree.root.left.nextRight != null ? 
	                                    tree.root.left.nextRight.data : -1;
	        System.out.println("nextRight of " + tree.root.left.data + " is "
	                + b);
	        int c = tree.root.right.nextRight != null ? 
	                                   tree.root.right.nextRight.data : -1;
	        System.out.println("nextRight of " + tree.root.right.data + " is "
	                + c);
	        int d = tree.root.left.left.nextRight != null ? 
	                              tree.root.left.left.nextRight.data : -1;
	        System.out.println("nextRight of " + tree.root.left.left.data + " is "
	                + d);
	    }
}

