package Lec_30_REvision;

public class Queen_seats {
	public static void main(String[] args) {
		NQueens(0, 0, 3, 3, 2, "", new boolean[3][3]);
	}

	public static void NQueens(int r, int c, int Total_R, int Total_C, int toSelect, String ans, boolean[][] Board) {
		if (toSelect == 0) {
			System.out.println(ans);
			disp(Board);
			return;
		}
		if (c == Total_C) {
			r++;
			c = 0;
		}
		if (r == Total_R) {
			return;
		}
		if (isSafe(Board, r, c)) {
			Board[r][c] = true;
			NQueens(r, c + 1, Total_R, Total_C, toSelect - 1, ans + "Q{" + r + "," + c + "}", Board);
			Board[r][c] = false;
		}
		NQueens(r, c + 1, Total_R, Total_C, toSelect, ans, Board);

	}

	private static boolean isSafe(boolean[][] board, int r, int c) {
		for (int i = 0; i < c; i++) {
			if (board[r][i]) {
				return false;
			}
		}
		for (int i = 0; i < r; i++) {
			if (board[i][c]) {
				return false;
			}
		}
		int R1 = r;
		int C1 = c;
		while( R1>=0 && C1 >=0	) {
			if(board[R1][C1]) {
				return false;
			}
			R1--;C1--;
		}
		int R2 = r;
		int C2 = c;
		while( R2>=0 && C2 < board[0].length	) {
			if(board[R2][C2]) {
				return false;
			}
			R2--;
			C2++;
		}
		return true;
	}

	public static void disp(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean isSitting : row) {
				System.out.print(isSitting + " ");
			}
			System.out.println();
		}
		System.out.println("=============");
	}
}