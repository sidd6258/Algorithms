package treesAndGraphs;

public class Successor {
	
	public static TreeNode inorderSucc(TreeNode n) { 
		if(n == null) return null;
		if(n.parent == null || n.right != null)
			return leftMostChild(n.right);
		else{
			TreeNode q=n;
			TreeNode x=q.parent;
			while(x != null && x.left != q){
				q=x;
				x=q.parent;
			}
			return x;
		}
	} 
		
	public static TreeNode leftMostChild(TreeNode n) {
		if(n==null) return null;
		while(n.left != null){
			n =n.left;
		}
		return n;
	}
	
	public static void main(String[] args) {
		int[] array = {4,10,12,15,18,22,24,25,31,35,44,50,66,70,90};
		TreeNode root = TreeNode.createMinimalBST(array);
		
			TreeNode node = root.find(array[2]);
			TreeNode next = inorderSucc(node);
			if (next != null) {
				System.out.println(node.data + "->" + next.data);
			} else {
				System.out.println(node.data + "->" + null);
			}
	}
	}
