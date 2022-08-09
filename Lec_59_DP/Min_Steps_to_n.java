package Lec_59_DP;

public class Min_Steps_to_n {
	public static void main(String[] args) {
		int n = 13000000;
		System.out.println(Steps_TD(n, new Integer[n + 2]));
		System.out.println(Steps_BU(n));
	}

	public static int Steps_TD(int n, Integer[] dp) {
		if (n == 1) {
			return 0;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		if (n % 2 == 0) {
			dp[n] = 1 + Steps_TD(n / 2, dp);
			return dp[n];
		} else {
			int sp1 = Steps_TD(n - 1, dp);
			int sp2 = Steps_TD(n + 1, dp);
			dp[n] = Math.min(sp1, sp2) + 1;
			return Math.min(sp1, sp2) + 1;
		}
	}

	public static int Steps_BU(int nth) {
		int[] dp = new int[nth+1];
//		dp[0]=0;
		for (int n = 2; n <= nth; n++) {
//			dp[n]=Steps(n)
			if (n % 2 == 0) {
				dp[n] = 1 + dp[n / 2];
			} else {
				int sp1 = dp[n - 1];
				int sp2 = dp[(n + 1)/2]+1;
				dp[n] = Math.min(sp1, sp2) + 1;
			}
		}
		return dp[nth];

	}
}
