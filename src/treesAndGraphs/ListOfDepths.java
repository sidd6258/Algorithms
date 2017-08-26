package treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// We needed this code for other files, so check out the code in the library
		TreeNode root = TreeNode.createMinimalBST(array);
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if(root!=null){
			current.add(root);
		}
		
		while(current.size()>0){
			result.add(current);
			LinkedList<TreeNode> parents = current; 
			current = new LinkedList<TreeNode>();
			for(TreeNode parent : parents){
				if(parent.left != null)	current.add(parent.left);
				if(parent.right != null) current.add(parent.right);
			}
		}
		int depth = 0;
		for(LinkedList<TreeNode> entry : result) {
			System.out.print("Link list at depth " + depth + ":");
			for(TreeNode node : entry){				
				System.out.print(" " + node.data);
			}
			System.out.println();
			depth++;
		}
	}

}
