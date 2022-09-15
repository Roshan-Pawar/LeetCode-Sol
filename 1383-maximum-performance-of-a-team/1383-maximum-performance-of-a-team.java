class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        long MOD = 1_000_000_007;
        int[][] pair = new int[n][2];
        for(int i = 0; i < n; i++){
            pair[i][0] = efficiency[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> b[0] - a[0]);
        
        PriorityQueue<Integer> sped = new PriorityQueue<>();
        
        long speedSum = 0, maxPerformance = 0;
        
        for(int[] p : pair){
            speedSum += p[1];
            sped.offer(p[1]);
            if(sped.size() > k)
                speedSum -= sped.poll();
            maxPerformance = Math.max(maxPerformance, speedSum*p[0]);
        }
        return (int)(maxPerformance % MOD);
    }
    // TC : O(n log n) & SC : O(n)
}