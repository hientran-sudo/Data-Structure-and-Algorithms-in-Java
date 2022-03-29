public class Main {
	static String school;
    static int classyear;
   
	static void setSchoolInfo(String name, int year) {
		school = name;
		classyear = year;		
	}
	static void getSchoolInfo() {
		System.out.println(school + " \n" + classyear);		
	}
	
	public static void main(String[] args) {
		setSchoolInfo("Fairfield University", 2022);
		getSchoolInfo();
		
		Student s1 = new Student ("st1", "Hien Tran", "Software Engineering");
		Student s2 = new Student ("st2", "Zac Willis", "Computer Science");
		System.out.println("---------------------------\n");
		
		s1.getStudentInfo();
		s2.getStudentInfo();
		Student.getCount();		
	}
}
