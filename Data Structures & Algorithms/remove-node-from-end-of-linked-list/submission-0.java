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
        int len = 0;
        ListNode curr = head;
        while (curr != null){
            len++;
            curr = curr.next;
        }
        curr = head;
        len = len-n;
        if (len == 0){
            curr = curr.next;
            return curr;
        }
        for (int i = 0; i<len-1; i++)
            curr = curr.next;
        curr.next = curr.next.next;
        return head;
        
    }
}
