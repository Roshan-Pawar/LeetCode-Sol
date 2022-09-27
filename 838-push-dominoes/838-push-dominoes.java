class Solution {
    public String pushDominoes(String dominoes) {
        char[] domino = dominoes.toCharArray();
        int n = dominoes.length();
        int[] forces = new int[n];
        int force = 0;
        // Force from Left to Right
        for(int i = 0; i < n; i++){
            if(domino[i] == 'R') force = n;
            else if (domino[i] == 'L') force = 0;
            else force = Math.max(force - 1, 0);
            forces[i] += force;
        }
        
        // Force from Right to Left
        for(int i = n - 1; i >= 0; i--){
            if(domino[i] == 'L') force = n;
            else if (domino[i] == 'R') force = 0;
            else force = Math.max(force - 1, 0);
            forces[i] -= force;
        }
        
        StringBuilder result = new StringBuilder();
        for(int num : forces){
            if(num > 0) result.append('R');
            else if (num < 0) result.append('L');
            else result.append('.');
        }
        return result.toString();
    }
    // See Notes
}