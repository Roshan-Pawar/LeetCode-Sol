class Solution {
    public int longestContinuousSubstring(String s) {
        int max = 1, count = 1;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i)+1 == s.charAt(i+1)){
                count++;
            } else {
                count = 1;
            }
            if(max < count){
                max = count;
            }
        }
        return max;
    }
}