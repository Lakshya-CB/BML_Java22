package Lec_22;

public class Rec_2 {
	public static void main(String[] args) {
//		System.out.println(Fac(5));
		System.out.println(exp(7, 3));
	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
		int sp = Fac(n - 1);
		return n * sp;
	}

	public static int exp(int x, int n) {
		if (n == 1) {
			return x;
		}
		int sp = exp(x, n - 1);
		return sp * x;
	}

	public static int Fib(int n) {
//		BP : Fib(n)
//		SP : Fib(n-1) + Fib(n-2)
		if (n <= 1) {
			return n;
		}
		int sp1 = Fib(n - 1);
		int sp2 = Fib(n - 2);

		return sp1 + sp2;
	}
}
