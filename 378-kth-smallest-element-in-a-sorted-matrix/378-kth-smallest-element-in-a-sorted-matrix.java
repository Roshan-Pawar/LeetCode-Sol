class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int ans[] = new int[matrix.length * matrix[0].length];
        int c = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                ans[c] = matrix[i][j];
                c++;
            }
        }
        Arrays.sort(ans);
        return ans[k - 1];
    }
    // TC & SC : O(n*n)
}