class Solution {
    public String licenseKeyFormatting(String s, int k) {
        char[] str = s.toCharArray();
        int i = s.length() - 1, count = 0;
        StringBuilder sb = new StringBuilder();
        // Traverse reverse to string
        while(i >= 0){
            if(str[i] == '-'){ // if '-' then skip
                i--;
                continue;
            }
            if(count == k){  // if count matches k then insert '-'
                sb.append('-');
                count = 0;
            }
            sb.append(Character.toUpperCase(str[i])); // append character in Uppercase
            i--;
            count++;
        }
        return sb.reverse().toString(); // return sb in reverse
    }
    // TC : O(n)
}