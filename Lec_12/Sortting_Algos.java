package Lec_12;

import java.util.Arrays;

public class Sortting_Algos {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
//		bubble(arr);
//		selection(arr);
//		int[] arr = { 10, 20, 30, 40, 50, 25 };
		Instersion(arr);
	}

	public static void bubble(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int s = 0; s <= arr.length - 1 - count; s++) {
				if (arr[s + 1] < arr[s]) {
//swap!!
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

//	selection!! always sorts in minimum swaps!!

	public static void selection(int[] arr) {
		int last = arr.length - 1;

		while (last > 0) {
			int max_idx = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[i] > arr[max_idx]) {
					max_idx = i;
				}
			}
//		swap with last!!!
			if (max_idx != last) {
				System.out.println(max_idx + " swapping " + last);
				int temp = arr[max_idx];
				arr[max_idx] = arr[last];
				arr[last] = temp;
			}

			System.out.println(Arrays.toString(arr));
			System.out.println("*****************");
//		update last!!
			last--;
		}
	}

	public static void Instersion(int[] arr) {
		int toIns = 1;
		while (toIns < arr.length) {
			int val = arr[toIns];
			int idx = toIns - 1;
			while (idx >= 0 && arr[idx] > val) {
				arr[idx + 1] = arr[idx];
				idx--;
				System.out.println(Arrays.toString(arr));
			}
//		make sure to insert your val!!
			arr[idx + 1] = val;
			System.out.println("Ins="+Arrays.toString(arr));
			System.out.println("*************************");
			toIns++;
		}
	}
}
