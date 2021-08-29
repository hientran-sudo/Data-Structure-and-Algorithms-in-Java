import java.util.ArrayList;
import java.util.Scanner;

public class Man {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		Student s1 = new Student();		
		s1.setName();
		s1.setId();
		arr.add(s1);
		for (Student s : arr) {
			System.out.println(s);
		}

	}

}
