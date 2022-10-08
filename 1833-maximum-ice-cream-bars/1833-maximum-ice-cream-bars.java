class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int bars = 0, i = 0;
        
        while(coins >= 0 && i < costs.length){
            if(costs[i] <= coins){
                bars++;
                coins -= costs[i];
            }
            i++;
        }
        return bars;
    }
}