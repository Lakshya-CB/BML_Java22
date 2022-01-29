package Lec_9;

public class array_demo {
	public static void main(String[] args) {
		int a1 = 1;
		int[] arr = new int[5];
		System.out.println(arr);
//		Size of arr?!
		int len = arr.length;
		System.out.println(len);
//		Indexing?!!?
		System.out.println(arr[0]);
//		Find value of last element?!
		int last = arr[arr.length - 1];
		System.out.println(last);
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx]+ " ");
		}
		System.out.println();

//		
//		System.out.println(arr[-1]);
		
		System.out.println("============");
//		Enhanced loop , or for each loop.
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
