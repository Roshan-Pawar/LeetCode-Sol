class Solution {
    public String reverseWords(String s) {
        int lastSpace = -1;
        char[] chArr = s.toCharArray();
        
        for(int startIndex = 0; startIndex <= chArr.length; startIndex++){
            if(startIndex == chArr.length || chArr[startIndex] == ' '){
                int start = lastSpace + 1;
                int end = startIndex - 1;
                reverse(chArr, start, end);
                lastSpace = startIndex;
            }
        }
        return new String(chArr);
    }
    
    public void reverse(char[] chArr, int start, int end){
        while(start < end){
            char temp = chArr[start];
            chArr[start] = chArr[end];
            chArr[end] = temp;
            start++;
            end--;
        }
    }
    // TC : O(n) SC : O(1)
}