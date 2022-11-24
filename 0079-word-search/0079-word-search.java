class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        visited = new boolean[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(word.charAt(0) == board[i][j] && search(i, j, word, board, 0))
                    return true;
            }
        }
        return false;
    }
    
    public boolean search(int i, int j, String word, char[][] board, int count){
        if(count == word.length()){
            return true; 
        }
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(count) != board[i][j]
           || visited[i][j] ){
            return false;
        } 
        visited[i][j] = true;
        
        if(search(i + 1, j, word, board, count + 1) ||
           search(i, j + 1, word, board, count + 1) ||
           search(i - 1, j, word, board, count + 1) ||
           search(i, j - 1, word, board, count + 1) )
            return true;
        
        visited[i][j] = false;
        return false;
    }
}