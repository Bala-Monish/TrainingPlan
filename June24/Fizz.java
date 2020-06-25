package June24;

public class Fizz {
	class Solution {
	    public List<String> fizzBuzz(int n) {
	        List<String> prob = new ArrayList<String>();
	        for(int i =1;i <= n; i++){
	            if((i % 15) == 0){
	                prob.add("FizzBuzz");
	            }else if(i % 3 == 0)
	                prob.add("Fizz");
	            else if(i % 5 == 0 )
	                prob.add("Buzz");
	            else
	                prob.add(Integer.toString(i));
	        }
	        return prob;
	    }
	}
}
