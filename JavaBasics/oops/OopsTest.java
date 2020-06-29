package oops;

class OopsTest {
	// OopsTest.main with String array arguments
	static String staticStr = "dfgsdg";
	public static void main(String[] args) {
		String str = "sdfas1";
		String str2 = new String("sdfas1");
		str2.intern();
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("Hello Bala");
		main(10);
	}
	
	public static void main(int a) {
		System.out.println("Main method with int");
	}

}
