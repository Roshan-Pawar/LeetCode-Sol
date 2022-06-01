class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
        
        
        
        //Time: O(n^2) Accepted solution but it takes too long time.         
        // int n = nums.length;
        //     for(int i = 0; i < n; i++){
        //         int e = nums[i];
        //         for(int j = i+1; j < n; j++){
        //         if(e == nums[j])
        //             return true;
        //         }    
        //     }
        // return false;
    }
}