class Solution {
    public int candy(int[] ratings) {
        int sum = 0, n = ratings.length;
        
        // candies for left and right side of children ratings  
        int[] left = new int[n];
        int[] right = new int[n];
        
        // assign minimum 1 candy to everyone
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        // caluculate for left side 
        for(int i = 1; i < n;i++){
            if(ratings[i] > ratings[i - 1])
                left[i] = left[i - 1] + 1;
        }
        
        // Calculate for right side 
        for(int i = n - 2; i >= 0;i--){
            if(ratings[i] > ratings[i + 1])
                right[i] = right[i + 1] + 1;
        }
        
        // Marge both the side and take maximum candy of each childern
        for(int i = 0; i < n;i++){
            sum += Math.max(left[i], right[i]);
        }
        return sum;
    }
    // TC : O(n) traversing array 3 times
    // SC : O(n) taking n extra space for left and right side
}