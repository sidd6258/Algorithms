package geeksForGeeks.binaryTree;

public class MakeBTFromInPreOrder {
	class Node {
		public char key;
		public Node left,right;

		Node(char key){
			this.key=key;
			left=null;
			right=null;
		}

		}
	    Node root;
	    static int preIndex = 0;
	  
	    /* Recursive function to construct binary of size len from
	       Inorder traversal in[] and Preorder traversal pre[].
	       Initial values of inStrt and inEnd should be 0 and len -1.  
	       The function doesn't do any error checking for cases where 
	       inorder and preorder do not form a tree */
	    Node buildTree(char in[], char pre[], int inStrt, int inEnd) 
	    {
	    	if(inStrt > inEnd){
	    		return null;
	    	}
	    	Node tNode=new Node(pre[preIndex++]);
	    	int inIndex = search(in,inStrt,inEnd,tNode.key);
	    	
	    	tNode.left = buildTree(in, pre, inStrt, inIndex-1);
	    	tNode.right = buildTree(in, pre, inIndex+1, inEnd);
	    	
	    	return tNode;
	    }
	    /* UTILITY FUNCTIONS */
	     
	    /* Function to find index of value in arr[start...end]
	     The function assumes that value is present in in[] */
	    int search(char arr[], int strt, int end, char value) 
	    {
	        int i;
	        for (i = strt; i <= end; i++) 
	        {
	            if (arr[i] == value)
	                return i;
	        }
	        return i;
	    }
	  
	    /* This funtcion is here just to test buildTree() */
	    void printInorder(Node node) 
	    {
	        if (node == null)
	            return;
	  
	        /* first recur on left child */
	        printInorder(node.left);
	  
	        /* then print the data of node */
	        System.out.print(node.key + " ");
	  
	        /* now recur on right child */
	        printInorder(node.right);
	    }
	  
	    // driver program to test above functions
	    public static void main(String args[]) 
	    {
	    	MakeBTFromInPreOrder tree = new MakeBTFromInPreOrder();
	        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
	        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
	        int len = in.length;
	        Node root = tree.buildTree(in, pre, 0, len - 1);
	  
	        // building the tree by printing inorder traversal
	        System.out.println("Inorder traversal of constructed tree is : ");
	        tree.printInorder(root);
	    }
	}

