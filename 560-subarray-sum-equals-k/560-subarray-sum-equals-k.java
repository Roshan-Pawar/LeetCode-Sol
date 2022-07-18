class Solution {
    public int subarraySum(int[] nums, int k) {
        int totalSum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
            int prefixSum = totalSum - k;
            
            if(map.containsKey(prefixSum))
                count += map.get(prefixSum);
            map.put(totalSum, map.getOrDefault(totalSum, 0) + 1);
        }
        return count;
    }
}