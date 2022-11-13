class Solution {
    public String reverseWords(String s) {
        // add words in String s to the array spliting between the space
        String[] sArr = s.split(" "); 
        String ans = "";
        
        for(String str : sArr){
            // if the str[i] is empty after triming space then skip that str[i]
            if(str.trim().isEmpty())
                continue;
            // else add it to the ans
            ans = str + " " + ans;
        }
        // we have to trim final ans because it will contain extra space at the end of sentence 
        return ans.trim();
    }
//     TC & SC : O(n) N = length of 'sArr' array
}