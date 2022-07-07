class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int ans[] = new int[nums.length];
        int temp[] = nums.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
        }
        
        for(int i = 0; i < temp.length; i++){
            ans[i] = map.get(temp[i]);
        }
        return ans;
    }
    // TC : O(n logn)  for sorting the array
    // SC : O(n)
}