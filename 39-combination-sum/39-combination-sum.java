class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }
    
    public void sum(int[] arr, int index, int target, List<Integer> list,List<List<Integer>> ans){
        if (target < 0 ) return;
        
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = index; i < arr.length; i++){
            list.add(arr[i]);
            sum(arr, i, target - arr[i], list, ans);
            list.remove(list.size() - 1);
        }
    }
}