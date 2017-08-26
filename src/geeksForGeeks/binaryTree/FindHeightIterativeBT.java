package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class FindHeightIterativeBT {

		Node root;
		
		int findHeight(Node node){
			if(node==null) {
				return 0;
			}
			Queue<Node> q= new LinkedList<Node>();
			q.add(node);
			int height=0;
			while(!q.isEmpty()) {
				int count=q.size();
				height++;
				while(count-->0) {
					
					if(q.peek().left!=null){
						q.add(q.peek().left);
					}
					if(q.peek().right!=null){
						q.add(q.peek().right);
					}
					q.poll();
				}
			}
			return height;
			
		}

		
		public static void main(String [] args){
			FindHeightIterativeBT tree = new FindHeightIterativeBT();
		
			tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
			int height=tree.findHeight(tree.root);
			System.err.println("Height of tree is " + height);
		}
	



}
