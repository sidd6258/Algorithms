package geeksForGeeks.binarySearchTree;

public class GreaterValuesAddedToNodeBST {
	
	Node root;
	static int sum=0;
	
	void insert(int key) {
	       root = insertRec(root, key);
	    }
	
	 Node insertRec(Node root, int key) {
	    	if(root==null){
	    		root = new Node(key);
	    		return root;
	    	}
	    	if(key<root.key){
	    		 root.left=insertRec(root.left, key);
	    	}
	    	else{
	    		 root.right=insertRec(root.right, key);
	    	}
	    	return root;
	    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    
    void modifyBST(Node node){
    	if(node==null) return;
    	modifyBST(node.right);
    	sum=sum+node.key;
    	node.key=sum;
    	modifyBST(node.left);    	
    }
    
    public static void main(String[] args) {
        /* Let us construct the following Tree
                50
             /      \
            10        60
           /  \       /  \
          5   20    55    70
         /     /  \
        45   65    80
         */
 
    	GreaterValuesAddedToNodeBST tree = new GreaterValuesAddedToNodeBST();
    	
    	 	tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	        tree.modifyBST(tree.root);
	        // print inorder traversal of the BST
	        tree.inorderRec(tree.root);
 
        
    }
}
