class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewls = jewels.toCharArray();
        char[] stone = stones.toCharArray();
        int ans = 0;
        
        for(int i = 0; i < jewls.length; i++){
            for(int j = 0; j <stone.length; j++){
                if(jewls[i] == stone[j])
                    ans++;
            }
        }
        return ans;
    }
    // TC : O(n^2) & SC : O(n)
}