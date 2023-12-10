import java.util.Stack;
 
class Node {
    int data;
    Node left, right;
 
    Node(int val) {
        data = val;
        left = right = null;
    }
}
 
public class Main {
    public static boolean hasPathSum(Node root, int targetSum) {
        if (root == null)
            return false;
 
        Stack<Node> stack = new Stack<>();
        Stack<Integer> sums = new Stack<>();
        stack.push(root);
        sums.push(root.data);
 
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            int sum = sums.pop();
 
            if (node.left == null && node.right == null) {
                if (sum == targetSum)
                    return true;
            }
 
            if (node.left != null) {
                stack.push(node.left);
                sums.push(sum + node.left.data);
            }
            if (node.right != null) {
                stack.push(node.right);
                sums.push(sum + node.right.data);
            }
        }
 
        return false;
    }
 
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);
 
        int targetSum = 20;
        if (hasPathSum(root, targetSum)) {
            System.out.println("There is a root-to-leaf path with sum " + targetSum);
        } else {
            System.out.println("There is no root-to-leaf path with sum " + targetSum);
        }
    }
}
