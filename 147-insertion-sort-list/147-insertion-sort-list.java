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
    public ListNode insertionSortList(ListNode head) {
        ListNode preHead = new ListNode(head.val - 1, head);
        if(head == null && head.next == null)
            return head;
        
        ListNode curr = head.next;
        ListNode pre = head;
        
        while(curr != null){
            if(curr.val < pre.val){
                ListNode temp = preHead.next;
                ListNode preTemp = preHead;
                while(temp != null && curr.val > temp.val){
                    preTemp = preTemp.next;
                    temp = temp.next;
                }
                
                ListNode copyCurr = curr;
                pre.next = curr.next;
                curr = curr.next;
                
                preTemp.next = copyCurr;
                copyCurr.next = temp;
            }
            else{
                pre = curr;
                curr = curr.next;
            }
        }
        return preHead.next;
    }
}












