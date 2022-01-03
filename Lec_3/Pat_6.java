package Lec_3;

public class Pat_6 {
	public static void main(String[] args) {
		int n = 9;
		int row = 1;

		int nsp = 0;
		int nst = n;
		while (row <= n) {
//		print space!!
			int csp = 1;// current space!!
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
//		print star!!
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			row++;
			System.out.println();
			nsp = nsp + 2;
			nst--;
		}
	}
}
