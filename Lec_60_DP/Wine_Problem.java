package Lec_60_DP;

public class Wine_Problem {
	public static void main(String[] args) {
		int[] wines = { 2, 3, 5, 1, 4 };
//		System.out.println(Sell(wines, 0, wines.length - 1));
		System.out.println(Sell_BU(wines));
	}

	public static int Sell(int[] wines, int s, int e, int day) {
		if (s > e) {
			return 0;
		}
		int sp1 = wines[s] * day + Sell(wines, s + 1, e, day + 1);
		int sp2 = wines[e] * day + Sell(wines, s, e - 1, day + 1);
		return Math.max(sp1, sp2);

	}

	public static int Sell(int[] wines, int s, int e, Integer[][] dp) {
		if (s > e) {
			return 0;
		}
		if (dp[s][e] != null) {
			return dp[s][e];
		}
		int day = 1 + wines.length - (e - s + 1);
		int sp1 = wines[s] * day + Sell(wines, s + 1, e, dp);
		int sp2 = wines[e] * day + Sell(wines, s, e - 1, dp);
		dp[s][e] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int Sell_BU(int[] wines) {
		int[][] dp = new int[wines.length + 1][wines.length];
		for (int s = wines.length - 1; s >= 0; s--) {
			for (int e = 0; e < wines.length; e++) {
//				 s,e
				if (s > e) {
					dp[s][e] = 0;
					continue;
				}
				int day = 1 + wines.length - (e - s + 1);
				int sp1 = wines[s] * day + dp[s + 1][e];
				int sp2 = 0;
				if (e >= 1) {
					sp2 = wines[e] * day + dp[s][e - 1];
				}
				dp[s][e] = Math.max(sp1, sp2);
			}
		}
		return dp[0][wines.length - 1];
	}

}
