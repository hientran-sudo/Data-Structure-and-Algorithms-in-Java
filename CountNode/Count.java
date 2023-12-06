public class Count {
	static class node {
		public int data;
		public node left, right;
		public node() {
			data = 0;
			left = right = null;
		}
	}
		
		static node New(int data) {
			node temp = new node();
			temp.data = data;
			temp.left = temp.right = null;
			return temp;		
					
		}
		
		static int Count(node root) {
			if (root == null) {
				return 0;
			}
			int Left = Count(root.left);
			int Right = Count(root.right);
			return 1 + Left + Right;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node root = New(1);
		root.left = New(3);
		root.right = New(2);
		System.out.print(Count(root));
	}
}
