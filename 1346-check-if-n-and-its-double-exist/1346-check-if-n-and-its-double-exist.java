class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            int search = bs(arr, arr[i]);
            if(search != -1 && search != i)
                return true;
        }
        return false;
    }
    
    public int bs(int[] arr, int val){
        int s = 0, e = arr.length - 1;
        
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == val * 2)
                return mid;
            else if(arr[mid] > val * 2)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return -1;
    }
    // Binary search TC : O(n log n) SC : O(1)
}