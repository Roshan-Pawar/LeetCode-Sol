class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int r = 0, l = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    l = Math.min(l, i);
                    r = Math.max(r, j);
                }
            }
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
}