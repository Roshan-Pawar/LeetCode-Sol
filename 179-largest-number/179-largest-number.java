class Solution {
    public String largestNumber(int[] nums) {
        int length = nums.length;
        String[] arr = new String[length];
        // Converting the int[] to String[], that will make easy to sort 
        for(int i = 0; i < length; i++)
            arr[i] = nums[i] + "";
        /*
          Logic :  https://www.youtube.com/watch?v=VV_KPrG_PzE             
        */
        Arrays.sort(arr, (a,b) ->{
            long n1 = Long.parseLong(a + b);
            long n2 = Long.parseLong(b + a);
            
            if(n1 > n2) return 1;
            else if (n1 < n2) return -1;
            else return 0;
        });
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i = length - 1; i >=0; i--)
            sb.append(arr[i]);
        
        if(sb.charAt(0) == '0')
            return "0";
        
        return sb.toString();
    }
}