package Lec_59_DP;

public class Coin_Change {
	public static void main(String[] args) {
		int A = 10;
		int[] coins = { 2, 5, 3, 6 };

//		int ans = Coin(coins, 0, A);
//		int ans = Coin(coins, 0, A, "");
//		System.out.println(ans +" ====");
	}

//	public static int Coin(int[] coins, int i, int A, String path) {
//
//		if (A == 0) {
//			System.out.println(path);
//			return 1;
//		}
//		if (A < 0 || i == coins.length) {
//			return 0;
//		}
//		int sp1 = Coin(coins, i, A - coins[i], path + coins[i]);
//		int sp2 = Coin(coins, i + 1, A, path);
//
//		return sp1 + sp2;
//	}

	public static int Coin_TD(int[] coins, int i, int A, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || i == coins.length) {
			return 0;
		}
		if(dp[i][A]!=null) {
			return dp[i][A];
		}
		int sp1 = Coin_TD(coins, i, A - coins[i], dp);
		int sp2 = Coin_TD(coins, i + 1, A, dp);
		dp[i][A] = sp1 + sp2;
		return sp1 + sp2;
	}
}
