package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAncestorsWithoutRecursion {
	
	Node root;
	  
    /* If target is present in tree, then prints the ancestors
       and returns true, otherwise returns false. */
    void printAncestors(Node node, int target) 
    {
    	if(node==null){
    		return;
    	}
    	Queue<Node> q= new LinkedList<>();
    	Queue<Node> q1= new LinkedList<>();
    	
    	q.add(node);
    	
    	while(!q.isEmpty()){
    		Node temp=q.poll();
    		if(temp.left.key == target || temp.right.key==target){
    			q1.add(temp);
    			target=temp.key;
    			q.clear();
    			q.add(node);
    		}
    		else{
    			if(temp.left!=null) q.add(temp.left);
    			if(temp.right!=null)q.add(temp.right);
    		}
    	}
    	while(!q1.isEmpty()){
    		System.out.print(q1.poll().key+" ");
    	}

    }
	
	public static void main(String args[]) 
    {
    	PrintAncestorsBT tree = new PrintAncestorsBT();
         
        /* Construct the following binary tree
                  1
                /   \
               2     3
              /  \
             4    5
            /
           7
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);
  
        tree.printAncestors(tree.root, 7);
  
    }
}
