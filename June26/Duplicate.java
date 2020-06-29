package June26;

public class Duplicate {
	class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> myset = new HashSet<Integer>();
	        for (int x : nums){
	            if(myset.contains(x))
	               return true;
	             myset.add(x);
	        
	        }
	        return false;
	    }
	}
}
