class Solution {
    public boolean checkPossibility(int[] nums) {
        int pos = -1;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                if(pos != -1){
                    return false;
                }
                 pos = i;
            }
        }
        return pos == -1 || pos == 0 || pos == nums.length - 2 || nums[pos - 1] <= nums[pos + 1] || nums[pos] <= nums[pos + 2];
    }
    // if nums[i] > nums[i + 1] this true for more then 1 time then return false OR check for remaing one of the Conditions
    // TC : O(n)
    // SC : O(1)
    // https://www.youtube.com/watch?v=iL7oSNc3OXA
}