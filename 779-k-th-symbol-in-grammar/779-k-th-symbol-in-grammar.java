class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1 && k == 1){
            return 0;
        }
        int mid = (int) (Math.pow(2, n - 1) / 2);
        if(k <= mid){
           return kthGrammar(n - 1, k);
        } 
        else
           return kthGrammar(n - 1, k - mid) == 0 ? 1 : 0;
    }
    // TC : O(n + k)
    // SC : O(1) if we do not consider recursion stack
}