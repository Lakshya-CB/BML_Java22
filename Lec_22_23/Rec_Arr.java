package Lec_22_23;

public class Rec_Arr {
	public static void main(String[] args) {
		int[] arr = { 909, 13, 13, 13, 13, 54, 13, 91129 };
//		Print(arr, 0);
//		System.out.println(Max(arr, 0));\
//		PrintRev(arr, 0);
		System.out.println(FirstOcc(0, 13, arr));

	}

	public static int Max(int[] arr, int idx) {
//		Understand the meaning of your BP, or your recursive call!!
//		BP : Max(arr, 0)
//		SP : Max(arr, 1)
		if (idx == arr.length - 1) {
			return arr[idx];
		}
		int sp = Max(arr, idx + 1);
		return Math.max(arr[idx], sp);
	}

	public static void Print(int[] arr, int idx) {
//		BP : Print(arr, 0)
//		SP : Print(arr, 1)
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		Print(arr, idx + 1);

	}

	public static void PrintRev(int[] arr, int idx) {
//		BP : PrintRev(arr, 0)
//		SP : PrintRev(arr, 1)
		if (idx == arr.length) {
			return;
		}
		PrintRev(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	public static int FirstOcc(int idx, int ali, int[] arr) {
//		BP : FirstOcc(0,5)
//		SP : FirstOcc(1,5);
		if (idx == arr.length) {
			return -1;
		}

		int sp = FirstOcc(idx + 1, ali, arr);
		if (arr[idx] == ali) {
			return idx;
		} else {
			return sp;
		}
	}

	public static int LastOcc(int idx, int ali, int[] arr) {
//		BP : LastOcc(0,5)
//		SP : LastOcc(1,5);
		if (idx == arr.length) {
			return -1;
		}

		int sp = LastOcc(idx + 1, ali, arr);
		if (arr[idx] == ali && sp == -1) {
			return idx;
		} else {
			return sp;
		}
	}

	public static int[] All_Occ(int idx, int ele, int num, int[] arr) {
		if (idx == arr.length) {

			return new int[num];
		}

		if (arr[idx] == ele) {
			int[] sp = All_Occ(idx + 1, ele, num + 1, arr);
			return sp;

		} else {
			int[] sp = All_Occ(idx + 1, ele, num + 0, arr);
			return sp;
		}
	}

}
