package Lec_4;

public class Pat_33 {
	public static void main(String[] args) {

		int n = 10;
		int row = 1;

		int nsp = n - 1;
		int nst = 1;
		int num_row = n;

		while (row <= n) {
//	print space!!
			int csp = 1;// current space!!
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
//	print star!!
			int num = num_row;
			int cst = 1;
			while (cst <= nst) {
				if (num == 10) {
					System.out.print(0 + "\t");
					
				} else {
					System.out.print(num + "\t");
				}
				cst++;
				if (cst > nst / 2 + 1) {
					num--;
				} else {
					num++;
				}
			}

			row++;
			System.out.println();
//			num++;
			num_row--;
			nsp--;
			nst = nst + 2;
		}
	}
}