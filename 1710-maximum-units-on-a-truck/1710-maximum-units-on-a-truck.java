class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Sorting the array with its 2nd Column in decreasing order
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> -o[1]));
        
        int ans = 0, i = 0, n = boxTypes.length;
        
        // loop till trucksize is available and Iterator "i" is less than length 
        while(i < n && truckSize > 0){
            // getting min because no of boxes can exceed the truckSize  
            int max = Math.min(boxTypes[i][0], truckSize);
            // calculating ans 
            ans += max * boxTypes[i][1];
            // Incrementimg i and minimizing truckSize with filled boxes
            i++;
            truckSize -= max;
        }
        return ans;
    }
    // Time : O(n log n) for sorting
}