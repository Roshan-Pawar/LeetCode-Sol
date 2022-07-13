class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0, count = 0;
        if(s.isEmpty() && t.isEmpty()) return true;
        if(s.isEmpty()) return true;
        if(t.isEmpty()) return false;
        
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }
        if(count == s.length())
            return true;
        return false;
    }
    // TC : O(n)
    // SC : O(1)
}