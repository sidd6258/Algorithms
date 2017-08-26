package geeksForGeeks.linkedList;

public class GetCountLL {
    Node head;  // head of list
    
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    /* Returns count of nodes in linked list */
    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    int getCountRec(Node head)
    {
        // Base case
        if (head == null)
            return 0;
     
        // count is 1 + count of remaining list
        return 1 + getCountRec(head.next);
    }
 
    /* Drier program to test above functions. Ideally
       this function should be in a separate user class.
       It is kept here to keep code compact */
    public static void main(String[] args)
    {
        /* Start with the empty list */
    	GetCountLL llist = new GetCountLL();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
 
        System.out.println("Count of nodes is " +
                           llist.getCount());
        System.out.println("Count of nodes using Rec is " +
                llist.getCountRec(llist.head));
    }
}
