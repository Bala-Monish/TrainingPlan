package June24;

public class MoveZeros {
	class Solution {
	    public void moveZeroes(int[] nums) {
	        int other = 0;
	        if (nums == null || nums.length == 0) return;        
	        for(int num:nums){
	            if(num != 0)
	                nums[other++] = num;
	        }      
	    while (other < nums.length) {
	        nums[other++] = 0;
	    }
	    }
	}
}
