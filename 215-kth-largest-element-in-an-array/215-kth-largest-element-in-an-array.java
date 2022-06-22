class Solution {
    public int findKthLargest(int[] nums, int k) {
        swap(nums);
        int ans = nums.length - k;
        return nums[ans];
    }
    public void swap(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}