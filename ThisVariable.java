package oops;

public class ThisVariable {
	String name;
	int age;
	public ThisVariable(String name, int age) {
this.name=name;
this.age=age;
	}
	void display() {
		System.out.println(name);
		
	}
	public static void main(String[] args) {
ThisVariable v = new ThisVariable("man", 22);
v.display();
}

}
