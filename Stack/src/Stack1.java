import java.util.EmptyStackException;
import java.util.Stack;

public class Stack1 {
	static Stack<Integer> stack = new Stack<Integer>();
	static Stack<Integer> mini = new Stack<Integer>();
	static int min;

	public static void pushstack(int a) {
		if (stack.isEmpty()) {
			min = a;
			mini.push(min);
			
		} else if (a < min) {
			min = a;
			mini.push(min);
		}
		stack.push(a);
	}

	public static void popstack() {
		stack.pop();
		
	}

	public static void printstack() {
		System.out.println(stack);
	}
	
	public static void getMin() {
		try {
			System.out.println("Min is " + mini.pop());
		}
		catch (EmptyStackException e) {
			System.out.println("Min stays same");
		}
		
	}
	
	public static void main(String[] args) {
		pushstack(1);
		pushstack(1);
		pushstack(4);
		pushstack(5);

		printstack();
		getMin();
		popstack();
		printstack();
		getMin();
		
	}

}
