package Lec_10;

public class Qrrays_basic_Qs {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(max(arr));
//		System.out.println(find(arr, 40));
//		rev(arr);
//		rev2(arr);
//		disp(arr);
//		rot(arr, -1);
		rot2(arr, 3);
//		disp(arr);

	}

	public static int max(int[] arr) {
		int max = arr[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}

	public static void rev(int[] arr) {
		int[] nn_arr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			nn_arr[i] = arr[arr.length - 1 - i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nn_arr[i];
		}
	}

	public static void rev2(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
//			swap!!
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
//			Update!!
			start++;
			end--;
		}
	}

	public static void disp(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void rot(int[] arr, int rot) {
		rot = rot % arr.length;
		if (rot < 0)
			rot = rot + arr.length;
		for (int r = 1; r <= rot; r++) {
			int last = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = last;

		}
		disp(arr);
	}

	public static void rev2(int[] arr, int s, int e) {
		int start = s;
		int end = e;
		while (start < end) {
//			swap!!
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
//			Update!!
			start++;
			end--;
		}
	}
	public static void rot2(int[] arr, int rot) {

		rot = rot % arr.length;
		if (rot < 0)
			rot = rot + arr.length;
		
//		Step 1: Divide the array into 2 parts, body and a cap and then reverse them 
//		reverse Body!!
		rev2(arr,0,arr.length-1-rot);
//		reverse the cap
		rev2(arr,arr.length-rot,arr.length-1);
//		disp(arr);
		
//		Step 2: rotate whole array!!
		rev2(arr,0,arr.length-1);
//		disp(arr);
	}
}
