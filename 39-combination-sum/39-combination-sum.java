class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        combinations(candidates, 0, target, new ArrayList<>(), ans);
        
        return ans;
    }
    
    public void combinations(int[] arr, int index, int target, List<Integer> list, List<List<Integer>> ans){
        
        if(index == arr.length){
            if(target == 0)
                ans.add(new ArrayList<>(list));    
            return;
        }
        
        if(arr[index] <= target){
            list.add(arr[index]);
            combinations(arr, index, target - arr[index], list, ans);
            list.remove(list.size() - 1);
        }
        combinations(arr, index + 1, target, list, ans);
    }
}