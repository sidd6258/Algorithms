package geeksForGeeks.linkedList;

public class MergeTwoSortedList {
		Node head;

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
		void print(){
				Node t = head;
				while(t !=null){
					System.out.println(t.data);
					t = t.next;
				}
			}
		void push(Node newNode){
				if(head == null){
					head = newNode;
					head.next =null;
					return;				
				}
				Node cur = head;
				while(cur.next != null)
					cur = cur.next;
				cur.next = newNode;
				newNode.next = null;
			}
			void append(Node newNode){
				if(head == null){
					head= newNode;
					return;
				}
				Node cur = head;
				while(cur.next != null)
					cur = cur.next;
				cur.next = newNode;
			}
			public static MergeTwoSortedList merge(MergeTwoSortedList l1,MergeTwoSortedList l2){
				Node head1=l1.head;
				Node head2=l2.head;
				Node temp;
				MergeTwoSortedList res=new MergeTwoSortedList();
				while(head1!=null && head2!=null){
					if(head1.data<=head2.data){
						temp=head1.next;
						res.push(head1);
						head1=temp;
					}
					else if(head2.data<head1.data){
						temp=head2.next;
						res.push(head2);
						head2=temp;
					}
				}
				if(head1==null && head2!=null){
					res.append(head2);
				}
				if(head1!=null && head2==null){
					res.append(head1);
				}
				return res;
			}
			public static void main(String[] args) {
				MergeTwoSortedList l = new MergeTwoSortedList();
				
				MergeTwoSortedList l1 = new MergeTwoSortedList();
				l1.push(15);
				l1.push(10);
				l1.push(5);
				MergeTwoSortedList l2 = new MergeTwoSortedList();
				l2.push(20);
				l2.push(3);
				l2.push(2);
				MergeTwoSortedList res = new MergeTwoSortedList();
				res = merge(l1,l2);
				System.out.println("After merging 2 lists,new list is :");
				res.print();
			}

}
