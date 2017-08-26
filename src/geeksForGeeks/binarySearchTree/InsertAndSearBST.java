package geeksForGeeks.binarySearchTree;

public class InsertAndSearBST {

	 
	    // Root of BST
	    Node root;
	 
	    // Constructor
	    InsertAndSearBST() { 
	        root = null; 
	    }
	 
	    // This method mainly calls insertRec()
	    void insert(int key) {
	       root = insertRec(root, key);
	    }
	    
	    Node search(Node root,int key){
	    	if(root==null || root.key==key) return root;
	    	
	    	if(key < root.key){
	    		return search(root.left,key);
	    	}else{
	    		return search(root.right,key);
	    	}
	    }
	    /* A recursive function to insert a new key in BST */
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
	 
	    // This method mainly calls InorderRec()
	    void inorder()  {
	       inorderRec(root);
	    }
	 
	    // A utility function to do inorder traversal of BST
	    void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.println(root.key);
	            inorderRec(root.right);
	        }
	    }
	 
	    // Driver Program to test above functions
	    public static void main(String[] args) {
	    	InsertAndSearBST tree = new InsertAndSearBST();
	 
	        /* Let us create following BST
	              50
	           /     \
	          30      70
	         /  \    /  \
	       20   40  60   80 */
	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	 
	        // print inorder traversal of the BST
	        tree.inorder();
	        
	        System.out.println(tree.search(tree.root, 20).key);
	    }
	
}
