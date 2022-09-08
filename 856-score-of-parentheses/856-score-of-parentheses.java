class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(score * 2, 1);
            }
        }
        return score;
    }
    // TC & SC : O(n) 
}