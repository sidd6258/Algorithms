package geeksForGeeks.binarySearchTree;

public class PrintBSTInGivenRange {

	     
	    static Node root;
	     
	    /* The functions prints all the keys which in the given range [k1..k2].
	     The function assumes than k1 < k2 */
	    void Print(Node node, int k1, int k2) {
	         if(node==null) return;
	         
//	         if(k1<node.key){
	        	 Print(node.left,k1,k2);
//	         }
	         if(k1<=node.key && k2>=node.key){
	        	 System.out.print(node.key+" ");
	         }
//	         if(k2>node.key){
	        	 Print(node.right,k1,k2);
//	         }
	    }
	     
	 
	    public static void main(String[] args) {
	    	PrintBSTInGivenRange tree = new PrintBSTInGivenRange();
	        int k1 = 10, k2 = 25;
	        tree.root = new Node(20);
	        tree.root.left = new Node(8);
	        tree.root.right = new Node(22);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(12);
	 
	        tree.Print(root, k1, k2);
	    }
	
}
