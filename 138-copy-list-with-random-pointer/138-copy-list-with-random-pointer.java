class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        
        while(curr != null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        
        for(Node key : map.keySet()){
            Node newNode = map.get(key);
            newNode.next = map.get(key.next);
            newNode.random = map.get(key.random);
        }
        return map.get(head);
    }
    // TC & SC : O(n)
}