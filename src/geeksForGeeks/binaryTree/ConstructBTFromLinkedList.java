package geeksForGeeks.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBTFromLinkedList {

		Node root;
		static int index=0;
		Node construct(Node node,LinkedList<Node> list){
			if(node==null) {
				node=list.poll();
			}
			Queue<Node> q= new LinkedList<Node>();
			q.add(node);
			while(!q.isEmpty()) {
				int count=q.size();
				while(count-->0) {
					if(!list.isEmpty()){
						q.peek().left=list.poll();
						q.add(q.peek().left);
					}
					if(!list.isEmpty()){
						q.peek().right=list.poll();
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