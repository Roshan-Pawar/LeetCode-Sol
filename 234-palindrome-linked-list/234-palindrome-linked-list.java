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
    public boolean isPalindrome(ListNode head) {
        ListNode s = head, f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        s.next = reverse(s.next);
        ListNode start = head, mid = s.next;
        while(mid != null){
            if(mid.val != start.val)
                return false;
            start = start.next;
            mid = mid.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        if(head == null)
            return null;
        ListNode prev = null, curr = head, nxt = head.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = nxt;
            if(nxt != null) nxt = nxt.next;
        }
        return prev;
    }
}