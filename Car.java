package oops;

public class Car {
	String cname="suzuki";
	String cno="ka-16-3662";
	int model=2022;
	
	void display() {
		System.out.println("car name is "+ cname + 
				"\ncar number is "+ cno+"Model is "+model);
				
	}
	public static void main(String[] args) {
		Car c= new Car();
		c.display();
	}

}

