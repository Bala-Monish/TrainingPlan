package inheritance;

public class Child extends Parent{
	protected String protectedString = "childProtectedString";
	
	@Override
	public void acquireKnowledge() {
		System.out.println("Acquire knowledge on Child");
	}
}
