class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(int i = 0; i < operations.length; i++){
            char[] ch = operations[i].toCharArray();
            
            if(ch[0] == '-' || ch[2] == '-'){
                ans--;
            } else {
                ans++;
            }
        }
        return ans;
    }
}