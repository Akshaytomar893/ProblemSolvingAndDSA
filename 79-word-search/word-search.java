class Solution {
    private boolean wordExists(char[][] board, String word, boolean[][] visited, int row, int col, int currIdx) {
        if (currIdx == word.length())
            return true;

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col] == true
                || board[row][col] != word.charAt(currIdx))
            return false;

        visited[row][col] = true;
        boolean found = wordExists(board , word, visited , row - 1, col, currIdx + 1) ||
                        wordExists(board , word, visited , row + 1, col, currIdx + 1) ||
                        wordExists(board , word, visited , row, col - 1, currIdx + 1) ||
                        wordExists(board , word, visited , row, col + 1, currIdx + 1);

        visited[row][col] = false;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean visited[][] = new boolean[rows][cols];
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(wordExists(board, word, visited, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
}