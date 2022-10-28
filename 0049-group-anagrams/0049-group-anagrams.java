class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            String key = buildString(s);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
    
    public String buildString(String str){
        char[] ch = new char[26];
        for(char c : str.toCharArray()){
            ch[c - 'a']++;
        }
        return new String(ch);
    }
    // TC : O(n * len)  SC : O(n)
    // https://www.youtube.com/watch?v=8u8JlpYAoPg
}