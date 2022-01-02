package Lec_2;

public class Rev {
	public static void main(String[] args) {

		int num = 123456;
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			System.out.println(digit);
			num = num / 10;
			rev = rev * 10 + digit;
		}
		System.out.println(rev);
	}
}
