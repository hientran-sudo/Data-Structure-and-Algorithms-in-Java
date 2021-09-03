import java.util.Stack;

public class List4 {
	Node head;
	static int l, m;

	public static void main(String[] args) {
		List4 list = new List4();
		list.head = new Node(1);
		list.head.next = null;
		list.add(2);
		list.add(8);
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(1);

		list.print();
		l = list.fLength();
		System.out.println("length is " + l);
		m = l % 2;
		if (m == 0) {
			m = (l / 2)-1;
		} else {
			m = (l - 1) / 2;
		}
		list.palindrome();

	}

	public void add(int a) {
		Node n = new Node(a);
		Node b = head;
		while (b.next != null) {
			b = b.next;
		}
		b.next = n;
	}

	public void print() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public int fLength() {
		int length = 0;
		Node n = head;
		while (n != null) {
			length++;
			n = n.next;
		}
		return length;
	}

	public void palindrome() {
		Stack<Integer> nodes = new Stack<Integer>();
		int pos = 0;
		Node n = head;
		while (pos != m) {
			n = n.next;
			pos++;
		}
		while (n != null) {
			nodes.push(n.data);
			n = n.next;
		}
		for (Integer no : nodes) {
			System.out.println(no);
		}
		Node n1 = head;
		int pos1 = 0;
		int check = 0;
		while (pos1 <= m && check == 0) {
			if (n1.data == nodes.pop()) {
				System.out.println("Match");
			} 
			else {
				System.out.println("Not palindrome");
				check = 1;
			}
			n1 = n1.next;
			pos1++;
		}
	}
}
