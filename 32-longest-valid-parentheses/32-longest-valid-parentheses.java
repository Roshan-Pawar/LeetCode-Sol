class Solution {
    public int longestValidParentheses(String s) {
        int open = 0, close = 0;
        int max = 0;
        
        // 0 --> N
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') open++;
            else close++;
            
            if(open == close){
                int len = open + close;
                max = Math.max(max, len);   
            }
            else if(close > open){
                open = close = 0;
            }
        }
        
        // N --> 0
        open = close = 0;
        for(int i = s.length() - 1; i >= 0; i--){
             char ch = s.charAt(i);
            if(ch == '(') open++;
            else close++;
            
            if(open == close){
                int len = open + close;
                max = Math.max(max, len);   
            }
            else if(close < open){
                open = close = 0;
            }
        }
        return max;
    }
    // TC : O(n) & SC : O(1)
}