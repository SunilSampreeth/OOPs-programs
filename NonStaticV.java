package oops;

public class NonStaticV {
String cname="sunil";
int accno=12345;
double bal=3000;

void display() {
	System.out.println("i am non static method");
}

public static void main(String[] args) {
	NonStaticV v = new NonStaticV();
	System.out.println(v.accno);
	System.out.println(v.cname);
	System.out.println(v.bal);
	v.display();
}
}
