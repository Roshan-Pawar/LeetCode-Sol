class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        long[] result = new long[n];
        
        for(int i = 0; i < n; i++){
            result[edges[i]] += i;
        }
        int maxAns = 0;
        for(int i = 0; i < n; i++){
            if(result[i] > result[maxAns])
                maxAns = i;
        }
        return maxAns;
    }
}