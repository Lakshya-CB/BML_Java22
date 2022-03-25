package Lec_Doubts;

import java.util.Arrays;

public class ZigZag_2 {
//	https://leetcode.com/problems/zigzag-conversion/
	public static void main(String[] args) {
		solve("PAYPALISHIRING ", 3);
	}

	public static void solve(String str, int numR) {
		char[][] arr = new char[numR][str.length()];

		int r = 0, c = 0;
		int index = 0;
		while (true) {
//			System.err.println("Begin");
			while (index < str.length() && r < arr.length - 1) {
				arr[r][c] = str.charAt(index);
				index++;
				r++;

			}
//			System.err.println("DONBE!" + "{" + r + "," + c + "}");
			while (index < str.length() && r > 0 && c < arr[r].length) {
				arr[r][c] = str.charAt(index);
				index++;
				r--;
				c++;
			}
//			System.err.println("END");
			if (index == str.length()) {
//				print!!
				for(char[] RR : arr) {
					System.out.println(Arrays.toString(RR));
				}
				
				break;
			}
		}
	}
}
