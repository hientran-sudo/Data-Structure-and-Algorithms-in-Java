
import java.util.Stack;

public class Quack {
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	static void enQueue(int a) {		
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(a);	
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
		
	static void deQueue() {
		stack2.pop();
	}
	
	static void print() {
		System.out.println(stack1);
	}
	
	public static void main(String[] args) {
		Quack q = new Quack();	
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.print();	
	}
}
