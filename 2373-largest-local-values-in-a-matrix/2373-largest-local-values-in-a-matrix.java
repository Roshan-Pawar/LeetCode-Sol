class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length - 2][grid.length - 2];
        
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result.length; j++){
                int val = Integer.MIN_VALUE;
                
                for(int row = i; row < i + 3; row++){
                    for(int col = j; col < j + 3; col++){
                        val = Math.max(val, grid[row][col]);
                    }
                }
                result[i][j] = val;
            }
        }
        return result;
    }
}