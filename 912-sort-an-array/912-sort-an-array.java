class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    
    public int[] mergeSort(int[] nums, int start, int end){
        if(end == start){
            return new int[]{nums[start]};
        }
        // Split the two array and merge them
        int mid = (start + end) / 2;
        int[] left = mergeSort(nums, start, mid);
        int[] right = mergeSort(nums, mid + 1, end);
        return merge(left, right);
    }
    
    public int[] merge(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        if(i < arr1.length){
            for(; i < arr1.length; i++, k++){
                ans[k] = arr1[i];
            }
        }
        if(j < arr2.length){
            for(; j < arr2.length; j++, k++){
                ans[k] = arr2[j];
            }
        }
        return ans;
    }
    // Merge sort
}