class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        
        int[] primeFactors = new int[]{2, 3, 5};
        
        for(int num : primeFactors){
            while(n % num == 0){
                n /= num;
            }
        }
        return n == 1;
    }
}