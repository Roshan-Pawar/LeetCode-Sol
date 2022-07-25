class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int targetFreq = 0, lessThanTarget = 0;
        
        for(int num : nums){
            if(num == target)
                targetFreq++;
            if(num < target)
                lessThanTarget++;
        }
        
        for(int i = lessThanTarget; i < (lessThanTarget + targetFreq); i++){
            list.add(i);
        }
        return list;
    }
    // TC : O(n) SC : O(1)
}