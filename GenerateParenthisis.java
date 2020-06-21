import java.util.ArrayList;
import java.util.List;

public class GenerateParenthisis {
	    public List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<String>();
	        backtrack(list,"",0,0,n);
	        return list;
	    }
	    
	    public void backtrack(List<String> myList, String str, int open, int close, int max){
	        if(str.length() == max*2)
	        {
	            myList.add(str);
	            return;
	        }
	        if(open < max)
	            backtrack(myList,str+"(",open+1,close,max);
	        if(close < open)
	            backtrack(myList,str+")",open,close+1,max);
	        
	    }
	}
