class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        // Store the number of times char are reapeated 
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        // sort the frequency array
        Arrays.sort(freq);
        
        int deleteCount = 0;
        
        // the maximum frequency allowed is length of S
        int maxAllowed = s.length();
        
        // Iterate over the frequencies in descending order
        for(int i = 25; i >= 0 && freq[i] > 0; i--){
            // Delete characters to make the frequency equal the maximum frequency              allowed
            if(freq[i] > maxAllowed){
                deleteCount += freq[i] - maxAllowed;
                freq[i] = maxAllowed;
            }
            // Update the maximum allowed frequency
            maxAllowed = Math.max(0, freq[i] - 1);
        }
        return deleteCount;
    }
    // time complex O(N + k log k)  K is the maximum possible number of distinct character
    // space O(k)
}