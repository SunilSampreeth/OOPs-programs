package oops;

public class ThisReuseCons {
	String name;
	int age;
	double sal;
	
	public ThisReuseCons(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public ThisReuseCons(String name, int age, double sal) {
		this(name,age);
		this.sal=sal;
		

	}
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
	}
	public static void main(String[] args) {
		ThisReuseCons r= new ThisReuseCons("suni", 22);
		ThisReuseCons r1= new ThisReuseCons("suni", 22,20000);
	r.display();
	r1.display();
	}

}
