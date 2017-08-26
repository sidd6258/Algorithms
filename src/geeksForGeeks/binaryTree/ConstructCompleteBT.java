package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructCompleteBT {
	Node root;
	static int index=0;
	Node construct(Node node,int arr[]){
		if(node==null) {
			node=new Node(arr[index]);
			index++;
		}
		Queue<Node> q= new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty()) {
			int count=q.size();
			while(count-->0) {
				if(index<arr.length){
					q.peek().left=new Node(arr[index++]);
					q.add(q.peek().left);
				}
				if(index<arr.length){
					q.peek().right=new Node(arr[index++]);
					q.add(q.peek().right);
				}
				q.poll();
			}
		}
		return node;
		
	}
	
	void printLevelOrder(Node node){
		if(node==null) {
			return;
		}
		Queue<Node> q= new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty()){
			int count=q.size();
			while(count-->0){
				Node temp=q.poll();
				System.out.print(temp.key+" ");
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args){
		ConstructCompleteBT tree = new ConstructCompleteBT();
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
		tree.root=tree.construct(tree.root,arr);
		tree.printLevelOrder(tree.root);
	}
}
