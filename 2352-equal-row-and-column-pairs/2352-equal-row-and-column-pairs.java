class Solution {
    public int equalPairs(int[][] grid) {
        // TransPose of matrix
        int n = grid.length;
        int[][] transpose = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                transpose[j][i] = grid[i][j];
            }
        }
        // Check for same row's
        int ans = 0;
        for(int[] row : grid){
            for(int[] col : transpose){
                if(Arrays.equals(row, col))
                    ans++;
            }
        }
        return ans;
    }
    // TC & SC : O(n*n) 
}