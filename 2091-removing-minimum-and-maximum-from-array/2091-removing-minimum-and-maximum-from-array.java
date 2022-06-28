class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0, max = 0;
        int n = nums.length;
        
        // Storing the index of Min and Max element in the array 
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[max])
                max = i;
            else if(nums[i] < nums[min])
                min = i;
        }
        // getting min deletions required from back
        int back = Math.max(n - min, n - max);
        // getting min deletions required from front
        int front = Math.max(max + 1, min + 1);
        // addition of both minimum values of front and back 
        int both = Math.min(n - min, min + 1) + Math.min(n - max, max + 1);
        
        // as said in question returning the minimum deletions required
        return Math.min(Math.min(back, front),both);
    }
    
    // Time : O(N) reqired to store index of min and max in array using traversing 
}