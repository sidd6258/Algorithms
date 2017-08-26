package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class IsCompleteBT {
Node root;

boolean isComplete(Node node){
	boolean flag=false;
	if(node == null){
		return true;
	}	
	Queue<Node> q= new LinkedList<Node>();
	q.add(node);
	
	while(!q.isEmpty()){
		Node temp = q.remove();
		
		if(temp.left != null){
			if(flag == true) return false;
			q.add(temp.left);
			}
		else{
			flag = true;
		}
		if(temp.right != null){
			if(flag==true) return false;
			q.add(temp.right);
		}
		else{
				flag = true;
		}
			
	}
	return flag;	
}

public static void main(String [] args){
	IsCompleteBT tree = new IsCompleteBT();
	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node (3);
	tree.root.left.left = new Node(4);
	tree.root.left.right= new Node(5);
	tree.root.right.right = new Node(6);
	
	if(tree.isComplete(tree.root)){
		System.out.println("Complete Binary Tree");
	}
	else{
		System.out.println("Not Complete Binary Tree");
	}
}
}
