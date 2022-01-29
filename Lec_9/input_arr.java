package Lec_9;

import java.util.Scanner;

public class input_arr {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
	}
}
