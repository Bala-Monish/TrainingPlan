
public class SingleNumber {
	
	    public int singleNumber(int[] nums) {
	    	
	    	int ans =0;
	    	int len = nums.length;
	    	for(int i=0;i!=len;i++)
	    		ans ^= nums[i];//XOR a ^ a = 0;  XOR a ^ 0 = a; Using XOR to find the unique number in array 
	    
	    	return ans;
	      
	    }
	}
