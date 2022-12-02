class Solution { // Self explanatory code
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        Set<Character> set = new HashSet<>();
        
        for(char ch : word1.toCharArray()){
            freq1[ch - 'a']++;
            set.add(ch);
        }
        
        for(char ch : word2.toCharArray()){
            freq2[ch - 'a']++;
            if(!set.contains(ch)){
                return false;
            }
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < 26; i++){
            if(freq1[i] > 0){
                map.put(freq1[i], map.getOrDefault(freq1[i], 0) + 1);
            }
        }
        
        for(int i = 0; i < 26; i++){
            if(freq2[i] > 0){
                map.put(freq2[i], map.getOrDefault(freq2[i], 0) - 1);
                if(map.get(freq2[i]) == 0){
                    map.remove(freq2[i]);
                }
            }
        }
        return map.isEmpty();
    }
    // TC & SC : O(n)
}