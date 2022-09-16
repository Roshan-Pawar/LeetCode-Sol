class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int j = nums.length - 1;
        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        } 
        if(nums[0] != nums[1] - 1 && nums[0] != nums[1])
            list.add(nums[0]);
        if(nums[j] != nums[j - 1] + 1 && nums[j] != nums[j - 1])
            list.add(nums[j]);
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1] && nums[i] != nums[i-1] +1 && nums[i] != nums[i+1] -1)
                list.add(nums[i]);
        }
        return list;
    }
    // TC : O(n log n) & SC : O(n)
}