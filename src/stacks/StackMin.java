package stacks;

import java.util.EmptyStackException;

public class StackMin<Integer> {

	private static class StackNode<Integer>
	{
		private Integer data;
		private StackNode<Integer> next;
		
		public StackNode(Integer data)
		{
			this.data=data;
		}
	}
	private StackNode<Integer> top;
	private StackNode<Integer> stackMin;
	
	public int pop()
	{
		if(top == null)
		{
			throw new EmptyStackException();
		}
		int item=(int) top.data;
		top=top.next;
		return item;
	}
	public int stackMin()
	{
		if(stackMin == null)
		{
			throw new EmptyStackException();
		}

		return (int)stackMin.data;
	}
	public void push(Integer item)
	{
		StackNode<Integer> t=new StackNode<Integer>(item);
		if(top==null)
		{
			stackMin=t;
		}
		t.next=top;
		top=t;
		if((int)stackMin.data > (int)t.data)
		{
			stackMin=t;
		}
	}
	public Integer peek()
	{
		if(top==null) throw new EmptyStackException();
		return top.data;
	}
	public boolean isEmpty()
	{
		return top==null;
	}

}



