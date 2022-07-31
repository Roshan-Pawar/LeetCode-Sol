class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, ans = 0;
        
        while(nums[n - 1] != 0){
            int k = 0;
            while(k < n && nums[k] == 0)
                k++;
            int temp = nums[k];
            for(int i = k; i < n; i++){
                nums[i] -= temp;  
            }
            ans++;
        } 
        return ans;
    }
    // TC : O(n log n) for sorting  SC : O(1)
}
