package Lec_3;

public class Pat_15 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		
		int nst = n;
		int nsp = 0;
		while (row <= 2 * n - 1) {

			int csp = 1;
			while(csp<= nsp) {
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
			if(row>n) {
				nsp=nsp-2;
				nst++;
			} else {
				nsp=nsp+2;
				nst--;
				
			}
		}
	}
}
