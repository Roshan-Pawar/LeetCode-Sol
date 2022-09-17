class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < words.length; i++){
            map.put(words[i], i);
        }
        
        // Case 1 : Empty String Case
        if(map.containsKey("")){
            int blankIdx = map.get("");
            for(int i = 0; i < words.length; i++){
                if(i != blankIdx && palindrome(words[i])){
                    list.add(Arrays.asList(blankIdx, i));
                    list.add(Arrays.asList(i, blankIdx));
                }
            }
        }
        
        // Case 2 : Reverse of curr string available
        for(int i = 0; i < words.length; i++){
            String reverse = new StringBuilder(words[i]).reverse().toString();
            Integer reverseIdx = map.get(reverse);
            if(reverseIdx != null && reverseIdx != i){
                list.add(Arrays.asList(i, reverseIdx));
            }
        }
        
        // Case 3 : Left Right Partition of String
        for(int i = 0; i < words.length; i++){
            String curr = words[i];
            for(int cut = 1; cut < curr.length(); cut++){
                String left = curr.substring(0, cut);
                String right = curr.substring(cut);
                
                if(palindrome(left)){
                    String reverseRight = new StringBuilder(right).reverse().toString();
                    if(map.containsKey(reverseRight)){
                        list.add(Arrays.asList(map.get(reverseRight), i));
                    }
                }
                
                if(palindrome(right)){
                    String reverseLeft = new StringBuilder(left).reverse().toString();
                    if(map.containsKey(reverseLeft)){
                        list.add(Arrays.asList(i, map.get(reverseLeft)));
                    }
                }
            }
        } 
        return list;
    }
    
    public boolean palindrome(String s){
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
    // TC : O(n k^2) SC : O(n)
}











