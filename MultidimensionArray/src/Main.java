import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[2][2];
		System.out.println("Please enter to an array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				Scanner scan = new Scanner(System.in);				
				arr[i][j]=scan.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
