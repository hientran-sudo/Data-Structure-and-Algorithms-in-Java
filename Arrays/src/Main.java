import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
/* ==============================Array of an Object===================================

		Student [] student = new Student [2];
		student[0]= new Student(1,"Tran");
		student[1]= new Student(2,"Mike");
		for (int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}
*/

/* ==============================Array of Integer===================================
		int [] arr = new int [2];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Please enter a number to an array");
			arr[i] = scan.nextInt();
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);		
		}
*/

/* ==============================ArrayList of Integer===================================
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hello");
		arr.add("This is Hien");
		for (String a : arr) {
			System.out.println(a);
		}
*/
/* ==============================ArrayList of Integer===================================
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student(1,"Hien"));
		arr.add(new Student(2,"Mike"));
		for(Student s: arr) {
			System.out.println(s);
		}
*/	
	}

}
