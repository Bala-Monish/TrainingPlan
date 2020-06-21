
public class LinkedListMiddle {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	    public ListNode middleNode(ListNode head) {
	        ListNode fast = head;
	        ListNode normal = head;
	        while(fast != null && fast.next != null){
	        	// Using a 2x pointer  and a normal one. When the fast one reaches the end,
	        	//the normal one will point to the middle.
	            fast = fast.next.next;
	            normal = normal.next;
	        }
	        return normal;
	    }
	}

