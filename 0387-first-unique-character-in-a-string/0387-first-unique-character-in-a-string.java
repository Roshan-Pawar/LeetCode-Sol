class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        // Count freq for every unique char
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        
        for(int i = 0; i < s.length() ; i++){
            if(freq.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    // TC & SC : O(n)
}