class Solution {
    public int minDifference(int[] nums) {
        int len = nums.length;
        if(len <= 4)
            return 0;
        
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        
        // First Case : make last 3 equal to smallest
        minDiff = Math.min(minDiff, nums[len - 4] - nums[0]);
        
        // Second Case : make last 2 and first equal to 2nd element
        minDiff = Math.min(minDiff, nums[len - 3] - nums[1]);
        
        //Third Case : make last 1 and first 2 elements to 3rd smallest
        minDiff = Math.min(minDiff, nums[len - 2] - nums[2]);
        
        // Fourth Case : make first 3 elements to largest
        minDiff = Math.min(minDiff, nums[len - 1] - nums[3]);
        
        // return the minimum ans from above 4 cases
        
        return minDiff;
    }
    // Time O(n log n)  For sorting
    // Constant space O(1)
}