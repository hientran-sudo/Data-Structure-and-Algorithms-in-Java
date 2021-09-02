import java.util.Scanner;

public class List3 {
	Node head;

	public static void main(String[] args) {
		List3 list = new List3();
		list.head = new Node (1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(1);
		list.print();
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter a number  ");
		int input = scan.nextInt();
		System.out.println("Number appears " + list.count(input) + " times");
		
		//list.loop(0);
		list.detectloop();
		

	}
	public void add (int a) {
		Node n = new Node (a);		
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = n;
		n.next = null;
		return;
	}
	
	public void print() {
		Node n = head;
		while (n!= null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public int count(int i) {
		int count = 0;
		Node n = head;
		while (n!=null) {
			if (n.data==i) {
				count++;
			}
			n=n.next;
		}		
		return count;		
	}
	
	public void loop(int a) {
		Node n = new Node (a);
		n.next = head;
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = n;
		return;
	}
	
	public void detectloop () {
		Node n = head;
		while (n!=null) {
			n = n.next;		
		}
		System.out.println("Loop NOT detected");
	}	
}
