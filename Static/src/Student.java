public class Student {
	private String id;
	private String name;
	private String major;
	static int count = 0;
	
	public Student (String id, String name, String major) {
		this.id = id;
		this.name = name;
		this.major = major;
		Count();
	}
	static void Count () {
		count++;
	}
	static void getCount () {
		System.out.println("Number of students in the School of Engineering - Class 2022 \n" + count);
	}
	public void getStudentInfo() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Major: " + major);
		System.out.println("---------------------------\n");
	}
}