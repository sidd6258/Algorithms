package geeksForGeeks.binarySearchTree;

public class IsBST {
	Node root;
	boolean isBST(Node root){
		if(root==null) return true;
		if(root.left!=null){
		if(root.left.key>root.key || isBST(root.left)){
			return false;
		}}
		if(root.right!=null){
		if(root.right.key<root.key || isBST(root.right)){
			return false;
		}}
		return true;
	}
	public static void main(String args[])
    {
		IsBST tree = new IsBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST(tree.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
