package geeksForGeeks.binaryTree;

public class MaxRootToLeafSumBT {
	Node root;
	static int maxSum=0;
	int maxpathSum(Node node,int sum){
		
		if(node == null) return 0;
		else{
			
			sum = sum + node.key;
			
			if((node.left == null) && (node.right == null)){
				if(sum>maxSum){
					maxSum=sum;
				}
			}
			else{
				if(node.left != null){
					maxpathSum(node.left,sum);
				}
				if(node.right != null){
					maxpathSum(node.right,sum);
				}
			}
			return maxSum;
		}
						
	}
	
	public static void main(String args[]) 
    {
        
         
        /* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
        MaxRootToLeafSumBT tree = new MaxRootToLeafSumBT();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
    
        System.out.println("Max Root to leaf path sum is " + tree.maxpathSum(tree.root,0));

    }
}
