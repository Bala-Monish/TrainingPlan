package June26;

public class MinIndexSum {
	class Solution {
	    public String[] findRestaurant(String[] list1, String[] list2) {
	        HashMap<String,Integer> list = new HashMap<String,Integer>();
	        int min = Integer.MAX_VALUE,current = 0;
	       List<String> result = new ArrayList<String>();
	        for(int i = 0 ; i < list1.length ; i++) list.put(list1[i],i);
	        for(int i = 0 ; i < list2.length; i++){
	            if(list.containsKey(list2[i]))
	               {
	                   current = i + list.get(list2[i]);
	                   if(current < min)
	                   {min = current; 
	                    result.clear();
	                    result.add(list2[i]);
	               }else if(current == min){
	                       result.add(list2[i]);
	                   }
	               
	        }
	               
	}
	               return result.toArray(new String[result.size()]);
	               }
	               }
}
