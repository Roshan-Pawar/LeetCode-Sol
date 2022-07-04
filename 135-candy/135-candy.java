class Solution {
    public int candy(int[] ratings) {
        if(ratings.length <= 1) return ratings.length;
        
        int candies = 0, up = 0, down = 0, prevSlope = 0;
        
        for(int i = 1; i < ratings.length; i++){
            //If increasing then 1; if decreasing then -1; if equal then 0.
            int newSlope = (ratings[i] > ratings[i - 1] ? 1
                            : ratings[i] < ratings[i - 1] ? -1
                            : 0);
            
            if((prevSlope > 0 && newSlope == 0) || (prevSlope < 0 && newSlope >= 0)){
                candies += count(up) + count(down) + Math.max(up, down);
                up = 0;
                down = 0;
            }
            
            //Add in up/down if slope is increasing or decreasing respectively. 
            //If it is a plain, add a candy as it is the base case.
            if(newSlope > 0) 
                up++;
            else if(newSlope < 0)
                down++;
            else
                candies++;
            
            prevSlope = newSlope;
        }
        candies += count(up) + count(down) + (Math.max(up, down) + 1);
        return candies;
    }
    
    public int count(int n){
        return (n *(n + 1)) / 2;
    }
    // TC : O(n)
    // SC : O(1)
}