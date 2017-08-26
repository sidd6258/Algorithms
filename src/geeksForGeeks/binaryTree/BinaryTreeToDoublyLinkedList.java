package geeksForGeeks.binaryTree;

public class BinaryTreeToDoublyLinkedList {
	
	Node root;	
	
	public Node bintree2listUtil(Node node){
		if(node == null){
			return node;
		}
		
		if(node.left != null){
			
			Node left = bintree2listUtil(node.left);
			
			while(left.right !=null){
				left = left.right;
			}
			
			node.left=left;
			left.right=node;
			
		}
		if(node.right !=null){
			Node right = bintree2listUtil(node.right);
			while(right.left !=null){
				right = right.left;
			}
			
			node.right = right;
			right.left = node;
			
		}
		
		return node;
	}
	public Node bintree2list(Node node){
		if(node == null){
			return node;
		}
		node = bintree2listUtil(node);
		while(node.left!=null){
			node = node.left;
		}
		return node;
	}
	
	void printList(Node head){
		while(head != null){
			System.out.println(head.key+" ");
			head = head.right;
		}
	}

	public static void main(String[] args) {
		BinaryTreeToDoublyLinkedList tree = new BinaryTreeToDoublyLinkedList();
		  
        // Let us create the tree shown in above diagram
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
  
        // Convert to DLL
        Node head = tree.bintree2list(tree.root);
  
        // Print the converted list
        tree.printList(head);

	}

}
