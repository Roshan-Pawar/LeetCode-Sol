class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        
        if(heights == null || m == 0 || n == 0) return ans;
        
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        // loop for row calculations
        for(int i = 0; i < m; i++){
            dfs(i, 0, pacific, heights, 0); 
            dfs(i, n - 1, atlantic, heights, 0);
        }
        // loop for col calculation
        for(int j = 0; j < n; j++){
            dfs(0, j, pacific, heights, 0);
            dfs(m - 1, j, atlantic, heights, 0);
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(atlantic[i][j] && pacific[i][j]){
                    List<Integer> index = new ArrayList<>();
                    index.add(i);
                    index.add(j);
                    ans.add(index);
                }
            }
        }
        return ans;
    }
    
    public void dfs(int i, int j, boolean[][] canReach, int[][] heights, int prevHeigh){
        if(i < 0 || j < 0 || i >= heights.length || j >= heights[0].length || canReach[i][j] || heights[i][j] < prevHeigh) return;
        
        canReach[i][j] = true;
        
        dfs(i + 1, j, canReach, heights, heights[i][j]);
        dfs(i - 1, j, canReach, heights, heights[i][j]);
        dfs(i, j + 1, canReach, heights, heights[i][j]);
        dfs(i, j - 1, canReach, heights, heights[i][j]);
        
    }
}












