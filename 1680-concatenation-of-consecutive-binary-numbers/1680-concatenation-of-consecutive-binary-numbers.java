class Solution {
    public int concatenatedBinary(int n) {
        int MOD = 1000000007;
        int ans = 0;
        
        for(int i = 1; i <= n; i++){
            String binaryStr = Integer.toBinaryString(i);
            for(char c : binaryStr.toCharArray()){
                int val = (c == '0') ? 0 : 1;
                ans = ((ans * 2) % MOD + val) % MOD;
            }
        }
        return ans;
    }
}