class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > nums.length / 3){
                if(!ans.contains(num)){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
    // TC & SC : O(n) 
}