package geeksForGeeks.binaryTree;

public class CountLeaf {
	Node root;
	static int counter_new=0;
	int countLeafNode(Node node,int counter){
		if(node.left == null || node.right == null){
			counter++;
			return counter;
		}
		counter = countLeafNode(node.left,counter) + countLeafNode(node.right,counter);
		return counter;
	}
	
	void countLeafNode_new(Node node){
		if(node.left == null || node.right == null){
			counter_new++;
		}
		else{
			countLeafNode_new(node.left);
			countLeafNode_new(node.right);
		}
	}
    /* Driver program to test all above functions */
    public static void main(String[] args) 
    {
    	CountLeaf tree = new CountLeaf();
  
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        /* Print all root-to-leaf paths of the input tree */
        System.out.println("Total Leaf are "+tree.countLeafNode(tree.root,0));
        tree.countLeafNode_new(tree.root);
        System.out.println("Total Leaf are "+ counter_new);
  
    }

}
