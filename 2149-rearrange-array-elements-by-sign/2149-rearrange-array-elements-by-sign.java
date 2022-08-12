class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length, pos = 0, neg = 0;
        int[] posArr = new int[n / 2];
        int[] negArr = new int[n / 2];
        
        for(int i = 0; i < n; i++){
            if(nums[i] >= 0){
                posArr[pos] = nums[i];
                pos++;
            }else{
                negArr[neg] = nums[i];
                neg++;
            }
        }
        int i = 0;
        pos = 0; neg = 0;
        while(i < n){
            if(i % 2 == 0 && pos < posArr.length){
                nums[i] = posArr[pos];
                pos++;
            } else if (i % 2 != 0 && neg < negArr.length){
                nums[i] = negArr[neg];
                neg++;
            }
            i++;
        }
        return nums;
    }
}