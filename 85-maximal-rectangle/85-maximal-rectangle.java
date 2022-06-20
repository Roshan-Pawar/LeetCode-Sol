class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int maxRect = 0;
        
        int[] arr = new int[m];
        
        for(int i = 0; i < n; i++){
            // Adding values of upper row to the below's every row
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == '1') 
                    arr[j] += 1;
                else
                    arr[j] = 0;
            }
            
            // Calculating maxArea after addition of each row , same as Histogram Problem
            int currArrSize = maxArea(arr);
            maxRect = Math.max(currArrSize, maxRect);
        }
        return maxRect;
    }
    
    // Below function is same that is used to find Histogram max area
    public int maxArea(int[] arr){
        
        int n = arr.length, maxArea = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> s = new Stack<>();
        // Loop to find left small elements index
        for(int i = 0; i < n; i++){
            while(!s.empty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.empty()) left[i] = 0;
            else left[i] = s.peek() + 1;
            s.push(i);
        }
        
        s.clear();
        
        // Loop to find Right small elements index
        for(int i = n - 1; i >= 0; i--){
            while(!s.empty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.empty()) right[i] = n - 1;
            else right[i] = s.peek() - 1;
            s.push(i);
        }
        
        for(int i = 0; i < n; i++){
            maxArea = Math.max(maxArea, arr[i] * (right[i] - left[i] + 1));
        }
        return maxArea;
    }
    /*
    Adding the every row one by one and calculating Nearest Greatest to left & Nearest           Greatest to Right for each addition of array
    
    after NGL & NGR finding the maximum length of Rectangle int calculted array
    
    returning the maximum of all length of rectangles
    */
}

