package Lec_59_DP;

public class Fibo_series {

	public static void main(String[] args) {
//		System.out.println(Fibo(50));
//		System.out.println(Fibo(20000, new int[20000 + 1]));
		System.out.println(Fibo_BU(200000));
	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
//		BP : Fibo(n)
//		SP : FIbo(n-1)
//			: Fibo(n-2)
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}

	public static int Fibo_TD(int n, int[] dp) {
		if (n <= 1) {
			return n;
		}
//		BP : Fibo(n)
//		SP : FIbo(n-1)
//			: Fibo(n-2)
		if (dp[n] != 0) {
			return dp[n];
		}
		int sp1 = Fibo_TD(n - 1, dp);
		int sp2 = Fibo_TD(n - 2, dp);
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int Fibo_BU(int nth) {
		int[] dp = new int[nth + 1];
		dp[0] = 0;
		dp[1] = 1;
//		 smallest to biggest problem!!
		for (int n = 2; n <= nth; n++) {
//	solve the nth recursive problem!!
//			Fibo(n)
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2;
		}
		return dp[nth];
	}
}
