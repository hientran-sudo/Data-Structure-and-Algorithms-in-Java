import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main (String[] args) {
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(8);
		
		a.setLeftChild(b);
		a.setRightChild(c);
		breadthFirst(a);
		
	}
	
	public static void breadthFirst (Node root) {
		if (root == null) {
			return;
		}
		Queue<Pair<Node, Integer>> queue = new LinkedList<>();
		int level = 0;
		queue.add(new Pair<>(root, level));
		
		while (!queue.isEmpty()) {
			Pair<Node, Integer> pair = queue.remove();
			System.out.print(pair + " -->");
			level = pair.getValue() + 1;
			Node leftChild = pair.getKey().getLeftChild();
			if (leftChild !=null) {
				queue.add(new Pair<>(leftChild, level));
			}
			
			Node rightChild = pair.getKey().getRightChild();
			if (rightChild !=null) {
				queue.add(new Pair<>(rightChild, level));
			}
		}
	}
}
