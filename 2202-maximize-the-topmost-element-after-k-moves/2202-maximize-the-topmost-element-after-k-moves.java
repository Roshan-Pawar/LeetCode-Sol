class Solution {
    public int maximumTop(int[] nums, int k) {
        int max = -1;
        int maxTraverse = Math.min(k + 1, nums.length);
        
        // if length is 1 and k is odd then its useless to add and remove just return -1
        // otherwise if k is even then simply return 1st element
        if(nums.length == 1){
            if(k % 2 == 0)
                return nums[0];
            else
                return max;
        }
        // update the max val till maxTraverse 
        for(int i = 0; i < maxTraverse; i++){
            if(nums[i] > max && (i !=  k - 1))
                max = nums[i];
        }
        return max;
    }
    
    // TC : O(n)
    // SC : o(1)
}