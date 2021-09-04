import java.util.Stack;

public class Stack1 {
	static Stack<Integer> stack = new Stack<Integer>();
	static int min;

	public static void pushstack(int a) {				
		if (stack.isEmpty()) {
			min = a;
		}
		else if (a<min) {
			min = a;
		}
		stack.push(a);
	}

	public static void main(String[] args) {
		pushstack(2);
		pushstack(1);
		pushstack(4);
		pushstack(0);
		
		
		System.out.println(stack);
		System.out.println("Min is " + min);

	}

}
