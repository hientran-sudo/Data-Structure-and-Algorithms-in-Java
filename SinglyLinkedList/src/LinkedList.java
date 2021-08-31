
public class LinkedList {
	Node head;

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		list.head.next = second;
		second.next = third;

		list.print();
		list.insertbeginning(4);
		System.out.println("After insertion at the beginning");
		list.print();

		System.out.println("After insertion at the end");
		list.insertend(5);
		list.print();
		
		System.out.println("After insertion at the given node");
		list.insertgiven(third,8);
		list.print();
		
		
	}

	public void print() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public void insertbeginning(int a) {
		Node n = new Node(a);
		n.next = head;
		head = n;
	}

	public void insertend(int a) {
		Node n = new Node(a);
		n.next = null;
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = n;
		return;
		}
	
	public void insertgiven (Node n, int a) {
		Node b = new Node(a);		
		b.next = n.next;
		n.next = b;		
	}

	}


