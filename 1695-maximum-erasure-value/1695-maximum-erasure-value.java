class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max = 0, curr = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int l = 0, r = 0; r < nums.length; r++){
            while(!set.add(nums[r])){
            curr -= nums[l];
            set.remove(nums[l++]);
            }
            curr += nums[r];
            max = Math.max(max, curr);
        }
        return max;
    }
}