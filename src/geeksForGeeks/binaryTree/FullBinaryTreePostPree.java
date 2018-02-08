package geeksForGeeks.binaryTree;

public class FullBinaryTreePostPree {

	    // variable to hold index in pre[] array
	    static int preindex;
	 
	    Node root;
	 
	    // A recursive function to construct Full 
	    // from pre[] and post[]. preIndex is used 
	    // to keep track of index in pre[]. l is 
	    // low index and h is high index for the 
	    // current subarray in post[]
	    static Node constructTreeUtil(int pre[], int post[], int start, 
	                                   int end, int size) 
	    {
	         if(preindex >= size || start > end) return null; 

	         Node root = new Node(pre[preindex]); 
	         preindex++;
	         
	         if (start == end || preindex >= size)
	             return root; 
	         
	         int i;
	         
	         for(i=start;i<=end;i++) 
	         {
	        	if( post[i] == pre[preindex]) 
	        		break;
	         }
	         
	         if(i<=end) 
	         {
	        	 root.left = constructTreeUtil(pre,post,start,i,size);
	        	 root.right = constructTreeUtil(pre,post,i+1,end,size);
	         }
	         return root;
	    }
	    
	 
	    // The main function to construct Full 
	    // Binary Tree from given preorder and 
	    // postorder traversals. This function 
	    // mainly uses constructTreeUtil()
	    static Node constructTree(int pre[], int post[], int size) 
	    {
	        preindex = 0;
	        return constructTreeUtil(pre, post, 0, size-1, size);
	    }
	 
	    static void printInorder(Node root) 
	    {
	        if (root == null)
	            return;
	        printInorder(root.left);
	        System.out.print(root.key + " ");
	        printInorder(root.right);
	    }
	 
	    public static void main(String[] args) 
	    {
	 
	        int pre[] = { 1, 2, 4, 8, 9, 5, 3, 6, 7 };
	        int post[] = { 8, 9, 4, 5, 2, 6, 7, 3, 1 };
	 
	        int size = pre.length;
	        Node root = constructTree(pre, post, size);
	 
	        System.out.println("Inorder traversal of the constructed tree:");
	        printInorder(root);
	    }
	
}
