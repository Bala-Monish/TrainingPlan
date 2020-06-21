
public class ReverseWordsInString {
	
	    public String reverseWords(String s) {
	        //s = s.replacAall("  +"," ");
	        String [] fields = s.split(" ");
	        String reverse = "";
	        for(int i = fields.length-1; i >= 0; i--)
	            reverse = reverse + fields[i] + " ";
	        reverse = reverse.trim().replaceAll("\\s{2,}", " ");//to remove excess whitespace between words
	        return reverse;
	    }
	}

