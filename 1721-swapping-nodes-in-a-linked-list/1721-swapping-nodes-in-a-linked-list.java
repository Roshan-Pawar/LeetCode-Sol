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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head, right = head;
        int steps = 0;
        
        while(left != null){
            steps++;
            if(steps == k)
                break;
            left = left.next;
        }
        
        ListNode tempNode = left;
        while(tempNode.next != null){
            tempNode = tempNode.next;
            right = right.next;
        }
        
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        
        return head;
    }
}