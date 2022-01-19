package Lec_7;

public class Inv {
	public static void main(String[] args) {
		int num = 23145;
		int pos = 1;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;

			ans = ans + (int) (pos * Math.pow(10, digit - 1));
			System.out.println(digit + " _ " + pos);

			pos++;
		}
		System.out.println(ans);

	}
}
