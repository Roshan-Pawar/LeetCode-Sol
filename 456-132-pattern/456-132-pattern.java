class Solution {
    public boolean find132pattern(int[] nums) {
        int sec_max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = nums.length - 1; i >= 0; i--){
            
            if(nums[i] < sec_max)
                return true;
            
            while(!stack.empty() && stack.peek() < nums[i])
                sec_max = Math.max(stack.pop(), sec_max);
            
            stack.push(nums[i]);
        }
        return false;
    }
}

// O(N) space and time complexity