class Solution { // self explanatory code
    public boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(num < max1)
                max1 = num;
            else if (num > max1 && num < max2)
                max2 = num;
            else if (num > max1 && num > max2)
                return true;
        }
        return false;
    }
    // TC : O(n)
}