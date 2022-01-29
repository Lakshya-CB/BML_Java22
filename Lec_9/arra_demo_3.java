package Lec_9;

public class arra_demo_3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		int[] other = arr;
		System.out.println(other);
		System.out.println(arr);
		
		other[1]= 99;
		System.out.println(arr[1]);
	}
}
