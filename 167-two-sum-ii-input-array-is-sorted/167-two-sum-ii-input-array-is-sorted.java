class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length - 1;
        
        while(a <= b){
            int sum = numbers[a] + numbers[b];
            
            if(sum < target){
                // increase a by 1;
                a++;
            } else if(sum > target){
                // decrease b by 1
                b--;
            } else{
                return new int[] {a + 1, b + 1};
            }
        }
         return new int[] {a + 1, b + 1};
    }
}

//  time : O(N), constant space