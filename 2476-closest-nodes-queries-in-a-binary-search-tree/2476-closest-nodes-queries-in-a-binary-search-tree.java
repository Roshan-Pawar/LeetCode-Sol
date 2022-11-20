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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> nodes = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        inorder(root, nodes);
        
        int maxi = -1, mini = -1;
        int i = 0;
        for(int ele : queries){
            mini = findMin(nodes, ele);
            maxi = findMax(nodes, ele);
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(mini);
            ans.add(maxi);
            result.add(ans);
        }
        return result;
        
    }
    
    public void inorder(TreeNode root, List<Integer> nodes){
        if(root == null) return;
        
        inorder(root.left, nodes);
        nodes.add(root.val);
        inorder(root.right, nodes);
    }
    
    public int findMin(List<Integer> list, int target){
        int ans = -1;
        int s = 0, e = list.size() - 1;
        
        while(s <= e){
            int mid = s + (e - s) / 2;
            
             if(list.get(mid) <= target){
                ans = list.get(mid);
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
    
    public int findMax(List<Integer> list, int target){
        int ans = -1; 
        int s = 0, e = list.size() - 1;
        
        while(s <= e){
            int mid = s + (e - s) / 2;
            
            if(list.get(mid) >= target){
                ans = list.get(mid);
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    // TC : O(n logn) for binary search and for inorder traversal
}