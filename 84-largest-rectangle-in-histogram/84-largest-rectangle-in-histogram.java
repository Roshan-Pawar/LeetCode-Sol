class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        
        // Loop to find left small elements index
        for(int i = 0; i < n; i++){
            while(!s.empty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.empty()) left[i] = 0;
            else left[i] = s.peek() + 1;
            s.push(i);
        }
        
        s.clear();
        
        // Loop to find Right small elements index
        for(int i = n - 1; i >= 0; i--){
            while(!s.empty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.empty()) right[i] = n - 1;
            else right[i] = s.peek() - 1;
            s.push(i);
        }
        
        int maxArea = 0;
        // Check for maxArea using array of left and right small of "i"
        for(int i = 0; i < n; i++){
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] + 1));
        }
        return maxArea;
        
        // Time and Space O(N)
    }
}
