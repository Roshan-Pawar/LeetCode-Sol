class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        return interleave(s1, s2, s3, new HashMap<>());
    }
    
    public boolean interleave(String a, String b, String c, Map<String, Boolean> map){
        if(a.length() + b.length() != c.length()) return false;
        if(a.isEmpty() && b.isEmpty() && c.isEmpty()) return true;
        
        String key = a + "->" + b + "->" + c;
        
        boolean resulta = false;
        boolean resultb = false;
        
        if(!map.containsKey(key)){
            if(!a.isEmpty() && a.charAt(0) == c.charAt(0))
                resulta = interleave(a.substring(1), b, c.substring(1), map);
            if(!b.isEmpty() && b.charAt(0) == c.charAt(0))
                resultb = interleave(a, b.substring(1), c.substring(1), map);
            map.put(key, resulta || resultb);
        }
        return map.get(key);
    }
    // TC & SC : O(m.n) where m and n is length of string a, b 
}