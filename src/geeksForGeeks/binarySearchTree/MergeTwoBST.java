package geeksForGeeks.binarySearchTree;

import java.util.Stack;

public class MergeTwoBST {
	Node root1,root2;
	
	void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
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
	void merge(Node root1,Node roo2){
		Stack<Node> stack1=new Stack<>();
		Node current1= root1;
		Stack<Node> stack2=new Stack<>();
		Node current2=root2;
		if(root1==null){
			inorderRec(root2);
		}
		if(root2==null){
			inorderRec(root1);
		}
		while (current1 != null || !stack1.isEmpty() ||
		          current2 != null || !stack2.isEmpty())
		{
			if (current1 != null || current2 != null )
	        {
	            // Reach the leftmost node of both BSTs and push ancestors of
	            // leftmost nodes to stack s1 and s2 respectively
	            if (current1 != null)
	            {
	                stack1.push(current1);
	                current1 = current1.left;
	            }
	            if (current2 != null)
	            {
	                stack2.push(current2);
	                current2 = current2.left;
	            }
	 
	        }
			else{
				if (stack1.isEmpty())
	            {
	                while (!stack2.isEmpty())
	                {
	                    current2 = stack2.pop();
	                    current2.left = null;
	                    inorderRec(current2);
	                }
	                return ;
	            }
	            if (stack2.isEmpty())
	            {
	                while (!stack1.isEmpty())
	                {
	                    current1 = stack1.pop();
	                    current1.left = null;
	                    inorderRec(current1);
	                }
	                return ;
	            }
	            
	            current1=stack1.pop();
	            current2=stack2.pop();
	            
	            if (current1.key < current2.key)
	            {
	            	System.out.print(current1.key+" ");	                
	                current1 = current1.right;
	                stack2.push(current2);
	                current2 = null;
	            }
	            else
	            {
	            	System.out.print(current2.key+" ");	                
	                current2 = current2.right;
	                stack1.push(current1);
	                current1 = null;
	            }
			}
		}
		
	}
	public static void main(String[] args){
		MergeTwoBST tree=new MergeTwoBST();
		tree.root1=tree.insertRec(tree.root1, 3);
		tree.insertRec(tree.root1, 1);
		tree.insertRec(tree.root1, 5);
		tree.root2=tree.insertRec(tree.root2, 4);
		tree.insertRec(tree.root2, 2);
		tree.insertRec(tree.root2, 6);
		tree.inorderRec(tree.root1);
		tree.inorderRec(tree.root2);
		tree.merge(tree.root1,tree.root2);
		
	}
}
