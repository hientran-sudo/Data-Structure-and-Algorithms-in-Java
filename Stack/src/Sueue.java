import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Sueue {
	Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(8);
	Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(8);
	static int count = 0;

	public void push(int a) {
		int c = 0;
		if (q1.isEmpty()) {
			q1.offer(a);
		} else {
			q2.offer(a);
			count = count + 2;
		}
		while (!q2.isEmpty()) {
			q1.offer(q2.poll());
			c++;
			if (c <= count) {
				q2.offer(q1.poll());
				c++;
			}
		}
	}
	
	public void pop() {
		/*try {
			q1.remove();
		} catch (NoSuchElementException e) {
			System.out.println("Stack is empty now");
		}*/
		q1.poll();
	}

	public void print() {
		System.out.println(q1);
	}

	public static void main(String[] args) {
		Sueue s = new Sueue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);//add more than allowed
		
		s.print();
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();//remove more than number of items
		s.print();
	}
}
