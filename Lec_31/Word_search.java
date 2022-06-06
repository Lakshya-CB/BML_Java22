package Lec_31;

public class Word_search {
	public boolean exist(char[][] board, String word) {
		solution =false;
		find(board, 0, 0, word, new boolean[board.length][board[0].length]);
		return solution;
	}

	boolean solution;

	public void find(char[][] board, int r, int c, String word, boolean[][] Visited) {
		if (word.isEmpty()) {
			solution = true;
			return;
		}
		if (r < 0 || c < 0 || r == board.length || c == board[0].length || board[r][c] != word.charAt(0)
				|| Visited[r][c]) {
			return;
		}
		Visited[r][c] = true;
		find(board, r, c + 1, word.substring(1), Visited);
		find(board, r, c - 1, word.substring(1), Visited);
		find(board, r + 1, c, word.substring(1), Visited);
		find(board, r - 1, c, word.substring(1), Visited);
		Visited[r][c] = false;
	}
}
