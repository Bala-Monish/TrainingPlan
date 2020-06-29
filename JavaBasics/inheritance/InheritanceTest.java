package inheritance;

import test.TestParent;

public class InheritanceTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		Child2 child2 = new Child2();
		GrandChild grandChild = new GrandChild();
		
		parent.acquireKnowledge();
		child.acquireKnowledge();
		child2.acquireKnowledge();
		grandChild.acquireKnowledge();
		
		System.out.println("-------------");
		
		Parent parent2 = new Child(); // Up casting
		parent2.acquireKnowledge();
		
		Parent parent3 = new Child2();
		parent3.acquireKnowledge();
		
		Parent parent4 = new GrandChild();
		parent4.acquireKnowledge();
		
		System.out.println(parent4.add(2, 3));
	}

}
