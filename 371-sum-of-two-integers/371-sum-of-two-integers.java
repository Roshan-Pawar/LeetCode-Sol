class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int temp = (a & b) <<1;
            a ^= b;
            b = temp;
        }
        return a;
    }
    // TC & SC : O(1)
}