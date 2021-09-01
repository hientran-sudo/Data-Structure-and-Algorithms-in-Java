
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
		list.insertgiven(third, 8);
		list.print();

		System.out.println("After delete a given node");
		list.delete(1);
		list.print();

		System.out.println("After delete a given position");
		list.deleteposition(1);
		list.print();

		// System.out.println("Delete a whole Linked List");
		// list.deleteList();
		// list.print();

		System.out.println("length of list " + list.findLength());
		
		if (list.exist(list.head,31)) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		System.out.println("Find a node at the given position");
		list.find(2);

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

	public void insertgiven(Node n, int a) {
		Node b = new Node(a);
		b.next = n.next;
		n.next = b;
	}

	public void delete(int c) {
		Node n = head, prev = null;
		while (n != null && n.data != c) {
			prev = n;
			n = n.next;
		}
		prev.next = n.next;
	}

	public void deleteposition(int p) {
		int position = 0;
		Node n = head, prev = null;
		while (n != null && position != p) {
			prev = n;
			n = n.next;
			position++;
		}
		prev.next = n.next;
	}

	public void deleteList() {
		head = null;
	}

	public int findLength() {
		int length = 0;
		Node n = head;
		while (n != null) {
			n = n.next;
			length++;
		}
		return length;
	}

	boolean exist(Node head, int key) {
		if (head == null) {
			return false;
		}           
		if (head.data == key) {
			return true;
		}	
		return exist(head.next,key);
	}
	
	public void find(int p) {
		int position = 0;
		Node n = head;
		while (n!=null)
		{			
			if (position == p) {
				System.out.println(n.data);
			}
			n = n.next;
			position++;
		}			
	}
}
