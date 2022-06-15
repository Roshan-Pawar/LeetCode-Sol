class Solution {
    public String removeKdigits(String num, int k) {
        int size = num.length();
        
        if(k == size) return "0";
        
        Stack<Character> stack = new Stack<>();
        
        int counter = 0;
        while(counter < size){
            while(k > 0 && !stack.empty() && stack.peek() > num.charAt(counter)){
                stack.pop();
                k--;
            } 
            stack.push(num.charAt(counter));
            counter++;
        }
        
        while(k > 0){
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.empty()){
            char curr_char = stack.pop();
            sb.append(curr_char);
        }
        sb.reverse();  
        
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}












