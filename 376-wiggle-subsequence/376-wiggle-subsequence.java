class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        int up = 1, down = 1;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]) // up hill case
                up = down + 1;
            else if(nums[i] > nums[i + 1]) // down hill case
                down = up + 1;
        }
        return Math.max(up, down);
    }
    // Time : O(n)
    // Space : O(1);
    // https://www.youtube.com/watch?v=iJIAPtd9Z9s
}