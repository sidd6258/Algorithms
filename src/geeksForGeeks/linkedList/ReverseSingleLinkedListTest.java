package geeksForGeeks.linkedList;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ReverseSingleLinkedListTest {

	@Test
	public void test1() {
		ReverseSingleLinkedList list=new ReverseSingleLinkedList();
		list.head = list.reverseList(list.head);
		assertEquals(null,list.head);
	}
	
	@Test
	public void test2() {
		ReverseSingleLinkedList list=new ReverseSingleLinkedList();
		list.append(1);
		list.head = list.reverseList(list.head);
		assertEquals(1,list.head.value);
	}
	
	@Test
	public void test3() {
		ReverseSingleLinkedList list=new ReverseSingleLinkedList();
		list.append(1);
		list.append(2);
		list.head = list.reverseList(list.head);
		assertEquals(2,list.head.value);
		assertEquals(1,list.head.next.value);
	}
	
	@Test
	public void test4() {
		ReverseSingleLinkedList list=new ReverseSingleLinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.head = list.reverseList(list.head);
		assertEquals(3,list.head.value);
		assertEquals(2,list.head.next.value);
		assertEquals(1,list.head.next.next.value);
	}
	

}
