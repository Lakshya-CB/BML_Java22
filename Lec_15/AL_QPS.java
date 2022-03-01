package Lec_15;

import java.util.ArrayList;
import java.util.Collections;

public class AL_QPS {
	public static void main(String[] args) {
//		int[] arr1 = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
//		int[] arr2 = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
//		System.out.println(Intersection(arr1, arr2));
		int[] arr1 = { 9, 8, 7, 5 };
		int[] arr2 = { 9, 6, 7 };
		Add(arr1, arr2);

	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
		int A = 0;
		int B = 0;
		ArrayList<Integer> AL = new ArrayList<Integer>();
		while (A < arr1.length && B < arr2.length) {
//			System.out.println(arr1[A] +"==="+ arr2[B]);
			if (arr1[A] == arr2[B]) {
				AL.add(arr1[A]);
				A++;
				B++;
			} else if (arr1[A] < arr2[B]) {
//				arr1A doesnt exist!!
				A++;
			} else {
				B++;
			}
		}
		return AL;
	}

	public static ArrayList<Integer> Add(int[] arr1, int[] arr2) {

		int A = arr1.length - 1;
		int B = arr2.length - 1;
		ArrayList<Integer> AL = new ArrayList<Integer>();

		int carry = 0;
		while (B >= 0 || A >= 0) {
			int ss = carry;
			if (A >= 0) {
				ss = ss + arr1[A];
			}
			if (B >= 0) {
				ss = ss + arr2[B];
			}
			carry = ss / 10;
			AL.add(0,ss % 10);
			A--;
			B--;
		}
		if (carry > 0) {
			AL.add(0,carry);
		}
//		Collections.reverse(AL); // reverse your AL
//		Collections.sort(AL);  // Sort the AL!!
		
		System.out.println(AL);
		return AL;
	}
}
