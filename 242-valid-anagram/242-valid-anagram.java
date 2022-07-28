class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        // Put all the elements of String S into map & increment value if double char found 
        for(int i = 0; i < s.length(); i++){ 
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(t.charAt(i))) return false;
            // if value of that char is more than 1 then reduse it by 1
            if(map.get(t.charAt(i)) > 1) map.put(t.charAt(i), map.get(t.charAt(i)) - 1); 
            else map.remove(t.charAt(i));
        }
        return map.size() == 0;
    }
    // TC & SC : O(n)
}