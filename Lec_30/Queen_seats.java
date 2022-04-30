package Lec_30;

public class Queen_seats {
	public static void main(String[] args) {
//		placeQ(0, 2, 4, ""); // 4C2
//		placeQ2d(0, 0, 2, 3, 3, ""); //4C2
//		disp(new boolean[3][3]);
		placeQ2dKill(0, 0, 2, 3, 3, "", new boolean[3][3]);
	}

// wrt seats !!
	public static void placeQ(int x, int QTP, int total_col, String ans) {
//		+ve BC
		if (QTP == 0) {
			System.out.println(ans);
			return;
		}
		// -ve BC
		if (x == total_col) {
			return;
		}

		// seat x
		placeQ(x + 1, QTP - 1, total_col, ans + "Q" + x); // sits
		placeQ(x + 1, QTP, total_col, ans); // wont sit

	}

	public static void placeQ2d(int r, int c, int QTP, int total_row, int total_col, String ans) {

		if (QTP == 0) {
			System.out.println(ans);
			return;
		}
//		moving logic
		if(c==total_col) {
			r++;
			c=0;
		}
//		-ve
		if(r==total_row) {
			return;
		}
		
		// seat x
		placeQ2d(r, c + 1, QTP - 1, total_row, total_col, ans + "Q{" + r + "," + c + "}"); // sits
		placeQ2d(r, c + 1, QTP, total_row, total_col, ans); // wont sit

	}
	
	public static void placeQ2dKill(int r, int c, int QTP, int total_row, int total_col, String ans, boolean[][] board) {

		if (QTP == 0) {
			System.out.println(ans);
			disp(board);
			System.out.println("==================");
			return;
		}
//		moving logic
		if(c==total_col) {
			r++;
			c=0;
		}
//		-ve
		if(r==total_row) {
			return;
		}
		
		// seat x
		if(isSafe(board, r,c)) {
			board[r][c] = true;
			placeQ2dKill(r, c + 1, QTP - 1, total_row, total_col, ans + "Q{" + r + "," + c + "}",board); // sits
			board[r][c] = false;
		}
		placeQ2dKill(r, c + 1, QTP, total_row, total_col, ans,board); // wont sit

	}
	private static boolean isSafe(boolean[][] board, int r, int c) {
//		above col
		for(int i=0;i<c;i++) {
			if(board[r][i]) {
				return false;
			}
		}
//		left row
		for(int i=0;i<r;i++) {
			if(board[i][c]) {
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
		for(boolean[] row : board) {
			for(boolean isSitting : row) {
				System.out.print(isSitting+ " ");
			}
			System.out.println();
		}
	}
}
