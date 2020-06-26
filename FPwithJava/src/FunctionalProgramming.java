import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgramming {
	
	public static void main (String args[]) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4,5,6,7,8,9, 10);
		
		// how to do
		for(Integer number: numbers) {
			// what to do
			if(number % 2 == 0) {
			//	System.out.println(number);
			}
			
		}
		
		Predicate<Integer> evenPredicate = n -> n % 2 ==0;
		
		Predicate<Integer> oddPredicate = n -> n % 2 ==1;
	
	//	printNumbers(numbers, evenPredicate);
		
		
		// find out the first even number which is greater than 5 and double it.
		numbers.stream()
		.filter(FunctionalProgramming::isEven)
		.filter(FunctionalProgramming::isGreaterThan5)
		.map(n -> n* 2)
		.findFirst();
	}

	private static int doubleIt(int a) {
		System.out.println("inside double");
		return a * 2;
	}

	private static boolean  isGreaterThan5(int n) {
		System.out.println("inside isGreaterThan5");
		return  n > 5;
	}
	
	private static boolean isEven(int a) {
		System.out.println("inside isEven");
		return a % 2 == 0;
	}
	
	
}