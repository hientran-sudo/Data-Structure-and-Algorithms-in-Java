import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Sueue {
    Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(5);
	Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(5);
	static int count=0;
	
	public void push(int a) {
		int c=0;
		if (q1.isEmpty()) {
			q1.add(a);	
		}
		else {
			q2.add(a);
			count=count+2;
		}
		while (!q2.isEmpty()) {				
			q1.add(q2.poll());
			c++;
			if (c<=count) {
				q2.add(q1.poll());
				c++;
			}			
		}
	}
	public void print () {
		System.out.println(q1);
	}

	public static void main(String[] args) {
		Sueue s = new Sueue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		s.print();
	}
}



