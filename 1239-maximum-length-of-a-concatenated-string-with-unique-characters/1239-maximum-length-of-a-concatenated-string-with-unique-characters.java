class Solution {
    public int maxLength(List<String> arr) {
        List<String> ans = new ArrayList<>();
        ans.add("");
        
        for(String str : arr){
            if(!isUnique(str)){
                continue;
            }
            List<String> resList = new ArrayList<>();
            for(String s : ans){
                String temp = s + str;
                if(isUnique(temp)){
                    resList.add(temp);
                }
            }
            ans.addAll(resList);
        }
        int ansLen = 0;
        for(String s : ans){
            ansLen = Math.max(ansLen, s.length());
        }
        return ansLen;
    }
    
    public boolean isUnique(String str){
        if(str.length() > 26){
            return false;
        }
        boolean[] alphabets = new boolean[26];
        char[] characters = str.toCharArray();
        for(char ch : characters){
            if(alphabets[ch - 'a']){
                return false;
            } else {
                alphabets[ch - 'a'] = true;
            }
        }
        return true;
    }
    // https://www.youtube.com/watch?v=gfZPl-BWZuo
}