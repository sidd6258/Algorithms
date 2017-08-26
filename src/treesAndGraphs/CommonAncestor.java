package treesAndGraphs;

public class CommonAncestor {
	public static void main(String[] args){
	int [] array={1,2,3,4,5,6,7,8,9,10};
	TreeNode root = TreeNode.createMinimalBST(array);
	TreeNode first = root.left.left;
	TreeNode second = root.left.right;
	TreeNode common=findCommonAncestor(first,second,root);
	System.out.println(common.data);
	}
	
	public static TreeNode findCommonAncestor(TreeNode first,TreeNode second,TreeNode root){

		while(first.parent != null){
			if(first.parent == second.parent){
				return first.parent;
			}
			else{
				first=first.parent;
				second=second.parent;
			}
		}
		return root;
	}
}
