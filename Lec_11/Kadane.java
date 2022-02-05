package Lec_11;

public class Kadane {
	public static void main(String[] args) {
		int[] arr = { 11, 2, -3, 8, 5, -24, 7, 4, -11 };
//		System.out.println(maxSum(arr));
		int[] srted = { 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71 };
		System.out.println(binarySearch(srted, 42));

	}

	public static int maxSum(int[] arr) {
		int sum = 0;
		int maxsum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			if (sum > maxsum) {

				maxsum = sum;
			}
			System.out.println("sum till index " + i + " => " + sum);
		}
		return maxsum;
	}

	public static int binarySearch(int[] arr, int boda) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			System.out.println(s + " , " + arr[mid] + " , " + e + "  ===  " + boda);
			if (arr[mid] == boda) {
				return mid;
			} else if (arr[mid] < boda) {
				s = mid + 1;
			} else { // arr[mid]>boda!!
				e = mid - 1;
			}
		}
		return -1;
	}

	public int firstBadVersion(int n) {
		int s = 1;
		int e = n;
		int ans = n;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (isBad(mid)) {
				ans = mid;
				e = mid-1;
			}else{
				s = mid+1;
			}
		}
		return ans;
	}

	public boolean isBad(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
