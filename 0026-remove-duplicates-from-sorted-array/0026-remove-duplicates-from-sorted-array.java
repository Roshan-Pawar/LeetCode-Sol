class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return 1;
        
        int idx = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}