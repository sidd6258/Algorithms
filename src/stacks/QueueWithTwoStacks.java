package stacks;

public class QueueWithTwoStacks {
public static void main(String [] args){
	MyStack<Integer> stack1 = new MyStack<Integer>();
	MyStack<Integer> stack2 = new MyStack<Integer>();
	
	for(int i=1;i<=50;i++) {
		stack1.push(i);
	}
	
	for(int i=1;i<=50;i++) {
		stack2.push(stack1.pop());
	}
	for(int i=1;i<=50;i++) {
		System.out.println(stack2.pop());
	}
}
}
