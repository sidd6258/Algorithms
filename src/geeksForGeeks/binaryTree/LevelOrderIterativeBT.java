package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderIterativeBT {
	Node root;
	
	void printLevelOrder(Node node) 
    {
    	if(node==null) return;
    	Queue<Node> q = new LinkedList<Node>();
    	q.add(node);
    	while(!q.isEmpty()){
    		int count = q.size();

    		while(count-- > 0){
    			Node temp=q.poll();
    			System.out.print(temp.key+" ");
    			if(temp.left!= null) q.add(temp.left);
    			if(temp.right!= null) q.add(temp.right);
    		}
    		System.out.println();
    	}
    }
	
	public static void main(String[] args) 
    {
		LevelOrderIterativeBT tree = new LevelOrderIterativeBT();
  
        /* Constructing tree given in the above figure */
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
        tree.printLevelOrder(tree.root);
    }
}
