package Lrc_17_18;

public class Poly {
	public static void main(String[] args) {
		int x = 7;
		int n = 3;

		int exp = x;
		int sum = 0;

		for (int c = n; c >= 1; c--) {
			int term = c * exp;
			exp = exp * x;
			sum = sum + term;
		}
		System.out.println(sum);
	}
}
