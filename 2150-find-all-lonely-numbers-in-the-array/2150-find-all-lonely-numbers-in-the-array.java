class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        
        for(Map.Entry entry : map.entrySet()){
            int num = (Integer) entry.getKey();
            if((Integer)entry.getValue() == 1 && !map.containsKey(num + 1) && !map.containsKey(num - 1)){
                list.add((Integer)entry.getKey());
            }
        }   
       return list;
    }
    // TC & SC : O(n)
}