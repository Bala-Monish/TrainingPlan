package June23;

public class FindNodeOnCloneTree {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

	class Solution {
	   public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
	        if (original == null) return null;
	        if (original.val == target.val) return cloned; // check if current node is what we are looking for
	        TreeNode res = getTargetCopy(original.left, cloned.left, target); // go left in both trees
	        if (res != null) return res;
	        return getTargetCopy(original.right, cloned.right, target); // go right in both trees
	    }
	}
}