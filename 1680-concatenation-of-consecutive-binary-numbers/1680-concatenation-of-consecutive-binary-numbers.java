class Solution {
    public int concatenatedBinary(int n) {
        long res = 0;
        long MOD = 1000000007;
        
        for(int i = 1; i <= n; i++){
            String binaryStr = Integer.toBinaryString(i);
            res = (res << binaryStr.length()) % MOD;
            res = (res + i) % MOD;
        }
        return (int)(res);
    }
}