class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        
        int res = 1;
        int maxLen = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                if(nums[i] == nums[i - 1] + 1)
                    maxLen++;
                else{
                    res = Math.max(res, maxLen);
                    maxLen = 1;
                }
            }
        }
        return Math.max(res, maxLen);
    }
    // TC : O(n logn) for sorting the array
    // SC : O(1)
}