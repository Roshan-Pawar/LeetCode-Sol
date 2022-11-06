class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0, sum = 0;
        int i = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                while(set.contains(num)){
                    set.remove(nums[i]);
                    sum -= nums[i];
                    i++;
                }
                set.add(num);
                sum += num;
            } else if(set.size() < k && !set.contains(num)){
                set.add(num);
                sum += num;
            } if(set.size() == k){
                max = Math.max(max, sum);
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }
        return max;
    }
    //  TC & SC : O(n)
}