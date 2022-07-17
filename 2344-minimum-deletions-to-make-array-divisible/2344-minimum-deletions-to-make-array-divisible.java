class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int g = numsDivide[0];
        
        for(int i : numsDivide){
            while(i > 0){
                int temp = g % i; // GCD(g, a)
                g = i;
                i = temp;
            }
        }
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(g % nums[i] == 0)
                return i;
        }
        return -1;
    }
}