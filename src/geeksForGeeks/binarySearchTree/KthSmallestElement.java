package geeksForGeeks.binarySearchTree;

public class KthSmallestElement {

	 
	    // Root of BST
	    Node root;
	    static int key1;
	 
	    // Constructor
	    KthSmallestElement() { 
	        root = null;
	        key1=0;
	    }
	 
	    // This method mainly calls insertRec()
	    void insert(int key) {
	       root = insertRec(root, key);
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
	    void printKthSmallest(int key)  {
	    	printKthSmallest(root,key);
	    }
	 
	    // A utility function to do inorder traversal of BST
	    void printKthSmallest(Node root,int key) {
	        if (root != null) {
	        	printKthSmallest(root.left,key);
	        	key1++;
	            if(key==key1){
	            System.out.println(root.key);
	            }
	            
	            printKthSmallest(root.right,key);
	        }
	    }
	 
	    // Driver Program to test above functions
	    public static void main(String[] args) {
	    	KthSmallestElement tree = new KthSmallestElement();
	 
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
	        tree.printKthSmallest(4);
	    
	    }
	
}
