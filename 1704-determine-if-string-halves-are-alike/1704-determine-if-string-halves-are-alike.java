class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        char[] sArr = s.toCharArray();
        int n = sArr.length;
        int a = 0, b = 0;
        for(int i = 0; i < n/2; i++){
            if(set.contains(sArr[i])){
                a++;
            }
        }
        
        for(int i = (n / 2); i < n; i++){
            if(set.contains(sArr[i])){
                b++;
            }
        }
        return (a == b);
    }
}