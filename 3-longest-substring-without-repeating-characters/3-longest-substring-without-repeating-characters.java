class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = 0;
        int b = 0;
        int max = 0;
        
        HashSet<Character> hash_set = new HashSet<>();
        while(a < s.length()){
            if(!hash_set.contains(s.charAt(a))){
                hash_set.add(s.charAt(a));
                a++;
                max = Math.max(hash_set.size(), max);
            } else {
                hash_set.remove(s.charAt(b));
                b++;
            }
        }
        return max;
    }
}