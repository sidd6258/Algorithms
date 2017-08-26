package geeksForGeeks.binaryTree;

public class ChildrenSumBT {
	Node root;
	
	int getKeyValue(Node node){
		if(node == null) return 0;
		else{
			return node.key;
		}
	}
	
	int isSumProperty(Node node){
		if(node == null || (node.left == null && node.right == null)) return 1;
		if((getKeyValue(node) == getKeyValue(node.left) + getKeyValue(node.right)) && (isSumProperty(node.left) != 0) && (isSumProperty(node.right) != 0)){
			return 1;
		}
		else return 0;
		
	}
	
    public static void main(String[] args) 
    {
    	ChildrenSumBT tree = new ChildrenSumBT();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(2);
        if (tree.isSumProperty(tree.root) != 0)
            System.out.println("The given tree satisfies children"
                    + " sum property");
        else
            System.out.println("The given tree does not satisfy children"
                    + " sum property");
    }
}
