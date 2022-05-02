class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        
        while(i < j){
            if(nums[i] % 2 > nums[j] % 2){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[i] % 2 == 0)
                i++;
            if(nums[j] % 2 == 1)   
                j--;
        }
        return nums;
    }
}
// time O(n)
// space O(1) In place sorting using quick sort