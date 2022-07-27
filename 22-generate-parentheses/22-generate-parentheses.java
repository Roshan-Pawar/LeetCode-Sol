class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(n, n, "", list);
        return list;
    }
    
    public void solve(int open, int close, String op, List<String> ans){
        if(open == 0 && close == 0){
            ans.add(op);
            return;
        }
        if(open != 0){
            String op1 = op;
            op1 += '(';
            solve(open - 1, close, op1, ans);
        }
        if(close > open){
            String op2 = op;
            op2 += ')';
            solve(open, close - 1, op2, ans);
        }
    }
}