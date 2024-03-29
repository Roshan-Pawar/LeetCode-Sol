class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        
        return nums;
    }
    // TC : O(n) 
    // SC : o(1)
}