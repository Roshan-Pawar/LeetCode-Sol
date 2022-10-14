/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */  // Using 1 Stack
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<>();
        // Stack<TreeNode> s2 = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        if(root == null) return list;
        s1.push(root);
        
        while(!s1.isEmpty()){
            root = s1.pop();
            // s2.push(root);
            list.add(root.val);
            if(root.left != null) s1.push(root.left);
            if(root.right != null) s1.push(root.right);
        }
        
        // while(!s2.isEmpty()){
        //     list.add(s2.pop().val);
        // }
        Collections.reverse(list);
        return list;
    }
    // TC : O(n) & SC : O(n)
}