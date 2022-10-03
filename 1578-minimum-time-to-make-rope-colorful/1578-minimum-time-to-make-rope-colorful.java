class Solution {
    public int minCost(String colors, int[] neededTime) {
        char ch = '.';
        int curr = 0, ans = 0;
        
        for(int i = 0; i < neededTime.length; i++){
            if(colors.charAt(i) == ch){
                if(curr < neededTime[i]){
                    ans += curr;
                    curr = neededTime[i];
                    
                } else {
                    ans += neededTime[i];
                }
            } else {
                ch = colors.charAt(i);
                curr = neededTime[i];
            }
        }
        return ans;
    }
}