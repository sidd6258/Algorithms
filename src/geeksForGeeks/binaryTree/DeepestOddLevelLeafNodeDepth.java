package geeksForGeeks.binaryTree;

public class DeepestOddLevelLeafNodeDepth {
	Node root;
	int depthOfOddLeaf(Node node,int level){
		if(node==null) return 0;
		if(node.left==null && node.right==null && level%2!=0){
			return level;
		}
		return Math.max(depthOfOddLeaf(node.left,level+1),depthOfOddLeaf(node.right,level+1));
	}
	
	int depthOfOddLeaf(Node node){
		int level=1;
		return depthOfOddLeaf(node,level);
		
	}
	
	public static void main(String args[]) 
    {
        int k = 45;
        DeepestOddLevelLeafNodeDepth tree = new DeepestOddLevelLeafNodeDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.right = new Node(7);
        tree.root.right.right.right = new Node(8);
        tree.root.right.left.right.left = new Node(9);
        tree.root.right.right.right.right = new Node(10);
        tree.root.right.right.right.right.left = new Node(11);
        System.out.println(tree.depthOfOddLeaf(tree.root) + 
                                                   " is the required depth");
    }
}
