package June23;

public class ReverseLinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	    public ListNode reverseList(ListNode head) {
	       ListNode mynode ;
	        mynode = null;
	        while(head != null){
	            ListNode nextnode = head.next;
	            head.next = mynode;
	            mynode = head;
	            head = nextnode;
	        }
	        return mynode;
	    }
	}
}
