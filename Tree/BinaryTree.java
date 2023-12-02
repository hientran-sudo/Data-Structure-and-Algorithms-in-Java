
public class BinaryTree {
	Node root;
	
	private Node addRecursive (Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		else if (value < current.value) {
			current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
			
		}
		return current;
	}
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	public void inOrder() {
		traverseInOrder(root);
	}
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}

	public void preOrder() {
		traversePreOrder(root);
	}
	
	public void traversePreOrder(Node node) {
	    if (node != null) {
	    	System.out.print(" " + node.value);
	        traverseInOrder(node.left);      
	        traverseInOrder(node.right);
	    }
	}

}

