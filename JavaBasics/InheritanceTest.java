package JavaBasics;

public class InheritanceTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		parent.sum(5, 5);
		child.sum(5, 5);
		Parent overriding = new Child(); // Method Overriding
		overriding.sum(5, 5);
		parent.display();
		ChildTwo childTwo = new ChildTwo();
		childTwo.display();
	}

}
