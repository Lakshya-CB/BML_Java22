package Lec_12;

import java.util.Scanner;

public class Arrays_2D_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();

		int[][] mat = new int[row][col];
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
//				System.out.print(mat[r][c]+ " ");
				mat[r][c] = scn.nextInt();
			}
		}
//		disp2(mat);
		System.out.println("************");
		wave_disp(mat);
	}

	public static void disp2(int[][] mat) {
		for (int[] row : mat) {
			for (int ele : row) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}

	public static void wave_disp(int[][] mat) {
		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				int toPrint = r;
				if(c%2==1) {
					toPrint = mat.length-1-r;
							
				}
				System.out.print(mat[toPrint][c] + " ");
			}
			System.out.println();
		}
	}
}
