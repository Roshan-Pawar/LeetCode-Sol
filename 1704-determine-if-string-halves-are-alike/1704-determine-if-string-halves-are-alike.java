class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int i = 0, vowelCount = 0;
        
        while(i < n / 2){
            if(isVowel(s.charAt(i)))
                vowelCount++;
            i++;
        }
        
        while(i < n){
            if(isVowel(s.charAt(i)))
                vowelCount--;
            i++;
        }
        return vowelCount == 0;
    }
    
    public boolean isVowel(char ch){
        if(ch =='a'||ch =='e'|| ch =='i'|| ch =='o'||ch =='u'||
          ch =='A'||ch =='E'|| ch =='I'||ch =='O'|| ch =='U'){
            return true;
        }
        return false;
    }
}