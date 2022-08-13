package Lec_60_DP;

public class Coin_change {
	public static void main(String[] args) {
		int A = 10;
		int[] coins = { 2, 5, 3, 6 };

			int ans = Coin_TD(coins, 0, A, new Integer[coins.length][A+1] );
//			System.out.println(ans +" ====");
			System.out.println(coin_BU(coins, A));
			
	}

	public static int Coin_TD(int[] coins, int i, int A, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || i == coins.length) {
			return 0;
		}
		if (dp[i][A] != null) {
			return dp[i][A];
		}
		int sp1 = Coin_TD(coins, i, A - coins[i], dp);
		int sp2 = Coin_TD(coins, i + 1, A, dp);
		dp[i][A] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int coin_BU(int[] coins, int Amount) {
		int[][] dp = new int[coins.length + 1][Amount + 1];
		for (int i = coins.length - 1; i >= 0; i--) {
			for (int A = 0; A <= Amount; A++) {
				if (A == 0) {
					dp[i][A] = 1;
					continue;
				}
//				i, A
				int sp1 = 0;
				if (A >= coins[i]) {
					sp1 = dp[i][A - coins[i]];
				}
				int sp2 = dp[i + 1][A];
				dp[i][A] = sp1 + sp2;
			}
		}
		return dp[0][Amount];
	}
}
