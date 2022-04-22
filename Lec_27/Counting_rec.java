package Lec_27;

public class Counting_rec {
	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			Count(i, 100);
//		}
//		Count(0,100);
		for (int i = 1; i <= 9; i++) {
			Jumping(i, 105);
			System.out.println("===============");
		}
	}

	public static void Count(int n, int limit) {
		if (n > limit) {
			return;
		}

		System.out.println(n);
		int i = 0;
		if (n == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Count(n * 10 + i, limit);

		}

	}

	public static void Jumping(int n, int limit) {
		if (n > limit) {
			return;
		}
		int digit = n % 10; // 3
		System.out.println(n);
		if (digit > 0) {
			Jumping(n * 10 + digit - 1, limit); // 30+ 2
		}
		if (digit < 9) {
			Jumping(n * 10 + digit + 1, limit); // 30+ 4
		}

	}
	
}
