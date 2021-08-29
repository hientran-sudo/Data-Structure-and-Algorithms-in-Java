
public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("id " + id + " name " + name);
		return str.toString();

	}
}
