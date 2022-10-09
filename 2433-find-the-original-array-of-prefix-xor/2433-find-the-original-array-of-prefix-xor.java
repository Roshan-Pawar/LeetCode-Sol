class Solution {
    public int[] findArray(int[] pref) {
        int curr = pref[0];
        // just do XOR of curr and pre element
        for(int i = 1; i < pref.length; i++){
            pref[i] = curr ^ pref[i];
            curr = curr ^ pref[i]; // to get original version of element (before the XOR)
        }
        return pref;
    }
    // TC : O(n)
}