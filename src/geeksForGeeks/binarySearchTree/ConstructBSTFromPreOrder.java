package geeksForGeeks.binarySearchTree;

public class ConstructBSTFromPreOrder {
		 
	     static int preIndex;
	    // A recursive function to construct Full from pre[]. preIndex is used
	    // to keep track of index in pre[].
	    Node constructTreeUtil(int pre[],int start, int end, int size) {
	         
	        // Base case
	        if (preIndex >= size || start > end) {
	            return null;
	        }
	        
	        Node root=new Node(pre[preIndex]);
	        preIndex++;
	        if(start==end){
	        	return root;
	        }
	        
	        int i;
	        for(i=start;i<=end;++i){
	        	if(pre[i]>root.key) break;
	        }
	        
	        root.left=constructTreeUtil(pre,preIndex,i-1,size);
	        root.right=constructTreeUtil(pre,i,end,size);
	 
	        return root;
	    }
	 
	    // The main function to construct BST from given preorder traversal.
	    // This function mainly uses constructTreeUtil()
	    Node constructTree(int pre[], int size) {
	        return constructTreeUtil(pre, 0, size - 1, size);
	    }
	 
	    // A utility function to print inorder traversal of a Binary Tree
	    void printInorder(Node node) {
	        if (node == null) {
	            return;
	        }
	        printInorder(node.left);
	        System.out.print(node.key + " ");
	        printInorder(node.right);
	    }
	 
	    // Driver program to test above functions
	    public static void main(String[] args) {
	    	ConstructBSTFromPreOrder tree = new ConstructBSTFromPreOrder();
	        int pre[] = new int[]{10, 5, 1, 7, 40, 50};
	        int size = pre.length;
	        Node root = tree.constructTree(pre, size);
	        System.out.println("Inorder traversal of the constructed tree is ");
	        tree.printInorder(root);
	    }
	
}
