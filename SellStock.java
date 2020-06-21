
public class SellStock {

	    public int maxProfit(int[] prices) {
	        int min = Integer.MAX_VALUE;
	        int maxprofit = 0;
	        for(int i = 0; i < prices.length;i++){
	            if(min > prices[i] )
	                min = prices[i];
	            else if(maxprofit < prices[i]-min)
	                maxprofit = prices[i]-min;
	        }
	        return maxprofit;
	    }
	}

