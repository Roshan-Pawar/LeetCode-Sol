class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] ch = new boolean[26];
        // make value true in ch array for every occured character in sentence
        for(Character cha : sentence.toCharArray())
            ch[(int) (cha - 'a')] = true;
        // return false if any index contains false value
        for(boolean tf : ch)
            if(!tf)
                return false;
        return true;
    }
    
}