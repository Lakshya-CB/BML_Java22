package Lec_3;

public class Pat_9 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;

		int nsp = n - 1;
		int nst = 1;
		while (row <= n) {
//	print space!!
			int csp = 1;// current space!!
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
//	print star!!
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			row++;
			System.out.println();
			nsp--;
			nst = nst + 2;
		}
	}
}
