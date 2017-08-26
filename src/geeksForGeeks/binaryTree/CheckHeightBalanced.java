package geeksForGeeks.binaryTree;

public class CheckHeightBalanced {
	
	Node root;
	
	int isHeightBalanced(Node node){
		if(node == null){
			return 0;
		}
		int lHeight=0;
		int rHeight=0;
		lHeight = height(node.left);
		rHeight = height(node.right);
		
		System.out.println(lHeight);
		System.out.println(rHeight);
		if(lHeight > rHeight){
			return (lHeight - rHeight);					
		}
		else{
			return (rHeight - lHeight);
		}
	}
	int height(Node node){
		if(node == null){
			return 0;
		}
		int lHeight=0;
		int rHeight=0;
		lHeight = height(node.left)+1;
		rHeight = height(node.right)+1;
		
		if(lHeight > rHeight){
			return lHeight;
		}
		else{
			return rHeight;
		}
				
		
	}
	public static void main(String[] args) 
	{
		CheckHeightBalanced tree = new CheckHeightBalanced();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);
    	if (tree.isHeightBalanced(tree.root) <=1)
        System.out.println("The given tree is height balanced");
    	else
        System.out.println("The given tree is not height balanced");
	}

}
