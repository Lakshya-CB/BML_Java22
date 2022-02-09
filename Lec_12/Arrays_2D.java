package Lec_12;

public class Arrays_2D {
	public static void main(String[] args) {
		int[] arr = null;
//		System.out.println(arr);

		int[][] mat = new int[3][5];
		int[][][] mat3 = new int[3][5][3];

//		Size of rows!!
		System.out.println(mat.length);
//		Size of col!?
		System.out.println(mat[0].length);
		System.out.println(mat[1].length);
		System.out.println(mat[2].length);

//		System.out.println(mat[3].length);
//		disp(mat);
		disp2(mat);
		

	}

	public static void disp(int[][] mat) {
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				System.out.print(mat[r][c]+ " ");
			}
			System.out.println();
		}
	}
	public static void disp2(int[][] mat) {
		for (int[] row : mat) {
			for (int ele: row) {
				System.out.print(ele+ " ");
			}
			System.out.println();
		}
	}
}
