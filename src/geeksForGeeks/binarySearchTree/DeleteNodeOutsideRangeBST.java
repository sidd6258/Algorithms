package geeksForGeeks.binarySearchTree;

public class DeleteNodeOutsideRangeBST {

	     
	    static Node root;
	     
	    /* The functions prints all the keys which in the given range [k1..k2].
	     The function assumes than k1 < k2 */
	    Node DeleteOutside(Node node, int k1, int k2) {
	         if(node==null) return null;	         
	         node.left=DeleteOutside(node.left,  k1,  k2);
	         node.right=DeleteOutside(node.right,  k1,  k2);
	         
	         if(node.key<k1){
	        	 Node rChild=node.right;
	        	 node=null;
	        	 return rChild;
	         }
	         if(node.key>k2){
	        	 Node lChild=node.left;
	        	 node=null;
	        	 return lChild;
	         }
	         return node;
	         
	    }
	    
	    void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.println(root.key);
	            inorderRec(root.right);
	        }
	    }
	 
	    public static void main(String[] args) {
	    	DeleteNodeOutsideRangeBST tree = new DeleteNodeOutsideRangeBST();
	        int k1 = 10, k2 = 25;
	        tree.root = new Node(20);
	        tree.root.left = new Node(8);
	        tree.root.right = new Node(22);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(12);
	 
	        tree.root=tree.DeleteOutside(root, k1, k2);
	        tree.inorderRec(tree.root);
	    }
	
}
