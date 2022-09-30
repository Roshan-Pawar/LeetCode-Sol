class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        for(int i = shifts.length - 2; i >= 0; i--){
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < shifts.length; i++){
            int a = s.charAt(i) - 'a' + shifts[i];
            a = a % 26;
            a = a + (int)'a';
            char ch = (char) a;
            sb.append(ch);
        }
        return sb.toString();
    }
    //See Notes
}