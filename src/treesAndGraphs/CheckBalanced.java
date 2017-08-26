package treesAndGraphs;

public class CheckBalanced {
	public static void main(String[] args) {
		int [] array={1,2,3,4,5,6,7,8,9,10};
		TreeNode root = CreateTreeFromArray.createTreeFromArray(array);
		int leftHeight=height(root.left)+1;
		int rightHeight =height(root.right)+1;
		if(((leftHeight - rightHeight) > 1) || ((leftHeight - rightHeight) < -1)) System.out.println("false");
		else System.out.println("true");
	}
	
	static int height(TreeNode root){
		int leftHeight=0;
		int rightHeight=0;
		if(root.left != null){
			leftHeight=height(root.left);
		}
		else leftHeight=0;
		if(root.right != null){
			rightHeight=height(root.right);
		}
		else rightHeight=0;
	
		return 1+Math.max(rightHeight,leftHeight);
	}
}
