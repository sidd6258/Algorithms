package geeksForGeeks.binaryTree;

import java.util.*;

public class GetLevelOfNodeBT {

	  
	    Node root;
	  
	    /* Helper function for getLevel().  It returns level of the data
	    if data is present in tree, otherwise returns 0.*/
	    int getLevel(Node node, int data) 
	    {
	    	int level=0;
	    	if(node==null) return 0;
	    	Queue<Node> q = new LinkedList<Node>();
	    	q.add(node);
	    	while(!q.isEmpty()){
	    		int count = q.size();
	    		level++;
	    		while(count-- > 0){
	    			if(q.peek().key == data){
		    			return level;
		    		}
	    			Node temp=q.remove();
	    			if(temp.left!= null) q.add(temp.left);
	    			if(temp.right!= null) q.add(temp.right);
	    		}
	    	}
	    	return 0;
	    }
	  
	  
	    /* Driver function to test above functions */
	    public static void main(String[] args) 
	    {
	    	GetLevelOfNodeBT tree = new GetLevelOfNodeBT();
	  
	        /* Constructing tree given in the above figure */
	        tree.root = new Node(3);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(5);
	        tree.root.left.left = new Node(1);
	        tree.root.left.right = new Node(4);
	        for (int x = 1; x <= 5; x++) 
	        {
	            int level = tree.getLevel(tree.root, x);
	            if (level != 0)
	                System.out.println("Level of " + x + " is "
	                        + tree.getLevel(tree.root, x));
	            else
	                System.out.println(x + " is not present in tree");
	        }
	    }
	
}
