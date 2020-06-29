package June26;

public class NaryTreePostorder {
	/*
	// Definition for a Node.
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	*/
	class Solution {
	    public List<Integer> postorder(Node root) {
	        List<Integer> list = new ArrayList<Integer>();
	        Stack<Node> st = new Stack<Node>();
	        if(root != null) st.push(root);
	        while(! st.isEmpty()){
	            root = st.pop();
	            list.add(root.val);
	            for(Node node : root.children) {
	                st.push(node);
	                
	        }
	    }
	        Collections.reverse(list);
	        return list;
	}
	}
}
