package geeksForGeeks.binarySearchTree;

public class IsBST {
	Node root;
   boolean isBST(Node node, int min, int max)
   {
       if (node == null) return true;
       if (node.key < min || node.key > max) return false;
       return (isBST(node.left, min, node.key-1) && isBST(node.right, node.key+1, max));
   }
   
	public static void main(String args[])
    {
		IsBST tree = new IsBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
