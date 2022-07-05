class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        
        // Add all the elements in the set we don't require the duplicate ones
        for(int i : nums) set.add(i);
        
        for(int i : nums){
            // maxLen for current "i" in nums will initially 1 and 
            int maxLen = 1, previousVal = i - 1, nextVal = i + 1;
            // Suppose the "i" is 4 then its previous sequence val will be 3 and next value will be 5 

            // If the previous value contains in the set then increment the length of sequence 
            // and remove that val from set and also decrement the prev val to find next element of sequence
            while(set.contains(previousVal)){
                maxLen++;
                set.remove(previousVal--);
            }
            
            // If the next val contains in the set then increment the len and remove that val and 
            // Increment that value to find next sequence of it
            while(set.contains(nextVal)){
                maxLen++;
                set.remove(nextVal++);
            }
            res = Math.max(res, maxLen);
        }
        return res;
    }
    // TC : O(n)
    // SC : O(n)
}