package Less_3;

public class Horses {
    static int n = 5;
    static int count;
    static int[][] board = new int[n][n];

    static int[][] moves = {
            {1,2}, {-1,2}, {1,-2}, {-1,-2},
            {2,1}, {2,-1}, {-2,1}, {-2,-1}
    };


    public static void main(String[] args) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 1;
                if (board[1][1] == 1){
                    System.out.println("!!!");
                }
//                backTrack(0, 0, 1);
                backTrack(i, j, 1);
                board[i][j] = 0;
            }
        }

    }
    private static void backTrack(int row, int col, int step){
        if (step == board.length * board.length){
            count ++;
            System.out.printf("Матрица № %d%n", count);
            printBoard();


            return;
        }
        for (var move: moves ){
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (canPlace(newRow, newCol)) {
                board[newRow][newCol] = step + 1;
                backTrack(newRow, newCol,step + 1);
                board[newRow][newCol] = 0;
            }
        }
        return;
    }
    private static boolean canPlace(int row, int col){
        if (row < 0 || col < 0) return false;
        if (row >= board.length || col >= board.length) return false;
        return board[row][col] == 0;
//        return row >= 0 && col >= 0 && row < board.length && col < board.length && board[row][col] == 0;
    }
    private static void printBoard(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
}