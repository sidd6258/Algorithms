package geeksForGeeks.binaryTree;

import java.util.*;

public class BinaryTree {
	private Node root;
	
	public BinaryTree(int key) {
		root=new Node(key);
	}
	public BinaryTree() {
		root=null;
	}
	public static void main(String[] args){
		BinaryTree bt=new BinaryTree(1);
		
		bt.root.left = new Node(2);
		bt.root.left.left = new Node(4);
		bt.root.right = new Node(3);
		
		System.out.println(bt.root.key);
	}

}
