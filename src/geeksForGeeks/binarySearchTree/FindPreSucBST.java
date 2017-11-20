package geeksForGeeks.binarySearchTree;

public class FindPreSucBST {
	Node root;
	static Node pre=null,suc=null;
	
	static void findPreSuc(Node root,int key){
		if(root==null) return;
		if(root.key==key){
			if(root.left!=null){
				Node tmp=root.left;
				while(tmp.right!=null){
					tmp=tmp.right;
				}
				pre=tmp;
			}
			if(root.right!=null){
				Node tmp=root.right;
				while(tmp.left!=null){
					tmp=tmp.left;
				}
				suc=tmp;
			}
			return;
		}
		if(root.key>key){
			suc=root;
			findPreSuc(root.left,key);
		}
		if(root.key<key){
			pre=root;
			findPreSuc(root.right,key);
		}
	}
	
	boolean isBST(Node root){
		if(root==null) return true;
		if(root.left!=null){
		if(root.left.key>root.key || !isBST(root.left)){
			return false;
		}}
		if(root.right!=null){
		if(root.right.key<root.key || !isBST(root.right)){
			return false;
		}}
		return true;
	}
	Node insert(Node node, int data) {
        
        /* 1. If the tree is empty, return a new,     
         single node */
        if (node == null) {
            return (new Node(data));
        } else {
             
            /* 2. Otherwise, recur down the tree */
            if (data <= node.key) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
 
            /* return the (unchanged) node pointer */
            return node;
        }
    }
	
	 public static void main(String[] args) {
		 FindPreSucBST tree = new FindPreSucBST();
	        Node root = null;
	        root = tree.insert(root, 4);
	        tree.insert(root, 2);
	        tree.insert(root, 1);
	        tree.insert(root, 3);
	        tree.insert(root, 6);
	        tree.insert(root, 5);
	        findPreSuc(root,4);
	        System.out.println(pre.key+" "+suc.key);
	        if (tree.isBST(root))
	            System.out.println("IS BST");
	        else
	            System.out.println("Not a BST");
	    }
}
