class Solution {
    public int[] findBall(int[][] grid) {
        int[] ans = new int[grid[0].length];
        
        for(int i = 0; i < grid[0].length; i++){
            ans[i] = findBallDfs( 0, i, grid);
        }
        return ans;
    }
    
    public int findBallDfs(int row, int col, int[][] grid){
        if(row == grid.length)
            return col;
        int nextCol = col + grid[row][col];
        // Check for the next step does not collide to borders of grid or having different val from prev
        if(nextCol < 0 || nextCol > grid[0].length - 1 || grid[row][col] != grid[row][nextCol])
            return -1;
        return findBallDfs(row + 1, nextCol, grid);
    }
    // TC : O(m * n)  SC : O(m)
}