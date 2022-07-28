class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char arrs[] = s.toCharArray();
        char arrt[] = t.toCharArray();
        // Convert the String into array then sort it and compare every element
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        
        for(int i = 0; i < arrs.length; i++){
            if(arrs[i] != arrt[i]) return false;
        }
        return true;
    } 
    // TC : O(n log n)  SC : O(n)
}