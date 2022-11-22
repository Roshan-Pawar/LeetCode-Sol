class Solution {
    public String oddString(String[] words) {
        HashMap<ArrayList<Integer>, ArrayList<String>> map = new HashMap<>();
        
        for(String word : words){
            char[] ch = word.toCharArray();
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i = 0; i < ch.length - 1; i++){
                list.add(ch[i + 1] - ch[i]);
            }
            
            if(map.containsKey(list)){
                map.get(list).add(word);
            } else {
                ArrayList<String> value = new ArrayList<>();
                value.add(word);
                map.put(list, value);
            }
        }
        
        for(List<Integer> key : map.keySet()){
            if(map.get(key).size() == 1){
                return map.get(key).get(0);
            }
        }
        return "";
    }
    // TC : O(n)  SC : O(n)
}