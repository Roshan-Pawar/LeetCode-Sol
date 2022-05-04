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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        
        for(ListNode l : lists){
            while(l != null){
                list.add(l.val);
                l = l.next;
            }
        }
        Collections.sort(list);
        for(int val : list){
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return head.next;
    }
}

// Creating one ArrayList of all K LinkedList's 
// Sort the ArrayList and make ArrayList to LinkedList and return it
// Time = O(n log n)
// Space = O(n) 








