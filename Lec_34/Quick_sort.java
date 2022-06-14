package Lec_34;

import java.util.Arrays;

public class Quick_sort {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		QS(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void QS(int[] arr, int s, int e) {
		if (s > e) {
			return;
		}
		int pivot = arr[(s + e) / 2];
		int L = s;
		int R = e;
		while (L <= R) {
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}

			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}
//		System.out.println(Arrays.toString(arr) + "{" + s + "," + e + "}");
		QS(arr, s, R);
		QS(arr, L, e);
	}
}
