class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        // count frequency of every unique character
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        // Add all unique char of 's' int ArrayList
        List<Character> charList = new ArrayList<>(freq.keySet());
        // Sort list elements in decending order on basis of ther freq int string 's'
        charList.sort((char1, char2) -> freq.get(char2) - freq.get(char1));
        
        StringBuilder ans = new StringBuilder();
        for(char ch : charList){
            for(int i = 0; i < freq.get(ch); i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    // TC & SC : O(n)
}