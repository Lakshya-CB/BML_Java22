package Lec_32;

import java.util.Arrays;

public class Type_3_Coin {
	public static void main(String[] args) {
		int[] coins = { 3, 1, 2, 3, 3, 3, 3, 4 };

//		sort!!
		Arrays.sort(coins);
		solve_comb_wrt_C_T3(false, 0, coins, 4, "");

	}
//	Combintaion!!
//	wrt coin 

	public static void solve_comb_wrt_C_T3(boolean prev_sel, int curr, int[] coins, int target, String path) {
		if (target == 0) { // +ve B.C
			System.out.println(path);
			return;
		}
		if (target < 0 || curr == coins.length) {
			return;
		}
		if (curr > 0 && coins[curr] == coins[curr - 1] && prev_sel == false) {
			solve_comb_wrt_C_T3(false, curr + 1, coins, target, path); // Excluding!!

		} else {
			solve_comb_wrt_C_T3(true, curr + 1, coins, target - coins[curr], path + coins[curr] + " "); // Including!!
			solve_comb_wrt_C_T3(false, curr + 1, coins, target, path); // Excluding!!
		}
	}

//	wrt user
	public static void solve_comb_T3(int last_idx, int[] coins, int target, String path) {
		if (target == 0) {
			System.out.println(path);
			return;
		}
		if (target < 0) {
			return;
		}
		for (int idx = last_idx + 1; idx < coins.length; idx++) {
//			curr coin is coins[idx]
			if (idx == last_idx + 1 || coins[idx] != coins[idx - 1]) {
				solve_comb_T3(idx, coins, target - coins[idx], path + coins[idx] + " ");
			}
		}
	}
}
