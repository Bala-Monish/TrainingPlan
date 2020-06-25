package June24;

public class Robber {
	class Solution {
	    public int rob(int[] nums) {
	    int prev1 = 0, prev2 = 0;
	        for(int num : nums){
	            int temp = prev1;
	            prev1 = Math.max(prev2 + num, temp);
	            prev2 = temp;
	        }
	        return prev1;
	    }
	    
	}
}
