import java.util.*;
class Solution {

    private boolean isSafeToAddQueen(int row, int col, List<String> currBoard, int n){
        int tempRow = row;
        int tempCol = col;
        while(tempRow >= 0 && tempCol >= 0){
            if(currBoard.get(tempRow--).charAt(tempCol--) == 'Q') return false;
        }
        tempRow = row;
        tempCol = col;
        while( tempCol >= 0){
            if(currBoard.get(tempRow).charAt(tempCol--) == 'Q') return false;
        }
        tempRow = row;
        tempCol = col;
        while(tempRow < n && tempCol >= 0){
            if(currBoard.get(tempRow++).charAt(tempCol--) == 'Q') return false;
        }
        return true;

    }

    private void findBoards(int col, int n, List<String> currBoard, List<List<String>> result) {
        if (col >= n) {
            result.add(new ArrayList<>(currBoard));
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafeToAddQueen(row, col, currBoard, n)) {
                char[] arr = currBoard.get(row).toCharArray();
                String prevString = new String(arr);
                arr[col] = 'Q';
                String str = new String(arr);
                currBoard.set(row, str);
                findBoards(col + 1, n, currBoard, result);
                currBoard.set(row, prevString);
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> currBoard = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            currBoard.add(".".repeat(n));
        }
        findBoards(0, n, currBoard, result);
        return result;
    }
}