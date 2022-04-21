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
        ListNode lenNode = head;
        List<ListNode> node = new ArrayList<>();
        
        while(lenNode != null){
            node.add(lenNode);
            lenNode = lenNode.next;
        }
        int len = node.size();
        
        int temp = node.get(k - 1).val;
        node.get(k - 1).val = node.get(len - k).val;
        node.get(len - k).val = temp;
        
        return head;
    }
}