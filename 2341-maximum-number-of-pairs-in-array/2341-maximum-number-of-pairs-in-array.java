class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[101];
        
        for(int n : nums){
            arr[n]++;
        }
        
        int[] ans = new int[2]; 
        for(int e : arr){
            ans[0] += e / 2;
            ans[1] += e % 2;
        }
        return ans;
    }
}