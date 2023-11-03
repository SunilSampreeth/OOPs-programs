package oops;

public class Student {
	String name = "sunil";
	int id = 111;
void sleep() {
	System.out.println("sunil will sleep always");
}
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("The student name is : " + s.name);
		System.out.println("Student id is : " + s.id);
		s.sleep();//calling function
	}
}
