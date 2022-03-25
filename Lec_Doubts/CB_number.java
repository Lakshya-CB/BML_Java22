package Lec_Doubts;

import java.util.Arrays;
import java.util.Scanner;

public class CB_number {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ll = scn.nextInt();
		String str = scn.next();
		System.out.println(solve(str));
//		System.out.println(isCB(13*2));
	}

	public static int solve(String str) {
		int ans = 0;
		boolean[] selected = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int s = 0; s < str.length(); s++) {
				if (s + len > str.length()) {
					break;
				}
				String num_str = str.substring(s, s + len);
				Long num = Long.parseLong(num_str);
				boolean flag_used = false;
				for (int i = s; i < s + len; i++) {
					if (selected[i]) {
						flag_used = true;
						break;
					}
				}

				if (flag_used == false && isCB(num)) {
					for (int i = s; i < s + len; i++) {
						selected[i] = true;
					}

//					System.out.println(num);

					ans++;
				}
			}
		}
		return ans;
	}

	public static boolean isCB(Long num) {
//		point 1
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
//		point 2
		for (int n : arr) {
			if (num == n) {
				return true;
			}
		}
//		point 3
		for (int n : arr) {

			if (num % n == 0) {
				return false;
			}
		}
		return true;
	}
}
