
public class FirstUniqChar {
	
	    public int firstUniqChar(String s) {
	        
	        int[] rep = new int[26];
	        for(int i = 0;i<s.length();i++)
	            rep[s.charAt(i)-'a']++;
	        for(int i = 0;i<s.length();i++)
	            if( rep[s.charAt(i)-'a'] == 1)return i;
	        return -1;
	        
	    }
	}

