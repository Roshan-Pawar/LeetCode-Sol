class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        
        for(int i : position){
            if(i % 2 == 0)
                even++;
            else
                odd++;
        }
        return Math.min(even, odd);
    }
    /* Just move the elments of even positions to 0 and elements of odd positions to 1 
     This will do not cost us anything as mentioned in the question
     after this return the minimum steps required to move the 0th position stack to 1        OR 
     1st position stack to 0th position
     */
    
    // Time : O(n) 
    // Space : O(1)
}