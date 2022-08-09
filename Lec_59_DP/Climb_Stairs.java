package Lec_59_DP;

public class Climb_Stairs {
	public static void main(String[] args) {
		System.out.println(move_TD(0, 3,new Integer[3]));
		System.out.println(move_BU(3));
		
	}

	public static int move_TD(int curr, int n, Integer[] dp) {
		if (curr > n) { // -ve
			return 0;
		}
		if (curr == n) {
			return 1;
		}
		if (dp[curr] != null) {
			return dp[curr];
		}
		int sp1 = move_TD(curr + 1, n, dp);
		int sp2 = move_TD(curr + 2, n, dp);
		dp[curr] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int move_BU(int n) {
		int[] dp = new int[n+2];
		dp[n] = 1;
		dp[n + 1] = 0;
		for (int curr = n - 1; curr >= 0; curr--) {
//			smallest to biggest!!
//			dp[curr]=move(curr, n)
			int sp1 = dp[curr + 1];
			int sp2 = dp[curr + 2];
			dp[curr] = sp1 + sp2;
		}
		return dp[0];
	}

}
