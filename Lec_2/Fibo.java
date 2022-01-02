package Lec_2;

public class Fibo {
	public static void main(String[] args) {
		int n = 8;
		int count = 1;

		int a = 0;
		int b = 1;
		while (count <= n) {
			int c = a + b;
			System.out.println(a);
			a = b;
			b = c;
			count++;
		}

	}
}
