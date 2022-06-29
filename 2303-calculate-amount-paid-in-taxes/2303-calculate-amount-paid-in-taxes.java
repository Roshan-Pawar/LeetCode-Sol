class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int prev = 0;
        double ans = 0;
        
        for(int i = 0; i < brackets.length; i++){
            if(income <= brackets[i][0]){
                ans += (income - prev) * (brackets[i][1] * 0.01);
                return ans;
            }
            else{
                ans += (brackets[i][0] - prev) * (brackets[i][1] * 0.01);
                prev = brackets[i][0];
            }
        }
        return ans;
    }
    // Time : O(N)
    // Space : O(1)
}