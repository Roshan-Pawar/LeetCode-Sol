class Solution { // Self Explanatory sort + 2 pointer's
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = nums[0] + nums[1] + nums[n - 1]; // assume the sum as answer
        
        for(int first = 0; first < n - 2; first++){
            int second = first + 1, last = n - 1; 
            
            while(second < last){
                int currSum = nums[first] + nums[second] + nums[last];
                
                if(currSum == target) return currSum;
                
                if(currSum > target){
                    last--;
                } else {
                    second++;
                }
                
                if(Math.abs(currSum - target) < Math.abs(sum - target)){
                    sum = currSum;
                }
            }
        }
        return sum;
    }
    // TC : O(n ^ 2)
}