package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewBT {
Node root;
	
	void printLeftView(Node node) 
    {
    	if(node==null) return;
    	Queue<Node> q = new LinkedList<Node>();
    	q.add(node);
    	while(!q.isEmpty()){
    		int count = q.size();
    		System.out.print(q.peek().key);
    		while(count-- > 0){
    			Node temp=q.poll();
    			
    			if(temp.left!= null) q.add(temp.left);
    			if(temp.right!= null) q.add(temp.right);
    		}
    		System.out.println();
    	}
    }
	
	public static void main(String[] args) 
    {
		PrintLeftViewBT tree = new PrintLeftViewBT();
  
        /* Constructing tree given in the above figure */
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
        tree.printLeftView(tree.root);
    }
}
