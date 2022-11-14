class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int s = 0, e = nums.length - 1;
        
        while(s < e){
            set.add(nums[s] + nums[e]);
            s++;
            e--;
        }
        return set.size();
    }
}