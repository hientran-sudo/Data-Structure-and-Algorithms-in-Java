public class List2 {
	Node head;

	public static void main(String[] args) {
		List2 list = new List2();
		list.head = new Node (1);
		Node second = new Node (2);
		//Node third = new Node (3);
		//Node fourth = new Node (4);
		//Node fifth = new Node (6);
		
		list.head.next = second;
		//second.next = third;
		//third.next=fourth;
		//fourth.next = fifth;
		
		list.print();
		System.out.println("length of list " + list.findlength());
		list.findnode(list.findlength()-1);
		int m = list.findlength()% 2;
		int a;
		if (m==0) {
			a = list.findlength()/2;
		}
		else 
		{
			a = (list.findlength()-1)/2;
		}
		list.findmiddle(a);
		
	}
	
	public void print () {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}		
	}
	
	//get a node starting from the end of the list
	
	public int findlength() {
		int length = 0;
		Node n = head;
		while (n!=null) {
			n=n.next;
			length++;			
		}
		return length;
	}
	
	public void findnode (int p) {		
		int position = 0;
		Node n = head;
		while (n!=null) {
			if (position == p) {
				System.out.println(n.data);
			}
			n=n.next;
			position ++;
		}
	}
	
	public void findmiddle(int p) {		
		int position = 0;
		Node n = head;
		while (n!=null) {
			if (position == p) {
				System.out.println(n.data);
			}
			n=n.next;
			position ++;
		}
	}
	
	
}
