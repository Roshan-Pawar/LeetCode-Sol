class Solution {
    public boolean isPalindrome(String s) {
        String fixedS = "";
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character. isLetter(c)){
                fixedS += c;
            }
        }
        
        fixedS = fixedS.toLowerCase();
        
        int aPointer = 0;
        int bPointer = fixedS.length() - 1;
        
        while(aPointer <= bPointer){
            if(fixedS.charAt(aPointer) != fixedS.charAt(bPointer)){
                return false;
            }
            aPointer += 1;
            bPointer -= 1;
        }
        
        return true;
     
    }
}