
package nqueensproblem;
public class NQueensProblem {
		    final int N = 8;
		    void printSolution(int board[][])
		    {
		        for (int i = 0; i < N; i++) {
		            for (int j = 0; j < N; j++){
		                System.out.print(" " + board[i][j] + " ");
		              }
		            System.out.println();
		        }
		      }
	
		    void printPosition(int board[][])
		        {
		            int b = 0;
		            int arr[][] = new int[8][8];
		            for(int i=0;i<N;i++){
		              for(int j=0;j<N;j++){
		                arr[i][j] = b;
		                b++;
		              }
		            }
		            System.out.println("The positions of Queens when numberd from (0-63) row-wise are: ");
	
		            for (int i = 0; i < N; i++) {
		                for (int j = 0; j < N; j++){
		                  if(board[i][j]==1){
		                    System.out.print(arr[i][j]+", ");
		                  }
		                }
		            }
		    }
		    boolean isSafe(int board[][], int row, int col)
		    {
		        int i, j;
		        for (i = 0; i < col; i++)
		            if (board[row][i] == 1)
		                return false;
		        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
		            if (board[i][j] == 1)
		                return false;
		        for (i = row, j = col; j >= 0 && i < N; i++, j--)
		            if (board[i][j] == 1)
		                return false;
		        return true;
		    }
		    boolean solveNQUtil(int board[][], int col)
		    {
		        if (col >= N)
		            return true;
		        for (int i = 0; i < N; i++) {
		            if (isSafe(board, i, col)) {
		                board[i][col] = 1;
		                if (solveNQUtil(board, col + 1) == true)
		                    return true;
		                board[i][col] = 0; // BACKTRACK
		            }
		        }
		        return false;
		    }
		    boolean solveNQ()
		    {
		        int board[][] = new int[8][8];//chess board
	
		        if (solveNQUtil(board, 0) == false) {
		            System.out.print("Solution does not exist");
		            return false;
		        }
		        printSolution(board);
		        System.out.println("");
		        printPosition(board);
		        return true;
		    }
		    public static void main(String args[])
		    {
		        NQueensProblem Queen = new NQueensProblem();
		        Queen.solveNQ();
		    }
		}