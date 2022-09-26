class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] max = new int[n];
        
        max[0] = arr[0];
        for(int i = 1; i < n; i++){
            max[i] = Math.max(max[i - 1], arr[i]); 
        }
        
        int chunks = 0;
        for(int i = 0; i < n; i++){
            if(max[i] == i)
                chunks++;
        }
        return chunks;
    }
    // TC & SC : O(n)
    // https://leetcode.com/problems/max-chunks-to-make-sorted/discuss/113528/Simple-Java-O(n)-Solution-with-detailed-explanation
}