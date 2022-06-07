package Lec_32;

public class Coin_Denom {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 3, 4 };
//		solve_comb(0, coins, 4, "");
//		System.out.println("========");
//		solve_perm(coins, 4, "");
//		solve_comb_wrt_C(0, coins, 4, "");
		solve_comb_T2(-1, coins, 4, "");
	}

//	T-1 , infinite supply combi , wrt user
	public static void solve_comb(int last_idx, int[] coins, int target, String path) {
		if (target == 0) {
			System.out.println(path);
			return;
		}
		if (target < 0) {
			return;
		}
		for (int idx = last_idx; idx < coins.length; idx++) {
//			curr coin is coins[idx]
			solve_comb(idx, coins, target - coins[idx], path + coins[idx] + " ");
		}
	}

//	T-1 , infinite supply perm , wrt user
	public static void solve_perm(int[] coins, int target, String path) {
		if (target == 0) {
			System.out.println(path);
			return;
		}
		if (target < 0) {
			return;
		}
		for (int idx = 0; idx < coins.length; idx++) {
//			curr coin is coins[idx]
			solve_perm(coins, target - coins[idx], path + coins[idx] + " ");
		}
	}

//	T-1 , infinite supply combi , wrt coin
	public static void solve_comb_wrt_C(int curr, int[] coins, int target, String path) {
		if (target == 0) { // +ve B.C
			System.out.println(path);
			return;
		}
		if (target < 0 || curr == coins.length) {
			return;
		}
		solve_comb_wrt_C(curr, coins, target - coins[curr], path + coins[curr] + " "); // Including!!
		solve_comb_wrt_C(curr + 1, coins, target, path); // Excluding!!
	}
//	T-2 , supply is Finite!! // coins are unique!!
//	wrt User for permutation use boolean array with back tracking!!

//	wrt user for combination !!
	public static void solve_comb_T2(int last_idx, int[] coins, int target, String path) {
		if (target == 0) {
			System.out.println(path);
			return;
		}
		if (target < 0) {
			return;
		}
		for (int idx = last_idx + 1; idx < coins.length; idx++) {
//			curr coin is coins[idx]
			solve_comb_T2(idx, coins, target - coins[idx], path + coins[idx] + " ");
		}
	}

//	T-2 : finite supply wrt coin  unique coins!!
	public static void solve_comb_wrt_C_T2(int curr, int[] coins, int target, String path) {
		if (target == 0) { // +ve B.C
			System.out.println(path);
			return;
		}
		if (target < 0 || curr == coins.length) {
			return;
		}
		solve_comb_wrt_C_T2(curr + 1, coins, target - coins[curr], path + coins[curr] + " "); // Including!!
		solve_comb_wrt_C_T2(curr + 1, coins, target, path); // Excluding!!
	}
	

}
