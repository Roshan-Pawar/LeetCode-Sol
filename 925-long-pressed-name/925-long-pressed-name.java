class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] n = name.toCharArray();
        char[] m = typed.toCharArray();
        int i = 0, j = 0;
        
        if(n.length > m.length || n[0] != m[0]){
            return false;
        }
        
        while(i < n.length && j < m.length){
            if(n[i] == m[j]){
                i++;
                j++;
            } else {
                i--;
                if(n[i] != m[j]){
                    return false;
                }
            }
        }
        
        while(j < m.length){
            if(n[n.length - 1] != m[j]){
                return false;
            }
            j++;
        }
        return i == n.length;
    }
}