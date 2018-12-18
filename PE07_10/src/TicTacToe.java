import java.util.Arrays;

public class TicTacToe
{
   private String[][] board;
   private static final int ROWS = 3;
   private static final int COLUMNS = 3;


   public TicTacToe()
   {
      board = new String[ROWS][COLUMNS];
      // Fill with spaces
      for (int i = 0; i < ROWS; i++)
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = " ";
   }

 
   public void set(int i, int j, String player)
   {
      if (board[i][j].equals(" "))
         board[i][j] = player;
   }


   public String toString()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         r = r + "|";
         for (int j = 0; j < COLUMNS; j++)         
            r = r + board[i][j];
         r = r + "|\n";
      }
      return r;
   }
   
   
   public String getWinner() {
		for (int x = 0; x < 3; x++) {
			if (board[x][0] == "o" && board[x][1] == "o" && board[x][2] == "o" )
				return "o";
			if (board[x][0] == "x" && board[x][1] == "x" && board[x][2] == "x" )
				return "x";
		}
		for (int y = 0; y < 3; y++) {
			if (board[0][y] == "o" && board[1][y] == "o" && board[0][y] == "o" )
				return "o";
			if (board[0][y] == "x" && board[1][y] == "x" && board[0][y] == "x" )
				return "x";
		}
		if (board[0][0] == "o" && board[1][1] == "o" && board[2][2] == "o" )
				return "o";
		if (board[0][0] == "x" && board[1][1] == "x" && board[2][2] == "x" )
				return "x";
		if (board[2][2] == "o" && board[1][1] == "o" && board[0][0] == "o" )
				return "o";
		if (board[2][2] == "x" && board[1][1] == "x" && board[0][0] == "x" )
				return "x";
		return " ";
}
}
