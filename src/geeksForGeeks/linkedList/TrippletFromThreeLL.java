package geeksForGeeks.linkedList;

public class TrippletFromThreeLL {
	Node head;  // head of list

 
    /* A function to chech if there are three elements in a, b
      and c whose sum is equal to givenNumber.  The function
      assumes that the list b is sorted in ascending order and
      c is sorted in descending order. */
   boolean isSumSorted(TrippletFromThreeLL la, TrippletFromThreeLL lb, TrippletFromThreeLL lc,
                       int givenNumber)
   {
	   Node a=la.head;
	   
	   while(a!=null){
		   Node b=lb.head;
		   Node c=lc.head;
		   
		   int sum=a.data+b.data+c.data;
		   while(b!=null && c!=null){
			   if(sum==givenNumber){
				   System.out.println("Triplet Found "+a.data+" "+b.data+" "+c.data);
				   return true;
			   }
			   
			   if(sum<givenNumber){
				   b=b.next;
			   } else{
				   c=c.next;
			   }
		   }
		   a=a.next;	   
	   }
	   return false;
   }
 
 
    /*  Given a reference (pointer to pointer) to the head
       of a list and an int, push a new node on the front
       of the list. */
    void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
    	TrippletFromThreeLL llist1 = new TrippletFromThreeLL();
    	TrippletFromThreeLL llist2 = new TrippletFromThreeLL();
    	TrippletFromThreeLL llist3 = new TrippletFromThreeLL();
 
        /* Create Linked List llist1 100->15->5->20 */
        llist1.push(20);
        llist1.push(5);
        llist1.push(15);
        llist1.push(100);
 
        /*create a sorted linked list 'b' 2->4->9->10 */
        llist2.push(10);
        llist2.push(9);
        llist2.push(4);
        llist2.push(2);
 
        /*create another sorted linked list 'c' 8->4->2->1 */
        llist3.push(1);
        llist3.push(2);
        llist3.push(4);
        llist3.push(8);
 
        int givenNumber = 25;
        llist1.isSumSorted(llist1,llist2,llist3,givenNumber);
    }
}
