package geeksForGeeks.binaryTree;

public class CheckIfAllLeafAtSameLevelBT {
	
	Node root;
	static int firstLeafLevel=0;
	
	boolean check(Node node,int level,int firstLeafLevel){
		if(node==null) return true;
		if(node.left==null && node.right==null){
			if(firstLeafLevel==0){
				firstLeafLevel=level;
				return true;
			}
			return (firstLeafLevel==level);			
		}
		return check(node.left,level+1,firstLeafLevel) && check(node.right,level+1,firstLeafLevel);
		
	}
	boolean check(Node node){
		int level=0;
		return check(node,level,firstLeafLevel);
	}
	
	public static void main(String args[]) 
    {
        // Let us create the tree as shown in the example
		CheckIfAllLeafAtSameLevelBT tree = new CheckIfAllLeafAtSameLevelBT();
        tree.root = new Node(12);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(9);
        tree.root.left.left.left = new Node(1);
        tree.root.left.right.left = new Node(1);
        if (tree.check(tree.root))
            System.out.println("Leaves are at same level");
        else
            System.out.println("Leaves are not at same level");
    }
}
