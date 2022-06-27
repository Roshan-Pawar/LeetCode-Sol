class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] finalArr = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        while(i < m && j < n){
            if(nums1[i] < nums2[j])
                finalArr[k++] = nums1[i++];
            else
                finalArr[k++] = nums2[j++];
        }
        
        if(i < m){
            while(i < m)
                finalArr[k++] = nums1[i++];
        }
            
        if(j < n){
            while(j < n)
                finalArr[k++] = nums2[j++];
        }
            
        
        n = m + n;
        if(n % 2 == 1)
            return finalArr[((n+1)/2) - 1];
        else
            return ((double)finalArr[(n/2)-1]+(double)finalArr[(n/2)]) / 2.0;
    }
    // O(m + n) time and space
}