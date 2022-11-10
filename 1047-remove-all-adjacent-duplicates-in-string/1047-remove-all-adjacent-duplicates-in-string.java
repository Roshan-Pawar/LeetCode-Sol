class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        // Here, stringBuilder will act as a stack 
        for(int i = 0; i < s.length(); i++){
            // check if the last char of sb is equal to the current char in String 's'
            if(sb.length() != 0 && sb.charAt(sb.length() - 1) == s.charAt(i)){
                sb.deleteCharAt(sb.length() - 1);
                // If it is equal then delete that char also from StringBuilder
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    // TC & SC : O(n)
}