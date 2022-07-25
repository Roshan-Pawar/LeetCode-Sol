class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        
        return new int[] {start, end};
    }
    
    public int search(int[] arr, int target, boolean isStartIndex){
        int start = 0, end = arr.length - 1, ans = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else{
                ans = mid;
                if(isStartIndex) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
    // TC : O(log n) Binary Search
}