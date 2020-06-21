/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
	
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode doubleSpeed = head.next;
        ListNode singleSpeed = head;
        while(doubleSpeed != singleSpeed){
            if(doubleSpeed == null || doubleSpeed.next == null)
                return false;
        singleSpeed = singleSpeed.next;
        doubleSpeed = doubleSpeed.next.next;
        }
       
         return true;
    }
   
}