class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> sign = new Stack<>();
        Stack<Integer> star = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') sign.push(i);
            else if(ch == '*') star.push(i);
            else if(star.empty() && sign.empty() && ch == ')') return false;
            else{
                if(!sign.empty()) sign.pop();
                else if (!star.empty()) star.pop();
                else return false;
            }
        }
        
        while(!sign.empty()){
            if(star.empty()) return false;
            
            if(star.peek() > sign.peek()){
                sign.pop();
                star.pop();
            }
            else return false;
        }
        return true;
    }
    // TC SC : O(n)
}