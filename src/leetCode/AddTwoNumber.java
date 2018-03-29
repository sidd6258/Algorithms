package leetCode;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class AddTwoNumber {
	
	ListNode head1,head2;
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public void append1(int new_data)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        ListNode new_node = new ListNode(new_data);
 
        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head1 == null)
        {
            head1 = new ListNode(new_data);
            return;
        }
 
        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;
 
        /* 5. Else traverse till the last node */
        ListNode last = head1; 
        while (last.next != null)
            last = last.next;
 
        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
	
	public void append2(int new_data)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        ListNode new_node = new ListNode(new_data);
 
        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head2 == null)
        {
            head2 = new ListNode(new_data);
            return;
        }
 
        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;
 
        /* 5. Else traverse till the last node */
        ListNode last = head2; 
        while (last.next != null)
            last = last.next;
 
        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
 
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String l1String=getListString(l1,"");
        String l2String=getListString(l2,"");
        BigInteger b1=new BigInteger(l1String);
        BigInteger b2=new BigInteger(l2String);
        BigInteger b3=b1.add(b2);
        
        double sum=Double.parseDouble(l1String)+Double.parseDouble(l2String); 
        System.out.println(String.format ("%.0f", sum));
        return convertSumToList(String.format ("%.0f", sum));
        
	}
	 public ListNode convertSumToList(String sum){
		ListNode list=null;
		char[] charArray=sum.toCharArray();
		for(int i=charArray.length-1;i>=0;i--){
			if(list==null){
				list=new ListNode(Character.getNumericValue(charArray[i]));
			}
			else{
				ListNode temp=list;
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=new ListNode(Character.getNumericValue(charArray[i]));
			}
		}        
	    return list;
	    }
	public String getListString(ListNode l,String lString){
	    if(l==null) return "";
	    else{
	       lString=getListString(l.next,"");
	       lString +=l.val;
	    }
	    return lString;
	}
	
	public static void main(String[] args){
		AddTwoNumber list= new AddTwoNumber();
		int arr1[]= {2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,9};
		int arr2[]= {5,6,4,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,9,9,9,9};
		for(int i=0;i<arr1.length;i++) {
			list.append1(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			list.append2(arr2[i]);
		}
		
		ListNode list1=list.addTwoNumbers(list.head1, list.head2);
		while(list1!=null){
			System.out.print(list1.val+ " ");
			list1=list1.next;
		}

	}
}
