package Lec_21;

public class Rec_1 {
	public static void main(String[] args) {
//		PD(4);
//		PDI(4);
		PID(1,20);

	}

	public static void PD(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}

		System.out.println(n);
		PD(n - 1);

	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
//		if(n==1) {
//			System.out.println(1);
//			System.out.println(1);
//			return;
//		}
//		BP : PDI(n)
//		SP : PDI(n-1)
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);

	}

	public static void PID(int n, int limit) {
		if (n == limit + 1) {
			return;
		}
//		BP : PID(1)(n)!!
//		SP : PID(2)(n+1)!!
		System.out.println(n);
		PID(n + 1, limit);
		System.out.println(n);
	}
}
