import java.util.Scanner;

public class Student {
	int id;
	String name;
	Scanner scan = new Scanner(System.in);

	Student() {
	}

	public void setId() {
		System.out.println("Please enter student id");
		id = scan.nextInt();
	}

	public void setName() {
		System.out.println("Please enter student name");
		name = scan.nextLine();

	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("id is " + id + " name is " + name);
		return str.toString();
	}

}
