import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean isValid = checkValidity(board);
        System.out.println(isValid);
    }

    public static boolean checkValidity(char[][] board) {
        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character> colSet = new HashSet<>();
        HashSet<Character> boxSet = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            char rows[] = board[i];
            for (int j = 0; j < board.length; j++) {
                char rowNumber = rows[j];
                char columnNumber = board[j][i];
                char boxNumber = board[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3];

                if (rowNumber != '.') {
                    if (rowSet.contains(rowNumber)) return false;
                    rowSet.add(rowNumber);
                }
                if (columnNumber != '.') {
                    if (colSet.contains(columnNumber)) return false;
                    colSet.add(columnNumber);
                }
                if (boxNumber != '.') {
                    if (boxSet.contains(boxNumber)) return false;
                    boxSet.add(boxNumber);
                }
            }
            rowSet.clear();
            colSet.clear();
            boxSet.clear();
        }
        return true;
    }
}
