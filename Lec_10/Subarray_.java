package Lec_10;

public class Subarray_ {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		for(int i=0;i<arr.length;i++) {
			int sum =0;
			for(int j=i;j<arr.length;j++) {
//				for(int ll=i;ll<=j;ll++) {
//					sum =sum+arr[ll];
//				}
				sum=sum+arr[j];
				disp(arr, i, j);
				System.out.println(" ===> " +sum);
			}
		}
	}
	public static void disp(int[] arr, int s, int e) {
		while(s<=e) {
			System.out.print(arr[s]+ " ");
			s++;
		}
//		System.out.println();
	}
}
