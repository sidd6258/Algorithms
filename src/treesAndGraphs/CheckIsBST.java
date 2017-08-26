package treesAndGraphs;

public class CheckIsBST {

	public static void main(String[] args) {
		int [] array={1,2,3,4,5,6,7,8,9,10};
		TreeNode root = CreateTreeFromArray.createTreeFromArray(array);
		TreeNode root1 = TreeNode.createMinimalBST(array);
		System.out.println("first one is "+isBST(root));
		System.out.println("second one is "+isBST(root1));
	}
	static boolean isBST(TreeNode root){
		int d=root.data;
		if(root.left !=null){
		if(d < root.left.data || !isBST(root.left)) return false;}
		if(root.right != null){
		if(d > root.right.data || !isBST(root.right)) return false;}
		return true;
	}

}
