package stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

public class SetOfStacks {
	
ArrayList<StackForSetOfStack> stacks=new ArrayList<StackForSetOfStack>();
private int capacity;

public SetOfStacks(int capacity)
{
	this.capacity = capacity;
}
public StackForSetOfStack getLastStack()
{
	if(stacks.size() == 0) return null;
	StackForSetOfStack last= stacks.get(stacks.size() -1);
	return last;
}
public void push(int v)
{
	StackForSetOfStack last = getLastStack();
	if(last != null && !last.isFull())
	{
		last.push(v);
	}
	else
	{
		StackForSetOfStack stack=new StackForSetOfStack(capacity);
		stack.push(v);
		stacks.add(stack);
	}
}

public int pop()
{
	StackForSetOfStack last=getLastStack();
	if(last == null) throw new EmptyStackException();
	int v = (int) last.pop();
	if(last.size == 0) stacks.remove(stacks.size() -1);
	return v;
}
public boolean isEmpty(){
	StackForSetOfStack last = getLastStack();
	return last == null || last.isEmpty();
}

public static void main(String[] args){
	SetOfStacks setOfStacks=new SetOfStacks(10);
	for (int i = 0;i<50;i++){
		setOfStacks.push(i);
	}

	for (int i = 0;i<50;i++){
		System.out.println(setOfStacks.pop() +" belogs to stack number "+setOfStacks.stacks.size());
	}

}

}
