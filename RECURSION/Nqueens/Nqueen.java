class Nqueen{
    static int count = 0;
    static boolean NQ(int board[][],int col){
            if (col >= board.length)
            return true;
    
        for (int i = 0; i < board.length; i++)
        {
            if ( isSafe(board, i, col) )
            {
                board[i][col] = 1;    
                if ( NQ(board, col + 1) ){
                    return true;
                }
                board[i][col] = 0; // BACKTRACK
            }
        }
        if(count == 0) return false;
        else return true;
    }
    static boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
 
        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
 
        /* Check upper diagonal on left side */
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 1)
                return false;
 
        /* Check lower diagonal on left side */
        for (i=row, j=col; j>=0 && i<board.length; i++, j--)
            if (board[i][j] == 1)
                return false;
 
        return true;
    }
    static void printArr(int chess[][]){
        for(int r[]:chess){
            System.out.println();
            for(int s: r)
                System.out.print(s+" ");
        }
    }
    public static void main(String args[]){
        int N = 4;
        int chess[][] = new int[N][N];
        boolean res = NQ(chess,0);
        printArr(chess);
        System.out.println(res);
    }
}