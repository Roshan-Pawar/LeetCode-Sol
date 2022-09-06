class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') stack.push(i);
            else{
                stack.pop();
                if(stack.empty()) stack.push(i);
                else{
                    int len = i - stack.peek();
                    max = Math.max(max, len);
                } 
            }
        }
        return max;
    }
    // TC & SC : O(n)
}