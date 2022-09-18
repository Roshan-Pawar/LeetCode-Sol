class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, numsProduct = 1, zeroCount = 0;
        
        for(int num : nums){
            if(num == 0)
                zeroCount++;
            else 
                numsProduct *= num;
        }
        
        for(int i = 0; i < n; i++){
            if(zeroCount == 0){
                nums[i] = numsProduct / nums[i];
            } else if (zeroCount == 1){
                nums[i] = nums[i] != 0 ? 0 : numsProduct;
            } else {
                nums[i] = 0;
            }
        }
        return nums;
    }
}