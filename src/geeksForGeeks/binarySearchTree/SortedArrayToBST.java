package geeksForGeeks.binarySearchTree;

public class SortedArrayToBST {
	     
	    static Node root;
	 
	    /* A function that constructs Balanced Binary Search Tree 
	     from a sorted array */
	    Node sortedArrayToBST(int arr[], int start, int end) {
	    	if(start>end) return null;
	    	
	    	int mid=(start+end)/2;
	    	Node node=new Node(arr[mid]);
	    	node.left=sortedArrayToBST(arr,start,mid-1);
	    	node.right=sortedArrayToBST(arr,mid+1,end);
	    	return node;
	    }
	 
	    /* A utility function to print preorder traversal of BST */
	    void preOrder(Node node) {
	        if (node == null) {
	            return;
	        }
	        System.out.print(node.key + " ");
	        preOrder(node.left);
	        preOrder(node.right);
	    }
	     
	    public static void main(String[] args) {
	    	SortedArrayToBST tree = new SortedArrayToBST();
	        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
	        int n = arr.length;
	        root = tree.sortedArrayToBST(arr, 0, n - 1);
	        System.out.println("Preorder traversal of constructed BST");
	        tree.preOrder(root);
	    }
	
}
