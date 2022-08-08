class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : nums){
            int size = list.size();
            if(size == 0 || size > 0 && num > list.get(size - 1)){
                list.add(num);
            }else{
                int index = search(list, num);
                list.set(index, num);
            }
        }
        return list.size();
    }
    
    public int search(ArrayList<Integer> list, int target){
        int start = 0, end = list.size();
        while(start < end){
            int mid = (start + end) / 2;
            if(list.get(mid) < target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}