class Solution {
    public int[] sortedSquares(int[] nums) {
        int sol[] = new int[nums.length];
        
        // 2 Pointer method
        int s = 0, e = nums.length - 1;
        // insert the square of greater number from s and e to the end of solution
        for(int i = e; i >= 0; i--){
            if(Math.abs(nums[e]) > Math.abs(nums[s])){
                sol[i] = nums[e] * nums[e];
                e--;
            } else {
                sol[i] = nums[s] * nums[s];
                s++;
            }
        }
        return sol;
    }
}