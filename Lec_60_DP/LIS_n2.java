package Lec_60_DP;

public class LIS_n2 {
	public static void main(String[] args) {
		int[] nums = { 0, 3, 1, 6, 2, 2, 7 };
		System.out.println(lengthOfLIS(nums, 0, -1, ""));
	}

	public static int lengthOfLIS(int[] nums, int s, int prev, String path) {
		if (s == nums.length) {
			System.out.println(path);
			return 0;
		}
		int sp1 = 0;
		if (prev == -1 || nums[s] > nums[prev]) {
			sp1 = 1 + lengthOfLIS(nums, s + 1, s, path + nums[s]); // select the nums[s]
		}
		int sp2 = lengthOfLIS(nums, s + 1, prev, path); // not select;

		return Math.max(sp1, sp2);
	}

	public static int lengthOfLIS(int[] nums, int s, int prev, Integer[][] dp) {
//		current solution of s,prev in index  s,prev+1!!
		if (s == nums.length) {
			return 0;
		}
		if (dp[s][prev+1] != null) {
			return dp[s][prev+1];
		}
		int sp1 = 0;
		if (prev == -1 || nums[s] > nums[prev]) {
			sp1 = 1 + lengthOfLIS(nums, s + 1, s, dp); // select the nums[s]
		}
		int sp2 = lengthOfLIS(nums, s + 1, prev, dp); // not select;
		dp[s][prev+1] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
}
