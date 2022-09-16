class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 0, res = 1;
        long totalSum = 0;
        
        while(r < nums.length){
            totalSum += nums[r];
            while(!((totalSum + k) >= ((r - l + 1) * nums[r]))){
                totalSum -= nums[l];
                l++;
            }
            res = Math.max(res, (r - l + 1));
            r++;
        }
        return res;
    }
    // TC : O(n log n)
}