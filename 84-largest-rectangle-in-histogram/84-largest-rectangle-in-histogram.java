class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0, n = heights.length;
        
        for(int i = 0; i <= n; i++){
            while(!s.empty() && (i == n || heights[s.peek()] >= heights[i])){
                int height = heights[s.peek()];
                s.pop();
                int width;
                if(s.empty()) width = i;
                else width = i - s.peek() - 1;
                maxArea = Math.max(maxArea, width * height);
            }
            s.push(i);
        }
        return maxArea;
    }
    // Time = O(N), Space = O(N)
    // for previous submission of finding left small and right small,  Space = O(3N) because of 2Arrays & 1Stack
    // this approach is compilicated only solve if wants to optimize the previous one.
}