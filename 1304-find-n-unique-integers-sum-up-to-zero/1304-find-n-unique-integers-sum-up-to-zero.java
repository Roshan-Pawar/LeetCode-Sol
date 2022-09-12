class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int start = 1;
        for(int i = 0; i < n / 2; i++){
            ans[i] = start * (-1);
            ans[n - 1 - i] = start;
            start++;
        }
        return ans;
    }
}