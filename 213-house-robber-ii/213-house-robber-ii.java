class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        
        int[] withOne = new int[n];
        int[] withoutOne = new int[n];
        
        for(int i = 0; i < n; i++){
            if(i != 0)
                withoutOne[i] = nums[i];
            if(i != n - 1)
                withOne[i] = nums[i];
        }
        int ans = Math.max(findMax(withOne), findMax(withoutOne));
        return ans;
    }
    
    // this function is same as house robber question
    public int findMax(int[] arr){
        int prev = 0, curr = 0;
        
        for(int num : arr){
            int temp = curr;
            curr = Math.max(prev + num, curr);
            prev = temp;
        }
        return Math.max(prev, curr);
    }
    // TC : O(n)
    // SC : O(n)
}