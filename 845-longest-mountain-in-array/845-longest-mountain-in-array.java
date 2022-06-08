class Solution {
    public int longestMountain(int[] arr) {
        
        int result = 0;
        int n = arr.length;
        
        for(int i = 1; i < n; i++){
            int count = 1;
            boolean check = false;
            
            //check for increasing sequence
            int j = i;
            while(j < n && arr[j] > arr[j - 1]){
                j++;
                count++;
            }
            
            //for decreasing sequence
            while(j != i && j < n && arr[j] < arr[j - 1]){
                j++;
                count++;
                check = true;
            }
            
            //max length
            if(check && count > 2 && j != i){
                result = Math.max(result, count);
                j--;
            }
            i = j;
        }
        return result;
    }
}