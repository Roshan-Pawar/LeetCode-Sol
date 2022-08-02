class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, lo = matrix[0][0], hi = matrix[n - 1][n - 1];
        
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            int count = findIndex(matrix, mid);
            if(count < k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
    
    public int findIndex(int[][] matrix, int target){
        int k = 0, n = matrix.length, i = n - 1, j = 0;
        
        while(i >= 0 && j < n){
            if(matrix[i][j] > target) i--;
            else{
                k += i + 1;
                j++;
            }
        }
        return k;
    }
    // TC : O(n) SC : O(1)
}