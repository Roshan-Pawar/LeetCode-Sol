class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        ans[n / 2] = 0;
        
        for(int i = 0; i < n/2; i++){
            ans[i] = i + 1; // Inserting from start
            ans[n - 1 - i] = -(ans[i]); // Inserting from end
        }
        return ans;
    }
}