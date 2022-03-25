package Lec_Doubts;

public class ZIgZag_String {
	public static void main(String[] args) {

		char[][] arr = { { 'P', ' ', ' ', 'I', ' ', ' ', 'N' }, { 'A', ' ', 'L', 'S', ' ', 'I', 'G' },
				{ 'Y', 'A', ' ', 'H', 'R' }, { 'P', ' ', ' ', 'I' } };

		int r = 0, c = 0;
		while (true) {
			System.err.println("Begin");
			while (r < arr.length - 1) {
				System.out.println(arr[r][c] + "{" + r + "," + c + "}");
				r++;
			}
//			System.err.println("DONBE!" + "{" + r + "," + c + "}");
			while (r > 0 && c < arr[r].length) {

//				System.out.println(arr[r][c] + "{" + r + "," + c + "}");
				r--;
				c++;
			}
			System.err.println("END");
		}
	}
}
