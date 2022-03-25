package Lec_22;

public class English_Rueler {
	public static void main(String[] args) {
		Pat(3);
	}

	public static void Pat(int n) {
//		BP : Pat(n)
//		SP : Pat(n-1);
		if(n==0) {
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
