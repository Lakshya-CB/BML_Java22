package Lec_30_REvision;

public class Sudoku {
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		solve(0, 0, board);

	}

	public static void solve(int r, int c, char[][] board) {

		if (c == board[r].length) {
			r++;
			c = 0;
		}
		if (r == board.length) {
//			System.out.println();
			for (char[] rr : board) {
				System.out.println(rr);
			}
			System.out.println("===========");
			return;
		}
		if (board[r][c] != '.') {
			solve(r, c + 1, board);
		} else {
			for (int i = '1'; i <= '9'; i++) {
//				board[r][c] = (char) ('0' + i);
				if (isSafe((char) i, r, c, board)) {
					board[r][c] = (char) i;

					solve(r, c + 1, board);
				}
			}
			board[r][c] = '.';
		}
	}

	private static boolean isSafe(char ch, int r, int c, char[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			if (board[r][i] == ch) {
				return false;
			}
		}
		for (int i = 0; i < 9; i++) {
			if (board[i][c] == ch) {
				return false;
			}
		}
		int br = r / 3;
		int bc = c / 3;

		for (int i = br * 3; i < br * 3 + 3; i++) {
			for (int j = bc * 3; j < bc * 3 + 3; j++) {
				if (board[i][j] == ch) {
					return false;
				}
			}
		}
		return true;
	}
}
