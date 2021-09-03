import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
 
	public static void main(String[] args) {
		Stack <Integer> stack = new Stack <Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		for (Integer s : stack) {
			System.out.println(s);
		}
		System.out.println("top element " + stack.peek());
		try {
			while (stack.peek()!=null) {
				stack.pop();
			}
		}
		catch (EmptyStackException e) {
			System.out.println("Stack is empty now");
		}			
	}
}
