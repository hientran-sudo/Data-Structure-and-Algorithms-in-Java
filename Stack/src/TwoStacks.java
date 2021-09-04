
public class TwoStacks {
	int n = 10;
	int i = 0;
	int j = n - 1;
	int arr[] = new int[n];

	public static void main(String[] args) {
		TwoStacks stack = new TwoStacks();

		stack.push2(3);
		stack.push2(2);
		stack.push2(1);
		stack.printstack2();
		stack.pop2();
		stack.printstack2();
		/*
		 * stack.push1(1); stack.push1(2); stack.push1(3); stack.printstack1();
		 * stack.pop1(); stack.pop1(); stack.printstack1();
		 */

	}

	public void push1(int a) {
		arr[i] = a;
		i++;
	}

	public void pop1() {
		i--;
	}

	public void printstack1() {
		for (int n = 0; n < i; n++) {
			System.out.println(arr[n]);
		}
	}

	public void printstack2() {
		for (int m = n - 1; m > j; m--) {
			System.out.println(arr[m]);
		}
	}

	public void pop2() {
		j++;
	}

	public void push2(int a) {
		arr[j] = a;
		j--;
	}
}
