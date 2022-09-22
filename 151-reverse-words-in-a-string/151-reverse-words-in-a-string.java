class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] sArr = s.split(" ");
        
        for(String str : sArr){
            if(str.trim().isEmpty())
                continue;
            ans = str + " " + ans;
        }
        return ans.trim();
    }
}