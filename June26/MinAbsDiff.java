package June26;

public class MinAbsDiff {
	class Solution {
	    public List<List<Integer>> minimumAbsDifference(int[] arr) {
	        List<List<Integer>> result = new ArrayList();
	        
	        Arrays.sort(arr);
	        int diff = Integer.MAX_VALUE;
	        for(int i = 0; i < arr.length-1; i++){
	           int current = arr[i+1] - arr[i];
	            if(current < diff){
	                diff = current;
	                result = new ArrayList();
	                result.add(Arrays.asList(arr[i],arr[i+1]));
	            }
	            else if(current == diff)
	                result.add(Arrays.asList(arr[i],arr[i+1]));
	        }
	            return result;
	    }
	}

}
