class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int res = 0;
        
        for(int i = 0; i < nums.length; i++){
            res += nums[i];
            ans[i] = res;
        }
        return ans;
    }
}