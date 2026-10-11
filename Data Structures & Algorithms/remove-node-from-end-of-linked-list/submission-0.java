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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0,head);
        ListNode node = newHead;
        ListNode temp = head;

        while(n-- > 0){
            temp = temp.next;
        }

        while(temp != null){
            node = node.next;
            temp = temp.next;
        }
        node.next = node.next.next;
        return newHead.next;
    }
}
