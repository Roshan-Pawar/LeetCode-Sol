class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        List<Integer> list = new ArrayList<>();
        
        for(int i = start; i <= end; i++){
            if(i != -1)
            list.add(i);
        }
        return list;
    }
    
    public int binarySearch(int[] nums, int target, boolean isFirst){
        int start = 0, end = nums.length - 1, ans = -1;
        Arrays.sort(nums);
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else{
                ans = mid;
                if(isFirst)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    } 
}