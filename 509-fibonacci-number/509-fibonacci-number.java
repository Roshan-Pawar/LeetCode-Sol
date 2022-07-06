class Solution {
    public int fib(int n) {
        if(n < 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1; // dp[o] = 0 and dp[1] = 1 by default
        
        // will count fibbo for every number till n 
        for(int i = 2; i < n + 1; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    // TC : O(n) 
    // SC : O(n) for dp array
}