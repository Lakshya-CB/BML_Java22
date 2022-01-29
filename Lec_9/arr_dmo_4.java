package Lec_9;

public class arr_dmo_4 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 1, 2, 3, 4 };
//		swap(arr1, arr2);
		swap_in(arr1, arr2, 3);

	}

	public static void swap(int[] arr1, int[] arr2) {
		int[] temp = arr1;
		arr1 = arr2;
		arr2 = temp;
	}

	public static void swap_in(int[] a, int[] b, int c) {
		int d = a[c];
		a[c] = b[c];
		b[c] = d;
	}

}
