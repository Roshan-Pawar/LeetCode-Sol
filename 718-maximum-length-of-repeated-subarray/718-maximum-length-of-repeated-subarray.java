class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int ans = 0;
        
        for(int i = 0; i < nums1.length + nums2.length; i++){
            int num1 = Math.max(0, nums1.length - 1 - i);
            int num2 = Math.max(0, i - (nums2.length - 1));
            
            int numMatches = 0;
            
            for(int idx1 = num1, idx2 = num2; idx1 < nums1.length && idx2 < nums2.length; idx1++, idx2++){
                numMatches = nums1[idx1] == nums2[idx2] ? numMatches + 1 : 0;
                ans = Math.max(ans, numMatches);
            }
        }
        return ans;
    }
    // Sliding window see notes
}