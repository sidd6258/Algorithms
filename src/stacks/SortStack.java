package stacks;

public class SortStack {
public static MyStack<Integer> sortedStack = new MyStack<Integer>();
public static MyStack<Integer> tempStack = new MyStack<Integer>();
	public static void main(String[] args) {
		MyStack<Integer> stack1 = new MyStack<Integer>();
		
		
		stack1.push(10);
		stack1.push(33);
		stack1.push(20);
		stack1.push(5);
		stack1.push(15);
		findMax(stack1);
		while(!sortedStack.isEmpty()){
			System.out.println(sortedStack.pop());
		}
		
	}
public static int findMax(MyStack<Integer> stack){
	int max=0;
	tempStack = new MyStack<Integer>();
	MyStack<Integer> stacktemp = new MyStack<Integer>();
	while(!stack.isEmpty())
	{
		if(stack.peek() > max)
		{
			max=stack.peek();
			stacktemp.push(stack.pop());
		}
		else{stacktemp.push(stack.pop());}
	}
	while(!stacktemp.isEmpty()){
		if(stacktemp.peek() == max){
			sortedStack.push(stacktemp.pop());
		}
		else{
			tempStack.push(stacktemp.pop());
		}
	}
	
	if(!tempStack.isEmpty()){
		findMax(tempStack);
		}
	else{
		return 0;
		}
	return 0;
}
}
