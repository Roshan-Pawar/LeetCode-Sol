class Solution {
    public int[][] generateMatrix(int n) {
        int r1 = 0, r2 = n - 1;
        int c1 = 0, c2 = n - 1;
        
        int[][] arr = new int[n][n];
        int val = 1;
        
        while(r1 <= r2 && c1 <= c2){
            
            //Moving Left To right
            for(int c = c1; c <= c2; c++)
                arr[r1][c] = val++;
            
            //Moving Down
            for(int r = r1 + 1; r <= r2; r++)
                arr[r][c2] = val++;
            
            //Moving Right To left
            //Moving up
            
            if(r1 < r2 && c1 < c2){
                //Move right to left
                for(int c = c2 - 1; c > c1; c--)
                    arr[r2][c] = val++;
                
                //Move Upward
                for(int r = r2; r > r1; r--)
                    arr[r][c1] = val++;
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return arr;
    }
}