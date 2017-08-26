package stacks;

import java.util.EmptyStackException;

public class FixedMultiStack {
	private int numberOfStacks=3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;

	public FixedMultiStack(int stackSize){
		stackCapacity=stackSize;
		values=new int[stackSize*numberOfStacks];
		sizes=new int[numberOfStacks];
	}
	
	/*Push value on Stack*/
	public void push(int stackNum, int value) throws FullStackException
	{
		/* Check that we have space for the next element */		
		if(isFull(stackNum)){
			throw new FullStackException();
		}
		
		/* Increment top pointer and then update top value. */
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = value;
	}
	
	/* Pop item from top of stack. */	
	public int pop(int stackNum)
	{
		if(isEmpty(stackNum)) throw new EmptyStackException();
		int topIndex=indexOfTop(stackNum);
		int value=values[topIndex];
		values[topIndex] = 0;
		sizes[stackNum]--;
		return value;		
	}
	
	/* Return top element. */
	public int peek(int stackNum){
		if(isEmpty(stackNum)) throw new EmptyStackException();
		return values[indexOfTop(stackNum)];
	}
	
	/* Return if stack is Empty. */
	public boolean isEmpty(int stackNum)
	{
		return sizes[stackNum] == 0;
	}

	/* Return if Stack is full. */
	public boolean isFull(int stackNum)
	{
		return sizes[stackNum] == stackCapacity;
	}
	
	/* Return index of the top of the stack. */
	public int indexOfTop(int stackNum)
	{
		int offset = stackNum*stackCapacity;
		int size = sizes[stackNum];
		return offset + size - 1;
	}
}
