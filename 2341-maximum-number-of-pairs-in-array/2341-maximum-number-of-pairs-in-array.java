class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pair = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                nums[i] = -1;
                nums[i - 1] = -1;
                pair++;
            }
        }
        return new int[] {pair, nums.length - (2 * pair)};
    }
    // TC : O(n log n)  SC : O(2)
}