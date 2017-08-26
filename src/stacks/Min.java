package stacks;

public class Min {


		public static void main(String[] args) {
			// TODO Auto-generated method stu
			
			StackMin<Integer> stack=new StackMin<Integer>();
			for(int i=10;i<=50;i++)
			{
			stack.push(i);
			}
			System.out.println("Displaying value of top in Stack "+stack.peek());
			System.out.println("Displaying min value in Stack "+stack.stackMin());
		}

	}

