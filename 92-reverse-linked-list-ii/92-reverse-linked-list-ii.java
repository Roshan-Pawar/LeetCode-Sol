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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        if(head == null) return null;
        
        ListNode curr = head, prev = null;
        
        for(int i = 0; curr != null && i < left - 1; i++){
            prev = curr;
            curr = curr.next;
        }
        
        ListNode last = prev, newEnd = curr;
        
        ListNode nxt = curr.next;
        
        for(int i = 0; curr != null && i < right - left + 1; i++){
            curr.next = prev;
            prev = curr;
            curr = nxt;
            if(nxt != null)
                nxt = nxt.next;
        }
        if(last != null)
            last.next = prev;
        else
            head = prev;
        newEnd.next = curr;
        return head;
    }
}