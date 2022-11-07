class Solution {
    public int maximum69Number (int num) {
        // Converting number to the character array
        char[] ch = String.valueOf(num).toCharArray();
        // replace the first 6 to 9
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '6'){
                ch[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(ch));
    }
}