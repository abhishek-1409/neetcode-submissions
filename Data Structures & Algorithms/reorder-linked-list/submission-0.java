/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
         // find middle
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // break list in 2 halves
        ListNode second = slow.next;
        slow.next = null;

        // reverse 2nd half
        ListNode prev = null;
        while(second != null){
            ListNode node = second.next;
            second.next = prev;
            prev = second;
            second = node;
        }

        second = prev;

        // merge both half lists
        ListNode first = head;
        while(second != null){
            ListNode n1 = first.next;
            ListNode n2 = second.next;
            first.next = second;
            second.next = n1;

            first = n1;
            second = n2;
        }

    }
}
