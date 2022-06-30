class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count = 0, mid = nums[nums.length/2];
        for(int num : nums)
            count += Math.abs(mid - num);
        return count;
    }
    // Time : O(nlogn)
    // Space : O(1)
    
    // Sorting the array and filling the gap of remaining elements with mid
    //count =+ nums[i] - mid is required for elements less then mid and
    // similar of elements greater then mid 
}