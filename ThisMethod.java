package oops;

public class ThisMethod {
	void work() {
		System.out.println("i will work on 24/7");
	}
	void sleep() {
		work(); // this.work();
		System.out.println("i will sleep 6 hr");
	}
	
	public static void main(String[] args) {
		ThisMethod t = new ThisMethod();
		t.sleep();
	}

}
