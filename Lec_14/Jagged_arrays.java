package Lec_14;

import java.util.Scanner;

public class Jagged_arrays {
	public static void main(String[] args) {
		int[][] mat = new int[3][0];
		for(int[] row : mat) {
			System.out.println(row);
			System.out.println(row.length);
		}
//		can u create Jagged Arrays?!
		mat[0] = new int[5];
		mat[2] = new int[15];
		System.out.println("===============");
		for(int[] row : mat) {
			System.out.println(row);
			System.out.println(row.length);
		}
		int a = 10;
	}
}
