import java.util.Stack;

public class BalancedParanthesis {

	    public boolean isValid(String s) {
	        Stack<Character> open = new Stack<Character>();
	        for(int i =0; i <s.length();i++){
	        if(s.charAt(i) == '{' || s.charAt(i) == '(' ||s.charAt(i) == '[')
	                open.push(s.charAt(i));
	            
	        else if(s.charAt(i) == '}' && !open.empty() && open.peek() == '{')
	               open.pop();
	        else if(s.charAt(i) == ']' && !open.empty() && open.peek() == '[')
	                open.pop();
	        else if(s.charAt(i) == ')' && !open.empty() && open.peek() == '(')
	                open.pop();
	        else
	            return false;
	        }
	    return open.empty();
	    }
	}
