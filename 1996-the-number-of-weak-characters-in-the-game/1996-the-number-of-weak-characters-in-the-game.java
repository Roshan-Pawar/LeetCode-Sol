class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        // Sort array with 0th index, if same then desc to 1st index
        Arrays.sort(properties, (a, b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        
        int weakChar = 0, len = properties.length - 1;
        int max = properties[len][1];
        // in for loop skip 1st val of last arr cause already taken in max 
        for(int i = len - 1; i >= 0; i--){ 
            // if current val of attack is less than max then its weak character
            if(properties[i][1] < max){
                weakChar++;
            } else {
                max = properties[i][1];
            } 
        }
        return weakChar;
    }
    // TC : O(n)
}
