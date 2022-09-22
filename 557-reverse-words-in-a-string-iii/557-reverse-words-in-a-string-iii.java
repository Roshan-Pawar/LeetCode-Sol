class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int lastIndex = -1;
        
        for(int startIndex = 0; startIndex < s.length(); startIndex++){
            if(startIndex == s.length() - 1 || s.charAt(startIndex) == ' '){
                int reverseIndex = (startIndex == s.length() - 1) ? startIndex : startIndex - 1;
                for(; reverseIndex > lastIndex; reverseIndex--){
                    sb.append(s.charAt(reverseIndex));
                }
                if(startIndex != s.length() - 1){
                        sb.append(' ');
                }
                lastIndex = startIndex;
            }
        }
        return sb.toString();
    }
    // TC : O(n) SC : O(1)
}