class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length, ans = -1;
        int minDiff = Integer.MAX_VALUE;
        // Find suffix and preffix sum 
        long[] prefix = new long[n + 1];
        long[] suffix = new long[n + 1];
        
        // calculte prefix
        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] + nums[i];
        }
        
        // calculate suffix
        for(int i = n - 1; i >= 0; i--){
            suffix[i] = suffix[i + 1] + nums[i];
        }
        
        for(int index = 0; index < n; index++){
            // left average of current index
            long leftAvg = prefix[index + 1];
            leftAvg /= (index + 1);
            
            // right average of current index
            long rightAvg = suffix[index + 1];
            // only if index have some space left in right side
            if(index != n - 1){
                rightAvg /= (n - index - 1);
            }
            int currIndexDiff = (int) Math.abs(leftAvg - rightAvg);
            if(currIndexDiff < minDiff){
                minDiff = currIndexDiff;
                ans = index;
            }
        }
        return ans;
    }
    // TC & SC : O(n)
}