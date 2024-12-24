package BackTracking;

public class NQueens {
    public static boolean isSafe(char [][]board,int row,int col)
    {
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //digonal right
        for(int i=row-1,j=col+1;i>=0&&j< board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char [][]board,int row){
        if(row==board.length){
            count++;
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1); //functional call
                board[row][j] = 'X'; //backtrack step
            }
        }
    }

    public static void printBoard(char [][]board){
        System.out.println("-----------chess board-----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char [][]board=new char[n][n];
        //initalization
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQueen(board,0);
        System.out.println("-------------------Number of ways---------------------");
        System.out.print("number of ways :- "+count);
    }
}
