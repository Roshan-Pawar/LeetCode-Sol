class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] count = new int[1001];
        
        for(int[] arr : items1)
            count[arr[0]] += arr[1];
        for(int[] arr : items2)
            count[arr[0]] += arr[1];
        
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0)
                continue;
            
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add(count[i]);
            ans.add(temp);
        }
        return ans;
    }
}