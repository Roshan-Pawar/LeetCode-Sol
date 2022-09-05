class Solution {
    List<Integer> res = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        if(n == 1){
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        }
        for(int i = 1; i < 10; i++){
            dfs(i, n-1, k);
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    
    public void dfs(int currNum, int digLeft, int diff){
        if(digLeft == 0){
            res.add(currNum);
            return;
        }
        int lastDig = currNum % 10;
        if(lastDig + diff <= 9){
            dfs(currNum * 10 + lastDig + diff, digLeft - 1, diff);
        }
        if(lastDig - diff >= 0 && diff != 0){
            dfs(currNum * 10 + lastDig - diff, digLeft - 1, diff);
        }
    }
}