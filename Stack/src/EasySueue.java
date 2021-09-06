import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class EasySueue {
	Queue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
	static int count = 0;
	
	public void push(int a) {
		
		if (queue.isEmpty()) {
			queue.offer(a);
			count++;
		}
		else {
			queue.offer(a);
			count++;	
			int c = 1;
			while (c<count) {
				queue.offer(queue.poll());
				c++;
			}
		}
	}
	
	public void pop() {
		queue.poll();
	}
	
	public void print () {
		System.out.println(queue);
	}

	public static void main(String[] args) {
		EasySueue es = new EasySueue();
		es.push(1);
		es.push(2);
        es.push(3);
        es.push(4);
        
		es.print();
		
		es.pop();
		es.print();		
	}
}
