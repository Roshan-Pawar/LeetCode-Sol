class Solution {
    public boolean checkIfPangram(String sentence) {
        // Check for every ch in alphabets
        for(int i = 0; i < 26; i++){
            char ch = (char) ('a' + i);
            // if ch contains in sentence then it will return positive index number
            // -1 means ch does not contain in sentence
            if(sentence.indexOf(ch) == -1) return false;
        }
        return true;
    }
    // TC : O(n)
}