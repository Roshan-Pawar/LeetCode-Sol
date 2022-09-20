class Solution {
    public int climbStairs(int n) {
        int[] ans = new int[n + 1];
        if(n <= 3) 
            return n;
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 3;
        
        for(int i = 4; i <= n; i++){
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }
}