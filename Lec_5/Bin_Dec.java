package Lec_5;

public class Bin_Dec {
	public static void main(String[] args) {
		int n = 1001011;
		int pow = 1;
		int ans = 0;
		while (n>0) {
			int digit = n % 10;
			n = n / 10;
			ans = ans + digit * pow;
			pow = pow * 2;
		}
		System.out.println(ans);
	}
}
