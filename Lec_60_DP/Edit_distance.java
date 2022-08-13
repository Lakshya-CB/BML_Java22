package Lec_60_DP;

public class Edit_distance {
	public static void main(String[] args) {
		System.out.println(minDistance("abc", "ac", 0, 0, ""));
	}

	public static int minDistance(String word1, String word2, int i1, int i2, Integer[][] dp) {
		if (i1 == word1.length() && i2 == word2.length()) {
			return 0;
		}
		if (i1 == word1.length() || i2 == word2.length()) {
			int L1 = word1.length() - i1;
			int L2 = word2.length() - i2;
			return Math.max(L1, L2);
		}
		if (dp[i1][i2] != null) {
			return dp[i1][i2];
		}
		if (word1.charAt(i1) == word2.charAt(i2)) {
			dp[i1][i2] = minDistance(word1, word2, i1 + 1, i2 + 1, dp);
			return dp[i1][i2];
		} else {
			int Ins = minDistance(word1, word2, i1, i2 + 1, dp);
			int Del = minDistance(word1, word2, i1 + 1, i2, dp);
			int Rep = minDistance(word1, word2, i1 + 1, i2 + 1, dp);
			dp[i1][i2] = Math.min(Del, Math.min(Ins, Rep)) + 1;

			return Math.min(Del, Math.min(Ins, Rep)) + 1;
		}
	}

	public static int minDistance(String word1, String word2, int i1, int i2, String path) {
		if (i1 == word1.length() && i2 == word2.length()) {
			System.out.println(path);
			return 0;
		}
		if (i1 == word1.length() || i2 == word2.length()) {
			int L1 = word1.length() - i1;
			int L2 = word2.length() - i2;
			System.out.println(path + Math.max(L1, L2));
			return Math.max(L1, L2);
		}
		if (word1.charAt(i1) == word2.charAt(i2)) {
			return minDistance(word1, word2, i1 + 1, i2 + 1, path + "S");
		} else {
			int Ins = minDistance(word1, word2, i1, i2 + 1, path + "I");
			int Del = minDistance(word1, word2, i1 + 1, i2, path + "D");
			int Rep = minDistance(word1, word2, i1 + 1, i2 + 1, path + "R");
			return Math.min(Del, Math.min(Ins, Rep)) + 1;
		}
	}

	public static int minDistance_BU(String word1, String word2) {
		int[][] dp = new int[word1.length() + 1][word2.length() + 1];
		for (int i1 = word1.length(); i1 >= 0; i1--) {
			for (int i2 = word2.length(); i2 >= 0; i2--) {
//			i1, i2	
				if (i1 == word1.length() || i2 == word2.length()) {
					int L1 = word1.length() - i1;
					int L2 = word2.length() - i2;

					dp[i1][i2] = Math.max(L1, L2);
				} else if (word1.charAt(i1) == word2.charAt(i2)) {
					dp[i1][i2] = dp[i1 + 1][i2 + 1];
				} else {
					int Ins = dp[i1][i2 + 1];
					int Del = dp[i1 + 1][i2];
					int Rep = dp[i1 + 1][i2 + 1];
					dp[i1][i2] = Math.min(Del, Math.min(Ins, Rep)) + 1;
				}
			}
		}
		return dp[0][0];
	}

}
