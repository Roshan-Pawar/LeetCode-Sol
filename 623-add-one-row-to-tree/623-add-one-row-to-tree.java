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
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode t = new TreeNode(val);
            t.left = root;
            return t;
        }
        addRow(root, val, depth, 1);
        return root;
    }
    
    public void addRow(TreeNode root, int val, int depth, int currDepth){
        if(root == null){
            return;
        }
        if(currDepth == depth - 1){
            TreeNode t = root.left;
            root.left = new TreeNode(val);
            root.left.left = t;
            
            t = root.right;
            root.right = new TreeNode(val);
            root.right.right = t;
        } else {
            addRow(root.left, val, depth, currDepth + 1);
            addRow(root.right, val, depth, currDepth + 1);
        }
        // See notes
    }
}









