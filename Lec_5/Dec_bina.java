package Lec_5;

public class Dec_bina {
	public static void main(String[] args) {
		int n = 75;
		int mult = 1;
		int ans = 0;
		while (n > 0) {

			int rem = n % 2;
			n = n / 2;

			ans = ans + rem * mult;
			mult = mult * 10;
		}
		System.out.println(ans);
	}
}
