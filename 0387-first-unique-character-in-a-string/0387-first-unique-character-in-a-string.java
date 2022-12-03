class Solution {
    public int firstUniqChar(String s) {
        int[] freqArr = new int[26];
        
        for(char ch : s.toCharArray()){
            freqArr[ch - 'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(freqArr[ch - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
    // TC & SC : O(n)
}