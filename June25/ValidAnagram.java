package June25;

public class ValidAnagram {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        
	        int[] comp = new int[26];
	        for(int i = 0;i<s.length();i++)
	        	comp[s.charAt(i) - 'a']++;
	        for(int i = 0;i<t.length();i++) 
	        	comp[t.charAt(i) - 'a']--;
	        for(int i:comp){
	            if(i != 0) return false;
	        }
	        return true;
	    }
	}
}
