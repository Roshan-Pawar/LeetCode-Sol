class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack <Integer> s = new Stack<>();
        
        for(int i = 2 * nums.length - 1; i >= 0; --i){
            while(!s.empty() && nums[s.peek()] <= nums[i % nums.length]){
                s.pop();
            }
            res[i % nums.length] = s.empty() ? -1 : nums[s.peek()];
            s.push(i % nums.length);
        }
        return res;
    }
}