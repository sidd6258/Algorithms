package geeksForGeeks.binarySearchTree;

public class KthLargestElementBST {

		 
	    // Root of BST
	    Node root;
	    static int c=0;
	    // Constructor
	    void InsertAndSearBST() { 
	        root = null; 
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
	    void kthLargestElement(int k)  {
	    	kthLargestElementRec(root,k);
	    }
	 
	    // A utility function to do inorder traversal of BST
	    void kthLargestElementRec(Node root,int k) {
	    	
	    	if (root == null || c >= k)
	            return;
	    		kthLargestElementRec(root.right,k);
	            c++;
	            if(c==k){
	            	System.out.println(root.key);
	            }
	            kthLargestElementRec(root.left,k);
	    }
	 
	    // Driver Program to test above functions
	    public static void main(String[] args) {
	    	KthLargestElementBST tree = new KthLargestElementBST();
	 
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
	        tree.kthLargestElement(2);
	        
	    }

}
