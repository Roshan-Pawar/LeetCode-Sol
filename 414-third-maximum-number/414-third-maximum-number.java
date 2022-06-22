class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] > second && nums[i] < first){
                third = second;
                second = nums[i];
            }
            else if(nums[i] > third && nums[i] < second){
                third = nums[i];
            }
        }
        return (int) (third == Long.MIN_VALUE ? first : third);
    }
}