class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!store.contains(nums[i]))
                store.add(nums[i]);
            else
                return true;
        }
        return false;
    }
}