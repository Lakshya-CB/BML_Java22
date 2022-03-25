package Lec_20;

public class Rec_basics {
	public static void main(String[] args) {
//		PD(4);
		PI(4);
	}

	public static void PD(int n) {
		if (n == 0) {
//			Smallest problem!! used to stop further division of PD(o)
//			Base case!!
			return;
		}
//		BP : PD(n)
//		SP : PD(n-1)

		System.out.println(n);
		PD(n - 1);

	}

	public static void PI(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)

		PI(n - 1);
		System.out.println(n);
	}
}
