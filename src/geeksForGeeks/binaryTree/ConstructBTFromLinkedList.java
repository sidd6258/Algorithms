package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBTFromLinkedList {

		Node root;
		
		Node construct(Node node,LinkedList<Node> list){
			if(node==null){
				node=list.poll();
			}
			Queue<Node> q=new LinkedList<Node>();
			q.add(node);
			while(!q.isEmpty()){
				int count=q.size();
				while(count-->0){
					Node temp=q.poll();
					if(!list.isEmpty()){
						temp.left=list.poll();
						q.add(temp.left);
					}
					if(!list.isEmpty()){
						temp.right=list.poll();
						q.add(temp.right);
					}
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
			ConstructBTFromLinkedList tree = new ConstructBTFromLinkedList();
			LinkedList<Node> list=new LinkedList<Node>();
			list.add(new Node(10));
			list.add(new Node(12));
			list.add(new Node(15));
			list.add(new Node(25));
			list.add(new Node(30));
			list.add(new Node(36));			
			tree.root=tree.construct(tree.root,list);
			tree.printLevelOrder(tree.root);
		}
	

}
