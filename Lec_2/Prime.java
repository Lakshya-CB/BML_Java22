package Lec_2;

public class Prime {
	public static void main(String[] args) {
		int num = 2000000001;

		int div = 1;

		int count_factor = 0;
		while (div <= num) {
//			System.out.println(div);
			if (num % div == 0) {
//				Current div is a factor!!!
//				System.out.println(div);
				count_factor++;
			}

			div++;
		}
		System.out.println("=============");
//		System.out.println(count_factor);
		if (count_factor == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime ");
		}

	}
}
