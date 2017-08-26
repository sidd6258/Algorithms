package geeksForGeeks.binaryTree;

public class RootToPathSumEqualsNum {
	Node root;
	
	boolean haspathSum(Node node,int sum){
		
		if(node == null) return (sum == 0);
		else{
			boolean ans = false;
			int subsum = sum - node.key;
			
			if((subsum == 0) && (node.left == null) && (node.right == null)) return true;
			else{
				if(node.left != null){
					ans = ans || haspathSum(node.left,subsum);
				}
				if(node.right != null){
					ans = ans || haspathSum(node.right,subsum);
				}
			}
			return ans;
		}
						
	}
	
	public static void main(String args[]) 
    {
        int sum = 21;
         
        /* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
        RootToPathSumEqualsNum tree = new RootToPathSumEqualsNum();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
  
        if (tree.haspathSum(tree.root, sum))
            System.out.println("There is a root to leaf path with sum " + sum);
        else
            System.out.println("There is no root to leaf path with sum " + sum);
    }
}
