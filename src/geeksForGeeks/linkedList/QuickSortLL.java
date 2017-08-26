package geeksForGeeks.linkedList;

public class QuickSortLL {

		static Node head;

		class Holder {
			Node headStart;
			Node headEnd;
		}

		public void push(int val) {
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;
		}

		// the quicksort start
		public Node recQuickSort(Node start, Node end) {
			// the base case
			if (start == null || start == end) {
				return start;
			}
			Holder h = new Holder();
			Node pivot = partition(start, end, h);
			if (h.headStart != pivot) {
				// we need to set in the left
				// for recusion
				Node temp = h.headStart;
				while (temp.next != pivot) {
					temp = temp.next;
				}
				// got to break the list
				temp.next = null;
				// now temp points before the pivot
				h.headStart = recQuickSort(h.headStart, temp);
				// put the pivot at correct place
				temp = getLastNode(h.headStart);
				temp.next = pivot;

			}
			pivot.next = recQuickSort(pivot.next, h.headEnd);

			return h.headStart;
		}

		/* Function to print linked list */
		public void printList() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		private Node partition(Node start, Node end, Holder h) {
			// the plan is start from the head
			// if you find something bigger than
			// the pivot, place it behind the last node
			Node prev = null;
			Node current = start;
			Node pivot = end;
			Node tail = pivot;
			// a pointer to the end
			while (current != end) {
				if (current.data < pivot.data) {
					// the first item less than pivot becomes the head
					if (h.headStart == null) {
						h.headStart = current;
					}
					prev = current;
					current = current.next;
				} else {
					// cut the link and move it to the end
					if (prev != null)
						prev.next = current.next;
					Node temp = current.next;
					current.next = null;
					tail.next = current;
					tail = current;
					current = temp;
				}
			}
			// let us assume that pivot is smallest of all
			// so the headStart is still null
			if (h.headStart == null) {
				h.headStart = pivot;
			}

			// now we save the end
			h.headEnd = tail;
			// this is returned because everything greater to it is on right
			// and everything less to the left
			return pivot;
		}

		// finds the last node
		private Node getLastNode(Node start) {
			Node current = start;
			while (current != null && current.next != null) {
				current = current.next;
			}
			return current;
		}

		public static void main(String[] args) {
			QuickSortLL llist = new QuickSortLL();

			/*
			 * Constructed Linked List
			 */
			llist.push(2);
			llist.push(7);
			llist.push(6);
			llist.push(8);
			llist.push(1);

			System.out.println("Given Linked List");
			llist.printList();

			llist.recQuickSort(llist.head, llist.getLastNode(llist.head));

			System.out.println("Sorted list");
			llist.printList();
		}


}
