package JavaBasics;

public class Parent {
	public void sum(int a,int b) {
		System.out.println("Parent Method The sum is "+ (a + b));
	}
	public void sum(int a, int b, int c) {
		System.out.println("Method Overloading "+ (a + b + c));
	}
	public void display() {
		System.out.println("Display method in Parent");
		
	}
//	public static void main(String[] args) {
//		sum(1,2);
//		sum(5,5,5);
//	}
}
