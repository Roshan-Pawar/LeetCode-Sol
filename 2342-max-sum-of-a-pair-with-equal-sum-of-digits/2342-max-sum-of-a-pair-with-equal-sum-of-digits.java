class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = -1;
        
        for(int num : nums){
            int key = totalSum(num);
            
            if(!map.containsKey(key)){
                map.put(key, num);
            } else{
                result = Math.max(result, map.get(key) + num);
                map.put(key, Math.max(num, map.get(key)));
            }
        }
        return result;
    }
    
    public int totalSum(int num){
        int result = 0;
        
        while(num > 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}