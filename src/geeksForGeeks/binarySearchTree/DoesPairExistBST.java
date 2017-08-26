package geeksForGeeks.binarySearchTree;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DoesPairExistBST {

		 
		    // Root of BST
		    Node root;
		    ArrayList<Integer> BSTList=new ArrayList<Integer>();
		    // Constructor
		    void InsertAndSearBST() { 
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
		            BSTList.add(root.key);
		            inorderRec(root.right);
		        }
		    }
		    
		    void searchPair(int a,int b){
		    	int start=0;
		    	int end=BSTList.size()-1;
		    	int i=0;
		    	int arr[]=new int[end+1];
		    	Iterator<Integer> itr=BSTList.iterator();
		    	while(itr.hasNext()){
		    		arr[i]=itr.next();
		    		i++;
		    	}
		    	int finalSum=a+b;
		    	while(start<end){
		    		if(finalSum == arr[start]+arr[end]){
		    			System.out.println("Found pair "+arr[start]+" "+arr[end]);
		    			return;
		    		}
		    		else if(finalSum>arr[start]+arr[end]){
		    			start++;
		    		}
		    		else if(finalSum<arr[start]+arr[end]){
		    			end--;
		    		}
		    	}
		    	
		    	System.out.println("Pair not found");
		    	
		    }
		    // Driver Program to test above functions
		    public static void main(String[] args) {
		    	DoesPairExistBST tree = new DoesPairExistBST();
		 
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
		        
		        tree.searchPair(20, 200);
		    }
		

}
