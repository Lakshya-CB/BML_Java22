package Lec_22_23;

public class English_Rueler {
	public static void main(String[] args) {
//		Pat(2);
		ER(3, 5);
	}

	public static void ER(int MT, int L) {
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < MT; j++) {
				System.out.print("-");
			}
			System.out.println(i);
			Pat(MT - 1);
		}
		for (int j = 0; j < MT; j++) {
			System.out.print("-");
		}
		System.out.println(L);
	}

	public static void Pat(int n) {
//		BP : Pat(n)
//		SP : Pat(n-1);
		if (n == 0) {
			return;
		}
		Pat(n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
		Pat(n - 1);
	}
}
