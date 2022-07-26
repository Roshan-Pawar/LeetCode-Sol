class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }

    public String compare(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '#')
                stack.push(c);
            else if(!stack.empty())
                stack.pop();
        }
        return String.valueOf(stack);
    }
}