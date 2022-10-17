class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> ch = new HashSet<>();
        // Add every char in HashSet 
        for(char currChar : sentence.toCharArray())
            ch.add(currChar);
        // return true if set soze is 26 if less return false
        return ch.size() == 26;
    }
    // TC & SC : O(n)
}