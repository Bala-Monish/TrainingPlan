package June24;

import java.util.HashSet;

public class Happy {
	class Solution {
	    public boolean isHappy(int n) {
	     HashSet<Integer> set = new HashSet<Integer>();
	        int rem = 0;
	        int prod;
	        while(set.add(n)){
	            prod = 0;
	            while(n > 0){
	                rem = n%10;
	                prod += rem *rem;
	                n = n/10;
	                }
	            if(prod == 1)
	                return true;
	            else
	               n = prod;
	            }  
	    return false;
	    }
	}
}
