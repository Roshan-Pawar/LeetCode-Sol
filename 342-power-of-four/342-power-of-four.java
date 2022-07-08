class Solution {
    public boolean isPowerOfFour(int n) {
        // Math.pow(4 , 15) = 1073741824
       return n > 0 && 1073741824 % Math.sqrt(n) == 0;
    }
}