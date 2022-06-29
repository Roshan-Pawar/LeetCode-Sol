class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num : nums) arr.add(num);
        
        Collections.sort(arr);
        
        for(int i = 0; i < nums.length; i++){
            int index = binarysearch(arr, nums[i]);
            ans.add(index);
            arr.remove(index);
        }
        return ans;
    }
    
    public int binarysearch(ArrayList<Integer> arr, int target){
        int start = 0;
        int end = arr.size() - 1;
        int mid = 0;
        
        while(start<=end){
            mid = start + ((end - start)/2);
            int val = arr.get(mid);
            if(val<target) start = mid + 1;
            else end = mid - 1;
        }
        if(arr.get(start) == target) return start;
        return mid;
    }
    /*
    Time :O(log N) space : O(N + N) 
        1. picked element from unsorted array "nums" { 5, 2, 6, 1 } we picked "5"
        
        2. searching the element in sorted array "arr" { 1, 2, 5, 6 } so index of 5         in sorted array is 2 ( common sense 2 would be the count of numbers smaller         then 5 ) and there would be double values too so for that we modified the           binary search sending the "start" index instead of "mid"
        
        3. Sending the index in main method, where we collecting the index as an             answer in "ans" arraylist
        
        4. now this part is important, we must have to remove the 5 because we don't         want to count this number when it's time to cound number lesser than 6 ok.
    */
}