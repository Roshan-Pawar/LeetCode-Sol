class Solution {
    public int[] threeEqualParts(int[] arr) {
        int n = arr.length;
        
        int oneCount = 0;
        for(int i : arr)
            if(i == 1)
                oneCount++;
        
// Base exit condition if the one's in array are even then partion is not possible
        if(oneCount % 3 != 0)
            return new int[]{-1, -1};
        if(oneCount == 0)
            return new int[]{0, n - 1};

// Initializing the values of i123, j123 with help of "k"
        int k = oneCount / 3;
        int i1 = -1, i2 = -1, i3 = -1, j1 = -1, j2 = -1, j3 = -1;
        int currCount = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                currCount += 1;
                if(currCount == 1) i1 = i;
                if(currCount == (k+1)) i2 = i;
                if(currCount == (2*k+1)) i3 = i;
                
                if(currCount == k) j1 = i;
                if(currCount == (2*k)) j2 = i;
                if(currCount == (3*k)) j3 = i;
            }
        }
        
// Make copy of each parts and compare 3 partions
        int[] part1 = Arrays.copyOfRange(arr, i1, j1+1);
        int[] part2 = Arrays.copyOfRange(arr, i2, j2+1);
        int[] part3 = Arrays.copyOfRange(arr, i3, j3+1);
        
        if(!Arrays.equals(part1, part2) || !Arrays.equals(part1, part3))
            return new int[]{-1, -1};
        
// Take care of trailing zeros
        
        int first = i2-j1-1;
        int second = i3-j2-1;
        int third = n-j3-1;
        
        if(third > Math.min(first, second))
            return new int[] {-1, -1};
        
        return new int[] {j1 + third, j2 + third + 1};
        
    
    }
} 

// Time and space O(n)