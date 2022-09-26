class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0, max = 0;
        
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            if(max == i){
                chunks++;
            }
        }
        return chunks;
    }
    // TC : O(n) & SC : O(1)
    // https://leetcode.com/problems/max-chunks-to-make-sorted/discuss/113528/Simple-Java-O(n)-Solution-with-detailed-explanation
}