class Solution {
    public long[] sumOfThree(long num) {
        
        long ans = num / 3;
        long rem = num % 3; 
        
        if(ans == 1 && rem != 0)
            return new long[]{};
        
        long dec = ans - 1;
        long inc = ans + 1;
        long sum = dec + ans + inc;
        
        if(sum == 3 * ans && num == sum)
            return new long[]{dec, ans, inc};
        else
            return new long[]{};
        
        // return new long[]{dec, ans, inc};
    }
    // TC : O(1)
    // SC : O(3)
}