package geeksForGeeks.binarySearchTree;

public class LLtoBST {
		 
	    /* head node of link list */
	    static LNode head,tail;
	     
	    /* Link list Node */
	    class LNode 
	    {
	        int data;
	        LNode next, prev;
	 
	        LNode(int d) 
	        {
	            data = d;
	            next = prev = null;
	        }
	    }
	     
	    /* A Binary Tree Node */
	    class TNode 
	    {
	        int data;
	        TNode left, right;
	 
	        TNode(int d) 
	        {
	            data = d;
	            left = right = null;
	        }
	    }
	 
	    /* This function counts the number of nodes in Linked List
	       and then calls sortedListToBSTRecur() to construct BST */
	 
	    /* The main function that constructs balanced BST and
	       returns root of it.
	       n  --> No. of nodes in the Doubly Linked List */
	    TNode sortedListToBST(LNode head,LNode tail) 
	    {
	    	TNode root=null;
	    	int countNodes=countNodes(head,tail) ;
	    	if(countNodes>1){
	    		LNode temp=getBeforeMiddle(head,countNodes);
	    		root=new TNode(temp.next.data);
	    		root.left=sortedListToBST(head,temp);
	    		root.right=sortedListToBST(temp.next.next,tail);
	    	}
	    	else{
	    		root=new TNode(head.data);
	    	}
	    	return root;
	    }
	    
	    LNode getBeforeMiddle(LNode head,int count){

	        int mid;
	        mid=count/2;
	        mid=mid-1;
	        while(head!=tail && mid!=0) {
	            head=head.next;
	            mid=mid-1;

	        }
	        return head;

	    }
	 
	    /* UTILITY FUNCTIONS */
	    /* A utility function that returns count of nodes in a 
	       given Linked List */
	    int countNodes(LNode head,LNode tail) 
	    {
	        int count = 0;
	        LNode temp = head;
	        while (temp != tail)
	        {
	            temp = temp.next;
	            count++;
	        }
	        return count+1;
	    }
	 
	    /* Function to insert a node at the beginging of 
	       the Doubly Linked List */
	    void push(int new_data) 
	    {
	        /* allocate node */
	        LNode new_node = new LNode(new_data);
	        /* since we are adding at the begining,
	           prev is always NULL */
	        new_node.prev = null;
	 
	        /* link the old list off the new node */
	        new_node.next = head;
	        
	        /* change prev of head node to new node */
	        if (head != null)
	            head.prev = new_node;
	 
	        /* move the head to point to the new node */
	        head = new_node;
	    }
	 
	    /* Function to print nodes in a given linked list */
	    void printList(LNode node) 
	    {
	        while (node != null) 
	        {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	    /* A utility function to print preorder traversal of BST */
	    void preOrder(TNode node) 
	    {
	        if (node == null)
	            return;
	        System.out.print(node.data + " ");
	        preOrder(node.left);
	        preOrder(node.right);
	    }
	    
	    static LNode getTailNode(LNode head){
	    	while(head!=null){
	    		tail=head;
	    		head=head.next;
	    		
	    	}
	    	return tail;
	    }
	 
	    /* Drier program to test above functions */
	    public static void main(String[] args) {
	    	LLtoBST llist = new LLtoBST();
	 
	        /* Let us create a sorted linked list to test the functions
	           Created linked list will be 7->6->5->4->3->2->1 */
	        llist.push(7);
	        llist.push(6);
	        llist.push(5);
	        llist.push(4);
	        llist.push(3);
	        llist.push(2);
	        llist.push(1);
	        tail=getTailNode(head);
	        System.out.println("Given Linked List ");
	        llist.printList(head);
	 
	        /* Convert List to BST */
	        TNode root = llist.sortedListToBST(head,tail);
	        System.out.println("");
	        System.out.println("Pre-Order Traversal of constructed BST ");
	        llist.preOrder(root);
	    }
	
}
