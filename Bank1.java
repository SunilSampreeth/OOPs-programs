package oops;

public class Bank1 {
	String cname="ram"; // instance or non static variable 
	int accno=12345;
	double bal=3000;
	static String ifsc="baj233"; // static variable
	
	void display() {   // non static method
		System.out.println(cname);
		System.out.println(accno);
		System.out.println(bal);
		System.out.println(ifsc);
	}
	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.display();
	}
}
