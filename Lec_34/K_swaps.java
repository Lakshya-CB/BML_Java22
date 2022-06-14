package Lec_34;

import java.util.Arrays;
import java.util.Scanner;

public class K_swaps {
	static long max = Long.MIN_VALUE;
	static String path = "";

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String num = "897654321";
		int k = 4;
		char[] arr = num.toCharArray();
//		System.out.println(Arrays.toString(arr) + " , " + k);
		max = Long.MIN_VALUE;
		K_swaps(arr, k,"");
		System.out.println(max+path);
	}

	public static void K_swaps(char[] arr, int k, String swaps) {
//		System.out.println(Arrays.toString(arr));
		String str = new String(arr);
//		System.out.println(str);
		long num = Long.parseLong(str);
//		System.out.println(num);
		if (num > max) {
			max = num;
			path = swaps;
		}

		if (k == 0) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
//			swap i with j
				swap(arr, i, j);
				K_swaps(arr, k - 1, swaps + "{" + arr[i] + "," + arr[j]+"}");
				swap(arr, i, j);
			}
		}
	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
