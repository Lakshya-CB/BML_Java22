package Lec_7;

import java.util.Scanner;

public class Inc_Dec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		boolean Inc = false;
		boolean ans = false;
		int prev = 1000000000;
		while (N > 0) {
			int in = scn.nextInt();
			if (Inc && in < prev) {
				ans = true;
				System.out.println("false");
				break;
			}
			if (in == prev) {
				ans = true;
				System.out.println("false");
				break;
			}
			if (in > prev) {
				Inc = true;
			}
//			System.out.println(Inc);

			prev = in;
			N--;
		}
		if (ans == false) {
			System.out.println("true");
		}
	}
}
