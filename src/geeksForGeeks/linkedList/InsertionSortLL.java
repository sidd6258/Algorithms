package geeksForGeeks.linkedList;

public class InsertionSortLL {
	Node head;
    Node sorted;
 
    void push(int val) 
    {
        /* allocate node */
        Node newnode = new Node(val);
        /* link the old list off the new node */
        newnode.next = head;
        /* move the head to point to the new node */
        head = newnode;
    }
 
    // function to sort a singly linked list using insertion sort
    void insertionSort(Node headref) 
    {
    	sorted=null;
    	Node current=headref;
    	while(current!=null){
    		Node next=current.next;
    		sortedInsert(current);
    		current=next;
    	}
    	head = sorted;
    }
 
    /*
     * function to insert a new_node in a list. Note that 
     * this function expects a pointer to head_ref as this
     * can modify the head of the input linked list 
     * (similar to push())
     */
    void sortedInsert(Node newnode) 
    {
    	if(sorted==null || sorted.data>=newnode.data){
    		newnode.next=sorted;
    		sorted=newnode;
    	}
    	else{
    		Node current=sorted;
    		while(current.next!=null && current.next.data<newnode.data){
    			current=current.next;
    		}
    		newnode.next=current.next;
    		current.next=newnode;
    	}   	
    }
 
    /* Function to print linked list */
    void printlist(Node head) 
    {
        while (head != null) 
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
     
    // Driver program to test above functions
    public static void main(String[] args) 
    {
    	InsertionSortLL list = new InsertionSortLL();
        list.push(5);
        list.push(20);
        list.push(4);
        list.push(3);
        list.push(30);
        System.out.println("Linked List before Sorting..");
        list.printlist(list.head);
        list.insertionSort(list.head);
        System.out.println("\nLinkedList After sorting");
        list.printlist(list.head);
    }
}
