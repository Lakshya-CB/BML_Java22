package Lec_8;

public class Armstrong {
	public static void main(String[] args) {
		printArm(1000);
	}

	public static void printArm(int i) {
		for (int j = 1; j <= i; j++) {
			if (isArm(j)) {
				System.out.println(j);
			}
		}
	}

	public static boolean isArm(int j) {
// Write your code here
		int nod = nod(j);
		int copy = j;
		int sum = 0;
		while (j != 0) {

			int digit = j % 10;
			sum = sum + (int) Math.pow(digit, nod);
			j = j / 10;
		}
		if (sum == copy) {
			return true;
		}
//		System.out.println("hubla habla");

		return false;

	}

	public static int nod(int num) {
		// Write your code here
		int ans = 0;
		while (num != 0) {
			ans++;
			num = num / 10;

		}
		return ans;
	}
}
