class Solution {
    public int minCost(String colors, int[] neededTime) {
        char c = '*';
        int costP = 0, ans = 0;
        
        for(int i = 0; i < colors.length(); i++){
            if(colors.charAt(i) == c){
                if(costP < neededTime[i]){
                    ans += costP;
                    costP = neededTime[i];
                }else{
                    ans += neededTime[i];
                }
            }
            else{
                c = colors.charAt(i);
                costP = neededTime[i];
            }
        }
        return ans;
    }
    // TC : O(n)
}