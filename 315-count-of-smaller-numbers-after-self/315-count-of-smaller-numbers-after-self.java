class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int num : nums)
            list.add(num);
        
        Collections.sort(list);
        
        for(int i = 0; i < nums.length; i++){
            int index = binarySearch(list, nums[i]);
            ans.add(index);
            list.remove(index);
        }
        return ans;
    }
    
    public int binarySearch(List<Integer> list, int index){
        int start = 0, end = list.size() - 1, mid = 0;
        
        while(start <= end){
            mid = start + (end - start) / 2;
            int val = list.get(mid);
            if(val < index) start = mid + 1;
            else end = mid - 1;
        }
        if(list.get(start) == index) return start;
        return mid;
    }
}