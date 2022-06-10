package Lec_33;

import java.util.Arrays;

public class Merge_sort {
	public static void main(String[] args) {
		int[] arr1 = { 10, 30, 50, 80, 100 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] ans = merge(arr1, arr2);
		System.out.println(Arrays.toString(ans));
		int[] arr = { 50, 40, 30, 20, 10 };
		System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));

	}

	public static int[] sort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans; 
		}
		//		smallest problest !! sort(arr, 0,0)
		int mid = (s + e) / 2; // 0 
		int[] P1 = sort(arr, s, mid); // 0,0
		int[] P2 = sort(arr, mid + 1, e); //1, 0
		return merge(P1, P2);

	}

//	O(m+n)// m = arr1.len and n = arr2.len
	public static int[] merge(int[] arr1, int[] arr2) {
		int idx1 = 0;
		int idx2 = 0;
		int i = 0;
		int[] ans = new int[arr1.length + arr2.length];
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[i] = arr1[idx1];
				idx1++;
				i++;
			} else {
				ans[i] = arr2[idx2];
				idx2++;
				i++;
			}
		}
		while (idx2 < arr2.length) {
			ans[i] = arr2[idx2];
			idx2++;
			i++;
		}
		while (idx1 < arr1.length) {
			ans[i] = arr1[idx1];
			idx1++;
			i++;
		}
		return ans;

	}
}
