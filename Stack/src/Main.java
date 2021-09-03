import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
 
	public static void main(String[] args) {
		Stack <Integer> stack = new Stack <Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		System.out.println("top element " + stack.peek());
		
		searching(stack,1);
		
		try {
			while (stack.peek()!=null) {
				stack.pop();
			}
		}
		catch (EmptyStackException e) {
			System.out.println("Stack is empty now");
		}			
	}
	
	public static void searching (Stack <Integer> stack, int a) {
		Integer pos = (Integer) stack.search(a);
		if (pos == -1) {
			System.out.println("Item not found");
		}
		else {
			System.out.println("element at position " + stack.search(a));
		}
	}
}
