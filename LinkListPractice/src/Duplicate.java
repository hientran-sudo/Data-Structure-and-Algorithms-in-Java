
public class Duplicate {
	Node head;

	public static void main(String[] args) {
		Duplicate list = new Duplicate();
		list.head = new Node(1);
		list.head.next = null;
		list.add(2);
		list.add(2);
		//list.print();
		list.CheckDup();
		list.print();

	}

	public void add(int i) {
		Node n = new Node(i);
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

	public void CheckDup() {
		Node n = head;
		while (n != null) {
			Node temp = n;
			while (temp != null && temp.data == n.data) {
				temp = temp.next;
			}
			n.next = temp;
			n = n.next;
		}
	}

}
