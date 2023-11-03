package oops;

public class Bank {
	String cname="sunil"; // instance or non static variable 
	int accno=12345;
	double bal=3000;

	void display() { // instance method 
		System.out.println(cname);
		System.out.println(accno);
		System.out.println(bal);
	}
	public static void main(String[] args) {
		Bank b= new Bank();
		b.display();
		//non static properties access non static properties
	}
}
