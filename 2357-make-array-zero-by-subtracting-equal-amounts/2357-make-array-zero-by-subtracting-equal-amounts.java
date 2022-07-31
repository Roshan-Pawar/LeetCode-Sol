class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums)
            if(num > 0)
                set.add(num);
        return set.size();
    }
    // returning number of unique elements greater than 0
    // TC : O(n)  SC O(n)
}