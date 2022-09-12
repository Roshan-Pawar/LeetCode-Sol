class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length - 1, score = 0;
        
        while(i <= j){
            if(power >= tokens[i]){
                power -= tokens[i++];
                score++;
            } else {
                if(score > 0 && i != j){
                    power += tokens[j];
                    score--;
                }
                j--;
            }
        }
        if(score > 0) return score;
        return 0;
    }
    // TC : O(n logn) & SC : O(log n) logn space is used by arrays.sort fun
}