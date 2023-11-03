package oops;

public class ThisConstructor {
	
	ThisConstructor (){
		this("man");
		System.out.println("default constructor");
	}
	ThisConstructor(String name){
		System.out.println("Parameterized construcor");
	}
public static void main(String[] args) {
	ThisConstructor c = new ThisConstructor();
	
}
}
