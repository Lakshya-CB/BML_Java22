package Lec_22;

public class Rec_Arr {
	public static void main(String[] args) {
		int[] arr = { 909, 13, 54, 13, 91129 };
		Print(arr, 0);
//		System.out.println(Max(arr, 0));
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
		if(idx==arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		Print(arr, idx + 1);

	}
}
