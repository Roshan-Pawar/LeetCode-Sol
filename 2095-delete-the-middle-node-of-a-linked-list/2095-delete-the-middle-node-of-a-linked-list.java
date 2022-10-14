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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode pointer1 = head, pointer2 = head;
        int length = 0;
        // Finding length of LinkedList  
        while(pointer1 != null){
            length++;
            pointer1 = pointer1.next;
        }
        // getting pointer2 before one node of mid
        int mid = length / 2;
        
        for(int i = 0; i < mid - 1; i++){
            pointer2 = pointer2.next;
        }
        pointer2.next = pointer2.next.next;
        return head;
    }
    // TC : O(n)
}