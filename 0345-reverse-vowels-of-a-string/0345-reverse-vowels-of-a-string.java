class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        char[] ch = s.toCharArray();
        
        while(start < end){
            
            while(start < s.length() && !isVowel(ch[start])){
                start++;
            } 
            while(end >= 0 && !isVowel(ch[end])){
                end--;
            }
            
            if(start < end){
                swap(ch, start, end);
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||
            ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    
    public void swap(char[] ch, int start, int end){
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
    }
}