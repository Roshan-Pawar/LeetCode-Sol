class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int test = minutesToTest / minutesToDie;
        int ans = 0;
        
        while(Math.pow(test + 1, ans) < buckets){
            ans++;
        }
        return ans;
    }
}