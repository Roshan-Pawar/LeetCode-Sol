class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows * cols][2];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int cell = i * cols + j;
                ans[cell][0] = i;
                ans[cell][1] = j;
            }
        }
        
        Arrays.sort(ans,(a, b) -> {
            int box1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int box2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return box1 - box2;
        });
        return ans;
    }
    // notes
}